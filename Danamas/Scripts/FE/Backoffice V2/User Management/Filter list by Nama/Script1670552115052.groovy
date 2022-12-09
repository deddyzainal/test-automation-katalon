import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Input Nama User
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/List/Input - Nama'), nama, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

//Verify Nama User value in the list match with inputted keyword
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/User Management/List/TextValue - Name'), nama, FailureHandling.STOP_ON_FAILURE)

