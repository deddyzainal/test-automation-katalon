import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable


Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Home)'), 10)
Mobile.scrollToText('Syarat Ketentuan')

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Pre-register)'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Nomor Telepon'), 2)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Nomor Telepon'), '1234567', 2)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Nama'), 3)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Register/Error - Minimum Phone Number Length'), 1)