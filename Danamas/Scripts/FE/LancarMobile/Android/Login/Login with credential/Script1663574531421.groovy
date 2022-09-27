import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - MASUK (Home)'), 10)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Input - No Telepon'), 5)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Login/Input - No Telepon'), phoneNumber, 2)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Button - MASUK (Login)'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Input - Kata Sandi'), 15)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Login/Input - Kata Sandi'), password, 2)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Button - MASUK (Login)'), 2)

Mobile.verifyElementExist(findTestObject('FE/LancarMobile/Android/Home/Button - COBA SEKARANG 1'), 10)