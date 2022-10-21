import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Tab - Dokumen Finansial'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah Slip Gaji'), 3)

// Upload Rekening Koran - Bulan 1
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah (Modal)'), 3)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Button - Search'), 3)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), "slip-gaji", 3)
Mobile.delay(2)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Documents/Text - Slip Gaji'), 3)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Image - Preview PDF'), 10)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - UNGGAH (Multiple Upload)'), 3)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/List - Slip Gaji 1'), 10)

// Upload Rekening Koran - Bulan 2
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah (Modal)'), 3)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Button - Search'), 3)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), "slip-gaji", 3)
Mobile.delay(2)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Documents/Text - Slip Gaji'), 3)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Image - Preview PDF'), 10)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - UNGGAH (Multiple Upload)'), 3)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/List - Slip Gaji 2'), 10)

// Upload Rekening Koran - Bulan 3
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah (Modal)'), 3)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Button - Search'), 3)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), "slip-gaji", 3)
Mobile.delay(2)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Documents/Text - Slip Gaji'), 3)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Image - Preview PDF'), 10)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - UNGGAH (Multiple Upload)'), 3)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/List - Slip Gaji 3'), 10)

// Submit Rekening Koran
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - SIMPAN (Modal)'), 3)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah Slip Gaji'), 5)