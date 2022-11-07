import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Input Nama KJJP
CustomKeywords.'backoffice.common.setTextWithDelay'(findTestObject('FE/Backoffice/List KJPP/List/Input - Nama KJPP'), nama_kjpp)

WebUI.delay(3)

//Verify Nama KJPP on the list match with keyword
WebUI.verifyElementText(findTestObject('FE/Backoffice/List KJPP/List/TextValue - Nama KJPP'), nama_kjpp, FailureHandling.STOP_ON_FAILURE)