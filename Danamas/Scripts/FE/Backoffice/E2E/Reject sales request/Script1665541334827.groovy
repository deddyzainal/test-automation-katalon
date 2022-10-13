import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Login
WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), [:], FailureHandling.STOP_ON_FAILURE)

//Click menu Sales
WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Sales'), [:], FailureHandling.STOP_ON_FAILURE)

//Click menu Request
WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Request'), [:], FailureHandling.STOP_ON_FAILURE)

//Filter list by No HP
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Request/Filter list by No HP'), [('nomor_hp') : no_hp], FailureHandling.STOP_ON_FAILURE)

//Approve request
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Request/Reject request'), [:], FailureHandling.STOP_ON_FAILURE)

//Verify status is Rejected
WebUI.refresh()
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Request/Filter list by No HP'), [('nomor_hp') : no_hp], FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestCase('FE/Backoffice/Sales/Request/List/TextValue - Status'), 'Rejected', FailureHandling.STOP_ON_FAILURE)