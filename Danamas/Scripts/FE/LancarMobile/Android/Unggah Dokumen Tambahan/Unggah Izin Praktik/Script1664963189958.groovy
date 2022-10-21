import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Tab - Dokumen Finansial'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah Izin Praktik'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah (Modal)'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Button - Search'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), 'praktik', 3)
Mobile.delay(2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Documents/Text - Izin Praktik'), 3)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Image - Preview PDF'), 10)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - UNGGAH (Preview Modal)'), 3)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/List - Izin Praktik'), 5)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - SIMPAN (Modal)'), 3)
