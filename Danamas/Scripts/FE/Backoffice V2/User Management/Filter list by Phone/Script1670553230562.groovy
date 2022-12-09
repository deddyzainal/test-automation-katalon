import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Input Phone
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/List/Input - Phone No'), phone, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

//Verify Phone value in the list match with inputted keyword
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/User Management/List/TextValue - Phone'), '+' + phone, FailureHandling.STOP_ON_FAILURE)

