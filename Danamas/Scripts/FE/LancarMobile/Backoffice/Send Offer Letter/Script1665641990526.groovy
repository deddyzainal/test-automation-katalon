import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

def slurper = new JsonSlurper()

// Login to Backoffice to get bearer token
adminLoginResp = WS.sendRequest(findTestObject('BE/Login Backoffice', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/lancar/userservice/v2/auth/admin/api/v2/login-admin'
            , ('backofficeEmail') : GlobalVariable.backofficeEmail, ('backofficePassword') : GlobalVariable.backofficePassword]))

WS.verifyResponseStatusCode(adminLoginResp, 200)

adminLoginBody = slurper.parseText(adminLoginResp.getResponseBodyContent())

String adminBearer = adminLoginBody.data.session.toString()

GlobalVariable.adminBearer = adminBearer

System.out.println(GlobalVariable.adminBearer)

// Get Loan ID, Loan Number, and Borrower ID from Loan Assessment list
loanAssessListResp = WS.sendRequest(findTestObject('BE/Get Loan Assessment List', [('requestURL') : GlobalVariable.requestURL
            , ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/list', ('adminBearer') : GlobalVariable.adminBearer]))

WS.verifyResponseStatusCode(loanAssessListResp, 200)

loanAssessListBody = slurper.parseText(loanAssessListResp.getResponseBodyContent())

String loanID = loanAssessListBody.data.find({ 
        (it.user_name == 'Debby Anggraini') && (it.loan_status_name == 'SUBMITTED')
    }).loan_id.toString()

String loanNumber = loanAssessListBody.data.find({ 
        (it.user_name == 'Debby Anggraini') && (it.loan_status_name == 'SUBMITTED')
    }).loan_number.toString()

String borrowerID = loanAssessListBody.data.find({ 
        (it.user_name == 'Debby Anggraini') && (it.loan_status_name == 'SUBMITTED')
    }).user_id.toString()

GlobalVariable.loanID = loanID

GlobalVariable.loanNumber = loanNumber

GlobalVariable.borrowerID = borrowerID

System.out.println(GlobalVariable.loanID)

System.out.println(GlobalVariable.loanNumber)

System.out.println(GlobalVariable.borrowerID)

approveLoanResp = WS.sendRequest(findTestObject('BE/Approve by Loan ID', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/loan/approve'
            , ('loanID') : GlobalVariable.loanID, ('userFullname') : 'Gara%20Handito', ('adminBearer') : GlobalVariable.adminBearer]))

WS.verifyResponseStatusCode(approveLoanResp, 200)

sendOfferResp = WS.sendRequest(findTestObject('BE/Send Offer Letter', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/update_offer'
            , ('borrowerID') : GlobalVariable.borrowerID, ('loanNumber') : GlobalVariable.loanNumber, ('loanID') : GlobalVariable.loanID
            , ('adminBearer') : GlobalVariable.adminBearer]))

WS.verifyResponseStatusCode(sendOfferResp, 200)