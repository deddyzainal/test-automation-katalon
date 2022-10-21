import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

String timestamp = new Date().format('yyyyMMddHHmmss')

Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Home)'), 5)
Mobile.scrollToText('Syarat Ketentuan')

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Pre-register)'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Nama'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Nama'), name, 2)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Nomor Telepon'), 2)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Nomor Telepon'), timestamp, 2)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kata Sandi'), 2)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Kata Sandi'), password, 2)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Konfirmasi Kata Sandi'), 2)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Konfirmasi Kata Sandi'), password, 2)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Button - DAFTAR (Register)'), 2)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Register/Button - DAFTAR (Register)'), 1)