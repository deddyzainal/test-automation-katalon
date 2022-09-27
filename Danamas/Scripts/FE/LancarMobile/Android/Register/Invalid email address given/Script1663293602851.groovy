import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Home)'), 5)
Mobile.scrollToText('Syarat Ketentuan')
Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Pre-register)'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Alamat Email'), 5)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Alamat Email'), 'qwerty.1234', 3)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kode Referral'), 2)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Register/Error - Alamat Email'), 3)
Mobile.hideKeyboard()
Mobile.pressBack()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Pre-register)'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Alamat Email'), 5)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Alamat Email'), 'qwerty.1234@', 3)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kode Referral'), 2)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Register/Error - Alamat Email'), 3)
Mobile.hideKeyboard()
Mobile.pressBack()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Pre-register)'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Alamat Email'), 5)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Alamat Email'), 'qwerty.1234@asd.', 3)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kode Referral'), 2)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Register/Error - Alamat Email'), 3)
Mobile.hideKeyboard()
Mobile.pressBack()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - DAFTAR (Pre-register)'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Alamat Email'), 5)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - Alamat Email'), ' qwerty.1234@asd.com', 3)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - Kode Referral'), 2)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Register/Error - Alamat Email'), 3)
Mobile.hideKeyboard()

CustomKeywords.'mobileHelper.CommonActions.closeCurrentApp'()