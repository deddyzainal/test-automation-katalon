import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

//Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

a = 0

while(Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload KTP'), 2, FailureHandling.OPTIONAL) && a<10) {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload KTP'), 3, FailureHandling.OPTIONAL)
	a++
}

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Capture Camera'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload File'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Button - Search'), 5)

Mobile.sendKeys(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), 'Debby')

Mobile.delay(2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Image - KTP Debby'), 5)

Mobile.waitForElementPresent(findTestObject('FE/LancarMobile/Android/Upload KTP/Image - Preview Image'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - BAIK'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Foto Ulang'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Capture Camera'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - BAIK'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Foto Ulang'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Capture Camera'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - BAIK'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - PROSES'), 5)