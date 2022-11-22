import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/Danamas/Android/LandingPage/Button - Jadi Peminjam'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LandingPage/Button - Masuk'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Nomor HP'), 3)
Mobile.setText(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Nomor HP'), '1234567', 3)

Mobile.hideKeyboard()

a = 0
while(Mobile.verifyElementNotExist(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Kata Sandi'), 2, FailureHandling.OPTIONAL) && a<5) {
	Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Button - Lanjut'), 2, FailureHandling.OPTIONAL)
	Mobile.delay(1)
	a++
	if(Mobile.verifyElementVisible(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Error - Nomor telepon tidak sesuai'), 2, FailureHandling.OPTIONAL)) {
		break
	}
}

Mobile.verifyElementVisible(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Error - Nomor telepon tidak sesuai'), 2)

CustomKeywords.'mobileHelper.CommonActions.closeCurrentApp'()