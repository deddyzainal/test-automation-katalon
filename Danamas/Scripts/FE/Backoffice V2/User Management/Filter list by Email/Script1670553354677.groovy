import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Input Email
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/List/Input - Email'), email, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

//Verify Email value in the list match with inputted keyword
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/User Management/List/TextValue - Email'), email, FailureHandling.STOP_ON_FAILURE)

