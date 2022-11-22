import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/Danamas/Android/LandingPage/Button - Jadi Peminjam'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LandingPage/Button - Daftar'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/PreRegisterPage/Checkbox - Syarat Ketentuan'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/PreRegisterPage/Button - Lanjut'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Nomor Handphone'), 3)

Mobile.setText(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Nomor Handphone'), '1234567', 3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Kode Referral'), 3)

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Error - Nomor Handphone tidak sesuai'), 3)

CustomKeywords.'mobileHelper.CommonActions.closeCurrentApp'()