import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

def slurper = new JsonSlurper()

// Login to Backoffice to get bearer token
adminLoginResp = WS.sendRequest(findTestObject('BE/Backoffice/Login Backoffice', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/lancar/userservice/v2/auth/admin/api/v2/login-admin'
            , ('backofficeEmail') : GlobalVariable.backofficeEmail, ('backofficePassword') : GlobalVariable.backofficePassword]))

WS.verifyResponseStatusCode(adminLoginResp, 200)

adminLoginBody = slurper.parseText(adminLoginResp.getResponseBodyContent())

String adminBearer = adminLoginBody.data.session.toString()

GlobalVariable.adminBearer = adminBearer

System.out.println(GlobalVariable.adminBearer)

// Get Loan ID from Loan Assessment list
loanAssessListResp = WS.sendRequest(findTestObject('BE/Backoffice/Get Loan Assessment list', [('requestURL') : GlobalVariable.requestURL
            , ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/list', ('adminBearer') : GlobalVariable.adminBearer]))

WS.verifyResponseStatusCode(loanAssessListResp, 200)

loanAssessListBody = slurper.parseText(loanAssessListResp.getResponseBodyContent())

String loanID = loanAssessListBody.data.find({ 
        (it.user_name == 'Debby Anggraini') && (it.loan_status_name == 'SUBMITTED')
    }).loan_id.toString()

GlobalVariable.loanID = loanID

System.out.println(GlobalVariable.loanID)

// Assign Loan ID to stg_ca
def assignLoanCA = WS.sendRequest(findTestObject('BE/Backoffice/Assign Loan ID to stg_ca', [('requestURL') : GlobalVariable.requestURL
            , ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/submit_ca', ('adminBearer') : GlobalVariable.adminBearer
            , ('loanID') : GlobalVariable.loanID]))

WS.verifyResponseStatusCode(assignLoanCA, 200)

// Login to Backoffice as stg_ca
caLoginResp = WS.sendRequest(findTestObject('BE/Backoffice/Login Backoffice', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/lancar/userservice/v2/auth/admin/api/v2/login-admin'
            , ('backofficeEmail') : GlobalVariable.backofficeEmail, ('backofficePassword') : GlobalVariable.backofficePassword]))

WS.verifyResponseStatusCode(caLoginResp, 200)

caLoginBody = slurper.parseText(caLoginResp.getResponseBodyContent())

String caBearer = caLoginBody.data.session.toString()

GlobalVariable.caBearer = caBearer

System.out.println(GlobalVariable.caBearer)

// Get Dokumen Agunan list
dokAgunanResp = WS.sendRequest(findTestObject('BE/Backoffice/Get Dokumen Agunan List', [('requestURL') : GlobalVariable.requestURL, ('loanID') : GlobalVariable.loanID
            , ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/get-directory', ('caBearer') : GlobalVariable.caBearer]))

WS.verifyResponseStatusCode(dokAgunanResp, 200)

dokAgunanBody = slurper.parseText(dokAgunanResp.getResponseBodyContent())

String urlIMB = dokAgunanBody.data.find({ 
        it.name == 'IMB'
    }).url.toString()

GlobalVariable.urlIMB = urlIMB

System.out.println(GlobalVariable.urlIMB)

// Request IMB resubmission
reqResubmissionResp = WS.sendRequest(findTestObject('BE/Backoffice/Request IMB Resubmission', [('requestURL') : GlobalVariable.requestURL
            , ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/document-resubmission', ('caBearer') : GlobalVariable.caBearer
            , ('loanID') : GlobalVariable.loanID, ('urlIMB') : GlobalVariable.urlIMB]))

WS.verifyResponseStatusCode(reqResubmissionResp, 200)
