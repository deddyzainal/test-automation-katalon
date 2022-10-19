import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Login
WebUI.callTestCase(findTestCase('FE/Partner/Backoffice/Login with valid credential'), [:], FailureHandling.STOP_ON_FAILURE)

//Click menu Sales
WebUI.callTestCase(findTestCase('FE/Partner/Backoffice/Click menu Sales'), [:], FailureHandling.STOP_ON_FAILURE)

//Click menu Request
WebUI.callTestCase(findTestCase('FE/Partner/Backoffice/Click menu Request'), [:], FailureHandling.STOP_ON_FAILURE)

//Filter list by No HP
WebUI.callTestCase(findTestCase('FE/Partner/Backoffice/Filter list by No HP'), [('nohp') : GlobalVariable.timestamp], FailureHandling.STOP_ON_FAILURE)

//Approve request
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Request/Approve request'), [:], FailureHandling.STOP_ON_FAILURE)

