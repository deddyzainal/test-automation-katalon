import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/Danamas/Android/LandingPage/Button - Jadi Peminjam'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LandingPage/Button - Daftar'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/PreRegisterPage/Checkbox - Syarat Ketentuan'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/PreRegisterPage/Button - Lanjut'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Nama'), 3)

Mobile.setText(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Nama'), 'Qw', 3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Alamat email'), 3)

Mobile.verifyElementVisible(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Error - Nama minimal'), 3)

CustomKeywords.'mobileHelper.CommonActions.closeCurrentApp'()