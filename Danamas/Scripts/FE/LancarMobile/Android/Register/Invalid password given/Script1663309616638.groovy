import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Home)'), 5)
Mobile.scrollToText('Syarat Ketentuan')

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Pre-register)'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kata Sandi'), 2)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Kata Sandi'), '12345', 2)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kode Referral'), 2)
Mobile.hideKeyboard()
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Register/Error - Minimum Password Length'), 2)
Mobile.pressBack()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Pre-register)'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kata Sandi'), 2)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Kata Sandi'), '123456', 2)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kode Referral'), 2)
Mobile.hideKeyboard()
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Register/Text - Weak Password'), 2)
Mobile.pressBack()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Pre-register)'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kata Sandi'), 2)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Kata Sandi'), '12345Q', 2)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kode Referral'), 2)
Mobile.hideKeyboard()
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Register/Text - Medium Password'), 2)
Mobile.pressBack()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Pre-register)'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kata Sandi'), 2)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Kata Sandi'), '12345Qw', 2)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kode Referral'), 2)
Mobile.hideKeyboard()
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Register/Text - Strong Password'), 2)
Mobile.pressBack()

CustomKeywords.'mobileHelper.CommonActions.closeCurrentApp'()