import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable


def slurper = new JsonSlurper()

// Login to Backoffice as superadmin
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

// Assign loan to stg_ca
assignLoanCA = WS.sendRequest(findTestObject('BE/Backoffice/Assign Loan ID to stg_ca', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/submit_ca'
            , ('adminBearer') : GlobalVariable.adminBearer, ('loanID') : GlobalVariable.loanID]))

WS.verifyResponseStatusCode(assignLoanCA, 200)

// Login to Backoffice as stg_ca
caLoginResp = WS.sendRequest(findTestObject('BE/Backoffice/Login Backoffice', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/lancar/userservice/v2/auth/admin/api/v2/login-admin'
            , ('backofficeEmail') : GlobalVariable.CAemail, ('backofficePassword') : GlobalVariable.CApwd]))

WS.verifyResponseStatusCode(caLoginResp, 200)

caLoginBody = slurper.parseText(caLoginResp.getResponseBodyContent())

String caBearer = caLoginBody.data.session.toString()

GlobalVariable.caBearer = caBearer

System.out.println(GlobalVariable.caBearer)

// Get Credit Analyst Tasks List
taskListResp = WS.sendRequest(findTestObject('BE/Backoffice/Get Credit Analyst Tasks List', [('requestURL') : GlobalVariable.requestURL
            , ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/list/ca', ('caBearer') : GlobalVariable.caBearer]))

WS.verifyResponseStatusCode(taskListResp, 200)

taskListBody = slurper.parseText(taskListResp.getResponseBodyContent())

//String loanID = taskListBody.data.find({(it.user_name == 'Debby Anggraini') && (it.loan_status_name == 'SUBMITTED')}).loan_id.toString()
String loanNumber = taskListBody.data.find({ 
        (it.user_name == 'Debby Anggraini') && (it.loan_status_name == 'SUBMITTED')
    }).loan_number.toString()

String borrowerID = taskListBody.data.find({ 
        (it.user_name == 'Debby Anggraini') && (it.loan_status_name == 'SUBMITTED')
    }).user_id.toString()

//GlobalVariable.loanID = loanID
GlobalVariable.loanNumber = loanNumber

GlobalVariable.borrowerID = borrowerID

System.out.println(GlobalVariable.loanID)

System.out.println(GlobalVariable.loanNumber)

System.out.println(GlobalVariable.borrowerID)

// Generate Data Pefindo
dataPefindoResp = WS.sendRequest(findTestObject('BE/Backoffice/Get Data Pefindo', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/bureau_module/payment_profile'
            , ('loanID') : GlobalVariable.loanID, ('caBearer') : GlobalVariable.caBearer]))

WS.verifyResponseStatusCode(dataPefindoResp, 200)

// Update progress to Bureau Module
bureauModuleResp = WS.sendRequest(findTestObject('BE/Backoffice/Save Bureau Module', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/bureau_module/save'
            , ('loanID') : GlobalVariable.loanID, ('caBearer') : GlobalVariable.caBearer]))

WS.verifyResponseStatusCode(bureauModuleResp, 200)

// Update data in Modul Penghasilan
incomeModuleResp = WS.sendRequest(findTestObject('BE/Backoffice/Update Modul Penghasilan', [('requestURL') : GlobalVariable.requestURL
            , ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/income_module/upsert', ('loanID') : GlobalVariable.loanID
            , ('caBearer') : GlobalVariable.caBearer]))

WS.verifyResponseStatusCode(incomeModuleResp, 200)

// Get data object of loan detail
loanDetailResp = WS.sendRequest(findTestObject('BE/Backoffice/Get Loan Detail', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/loan_detail'
            , ('loanID') : GlobalVariable.loanID, ('caBearer') : GlobalVariable.caBearer]))

WS.verifyResponseStatusCode(loanDetailResp, 200)

loanDetailBody = slurper.parseText(loanDetailResp.getResponseBodyContent())

loanDetail = loanDetailBody.data

GlobalVariable.loanDetail = loanDetail

System.out.println(GlobalVariable.loanDetail)

// Update the loan detail

def loanDetailJson = JsonOutput.toJson(GlobalVariable.loanDetail)

updateLoanResp = WS.sendRequest(findTestObject('BE/Backoffice/Update Loan Detail', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/loan_detail/upsert'
            , ('loanID') : GlobalVariable.loanID, ('caBearer') : GlobalVariable.caBearer, ('loanDetail') : loanDetailJson]))

WS.verifyResponseStatusCode(updateLoanResp, 200)

// Update data in business assessment
updateBusinessResp = WS.sendRequest(findTestObject('BE/Backoffice/Update Business Assessment', [('requestURL') : GlobalVariable.requestURL
            , ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/business_assessment/upsert', ('loanID') : GlobalVariable.loanID
            , ('caBearer') : GlobalVariable.caBearer]))

WS.verifyResponseStatusCode(updateBusinessResp, 200)

// Update data in Post CUE Credit Criteria
updatePostCUEresp = WS.sendRequest(findTestObject('BE/Backoffice/Update Post CUE Credit Criteria', [('requestURL') : GlobalVariable.requestURL
            , ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/post_cue_credit_criteria/upsert', ('loanID') : GlobalVariable.loanID
            , ('caBearer') : GlobalVariable.caBearer]))

WS.verifyResponseStatusCode(updatePostCUEresp, 200)

// Update final approval
updateFinalResp = WS.sendRequest(findTestObject('BE/Backoffice/Update Final Approval', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/final_approval/upsert'
            , ('loanID') : GlobalVariable.loanID, ('caBearer') : GlobalVariable.caBearer]))

WS.verifyResponseStatusCode(updateFinalResp, 200)

// Approve the loan
approveLoanResp = WS.sendRequest(findTestObject('BE/Backoffice/Confirm Final Approval', [('requestURL') : GlobalVariable.requestURL
            , ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/assessment/final_approval/confirm', ('loanID') : GlobalVariable.loanID
            , ('caBearer') : GlobalVariable.caBearer]))

WS.verifyResponseStatusCode(approveLoanResp, 200)

// Send Offer Letter
offerLetterResp = WS.sendRequest(findTestObject('BE/Backoffice/Send Offer Letter', [('requestURL') : GlobalVariable.requestURL, ('endpoint') : '${requestURL}/loanservice/api/backoffice/v1/update_offer'
            , ('borrowerID') : GlobalVariable.borrowerID, ('loanNumber') : GlobalVariable.loanNumber, ('loanID') : GlobalVariable.loanID
            , ('adminBearer') : GlobalVariable.adminBearer]))

WS.verifyResponseStatusCode(offerLetterResp, 200)