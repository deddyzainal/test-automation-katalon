import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/Danamas/Android/LandingPage/Button - Jadi Peminjam'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LandingPage/Button - Masuk'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Nomor HP'), 3)
Mobile.setText(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Input - Nomor HP'), unregisteredPhone, 3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LoginPage/Button - Lanjut'), 3)

// Need validation what to expect when login with unregistered phone number

CustomKeywords.'mobileHelper.CommonActions.closeCurrentApp'()