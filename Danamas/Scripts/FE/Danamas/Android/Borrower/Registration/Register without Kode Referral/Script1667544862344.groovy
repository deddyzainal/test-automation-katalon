import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

String timestamp = new Date().format('yyyyMMddHHmmss')

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/Danamas/Android/LandingPage/Button - Jadi Peminjam'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LandingPage/Button - Daftar'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/PreRegisterPage/Checkbox - Syarat Ketentuan'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/PreRegisterPage/Button - Lanjut'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Nama'), 3)
Mobile.setText(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Nama'), 'Katalon', 3)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Alamat email'), 3)
Mobile.setText(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Alamat email'), 'katalon.' + timestamp + '@mailinator.com', 3)
Mobile.hideKeyboard()

Mobile.scrollToText('Lanjut')

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Nomor Handphone'), 3)
Mobile.setText(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Nomor Handphone'), timestamp, 3)
Mobile.hideKeyboard()

a = 0
while(Mobile.verifyElementVisible(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Button - Lanjut'), 2, FailureHandling.OPTIONAL) && a<10) {
	Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Button - Lanjut'), 3, FailureHandling.OPTIONAL)
}
Mobile.verifyElementNotExist(findTestObject('FE/Danamas/Android/Borrower/RegisterPage/Input - Nomor Handphone'), 3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobileHelper.CommonActions.closeCurrentApp'()