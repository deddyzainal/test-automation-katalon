import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/Danamas/Android/LandingPage/Button - Jadi Peminjam'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/BorrowerLandingPage/Button - Daftar'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/BorrowerPreRegisterPage/Checkbox - Syarat Ketentuan'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/BorrowerPreRegisterPage/Button - Lanjut'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/BorrowerRegisterPage/Input - Nomor Handphone'), 3)

Mobile.setText(findTestObject('FE/Danamas/Android/BorrowerRegisterPage/Input - Nomor Handphone'), '12345678', 3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/Danamas/Android/BorrowerRegisterPage/Input - Kode Referral'), 3)

Mobile.hideKeyboard()

Mobile.verifyElementNotExist(findTestObject('FE/Danamas/Android/BorrowerRegisterPage/Error - Nomor Handphone tidak sesuai'), 3)

CustomKeywords.'mobileHelper.CommonActions.closeCurrentApp'()