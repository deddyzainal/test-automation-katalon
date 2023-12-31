import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Login
WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), [('email') : GlobalVariable.BackofficeEmail
        , ('password') : GlobalVariable.BackofficePassword], FailureHandling.STOP_ON_FAILURE)

//Click menu Request
WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Request'), [:], FailureHandling.STOP_ON_FAILURE)

//Filter list by No HP
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Request/Filter list by No HP'), [('nomor_hp') : no_hp], FailureHandling.STOP_ON_FAILURE)

//Approve request
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Request/Reject request'), [:], FailureHandling.STOP_ON_FAILURE)

//Verify status is Rejected
WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Request/Filter list by No HP'), [('nomor_hp') : no_hp], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('FE/Backoffice/Sales/Request/List/TextValue - Status'), 'Rejected', FailureHandling.STOP_ON_FAILURE)

