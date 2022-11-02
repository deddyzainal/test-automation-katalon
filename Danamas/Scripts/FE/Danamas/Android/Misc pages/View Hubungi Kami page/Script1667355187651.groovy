import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/Danamas/Android/LandingPage/Button - Jadi Peminjam'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/BorrowerLandingPage/Button - Masuk sebagai tamu'), 3)

Mobile.tap(findTestObject('FE/Danamas/Android/BorrowerHomePage/Tab - Profil'), 3)

Mobile.scrollToText('Hubungi Kami')

Mobile.tap(findTestObject('FE/Danamas/Android/ProfilPage/Menu - Hubungi Kami'), 3)

Mobile.verifyElementVisible(findTestObject('FE/Danamas/Android/BorrowerMiscPage/Header - Hubungi Kami'), 3)

CustomKeywords.'mobileHelper.CommonActions.closeCurrentApp'()