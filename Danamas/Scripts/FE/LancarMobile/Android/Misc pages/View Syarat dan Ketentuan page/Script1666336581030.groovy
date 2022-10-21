import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - Hamburger Menu'), 5)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - Syarat dan Ketentuan Menu'), 5)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Misc pages/TextValue - Syarat dan Ketentuan 1st point'), 10)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Misc pages/Button - Back'), 3)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Home/Button - Hamburger Menu'), 3)