import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable

//Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload Selfie dengan KTP'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Capture Camera'), 2)

Mobile.waitForElementPresent(findTestObject('FE/LancarMobile/Android/Upload KTP/Image - Preview Image'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Unggah Foto Selfie'), 2)

Mobile.waitForElementNotPresent(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload Selfie dengan KTP'), 5, FailureHandling.STOP_ON_FAILURE)