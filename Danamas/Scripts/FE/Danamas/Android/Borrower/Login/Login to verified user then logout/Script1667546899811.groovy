import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/Danamas/Android/LandingPage/Button - Jadi Peminjam'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LandingPage/Button - Masuk'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Nomor HP'), 3)

Mobile.setText(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Nomor HP'), phoneNumber, 3)

Mobile.hideKeyboard()

a = 0

while (Mobile.verifyElementNotExist(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Kata Sandi'), 2, FailureHandling.OPTIONAL) && 
(a < 5)) {
    Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Button - Lanjut'), 2, FailureHandling.OPTIONAL)

    Mobile.delay(2)

    a++
}

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Kata Sandi'), 3)

Mobile.setText(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Kata Sandi'), password, 3)

Mobile.hideKeyboard()

b = 0

while (Mobile.verifyElementVisible(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Button - Lanjut'), 2, FailureHandling.OPTIONAL) && 
(b < 5)) {
    Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Button - Lanjut'), 2, FailureHandling.OPTIONAL)

    Mobile.delay(2)

    b++
}

Mobile.verifyElementNotVisible(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Kata Sandi'), 5)

WebUI.callTestCase(findTestCase('FE/Danamas/Android/Borrower/Login/Logout'), [:])
