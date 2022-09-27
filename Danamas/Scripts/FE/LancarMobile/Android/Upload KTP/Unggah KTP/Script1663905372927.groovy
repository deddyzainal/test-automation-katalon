import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload KTP'), 3)

//if (Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload KTP'), 2)) {
//	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload KTP'), 3)
//}

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Capture Camera'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload File'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Button - Search'), 5)

Mobile.sendKeys(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), 'Debby')

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Image - KTP Debby'), 5)