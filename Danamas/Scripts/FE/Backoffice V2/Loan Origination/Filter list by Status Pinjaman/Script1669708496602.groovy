import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Select Status Pinjaman
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/List/Select - Status Pinjaman'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/List/Select - Option', [('option') : status_pinjaman]), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

//Verify Status Pinjaman on the list match with selected option
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/Loan Origination/List/TextValue - Status Pinjaman'), status_pinjaman.toUpperCase(), FailureHandling.STOP_ON_FAILURE)