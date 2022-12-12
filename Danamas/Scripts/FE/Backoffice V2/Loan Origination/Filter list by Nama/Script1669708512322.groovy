import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Input Nama User
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/List/Input - Nama'), nama, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

//Verify Nama User in the list match with inputted keyword
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/Loan Origination/List/TextValue - Nama User'), nama, FailureHandling.STOP_ON_FAILURE)

