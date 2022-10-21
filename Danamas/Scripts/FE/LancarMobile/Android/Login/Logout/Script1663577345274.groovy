import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - Profile'), 5)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - KELUAR'), 5)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Login/Input - No Telepon'), 10)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Button - Back'), 3)