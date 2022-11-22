import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/HomePage/Tab - Profil'), 3)

Mobile.delay(1)

Mobile.scrollToText('Keluar')

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/ProfilPage/Menu - Keluar'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/Borrower/ProfilPage/Button - Ya, Keluar'), 3)

Mobile.verifyElementVisible(findTestObject('FE/Danamas/Android/Borrower/LandingPage/Button - Masuk'), 3)