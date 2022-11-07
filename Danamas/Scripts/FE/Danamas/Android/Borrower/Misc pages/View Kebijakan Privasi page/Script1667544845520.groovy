import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/Danamas/Android/LandingPage/Button - Jadi Peminjam'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/LandingPage/Button - Masuk sebagai tamu'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/HomePage/Tab - Profil'), 3)

Mobile.scrollToText('Kebijakan Privasi')

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/ProfilPage/Menu - Kebijakan Privasi'), 3)

Mobile.verifyElementVisible(findTestObject('FE/Danamas/Android/Borrower/MiscPage/Header - Kebijakan Privasi'), 3)

CustomKeywords.'mobileHelper.CommonActions.closeCurrentApp'()