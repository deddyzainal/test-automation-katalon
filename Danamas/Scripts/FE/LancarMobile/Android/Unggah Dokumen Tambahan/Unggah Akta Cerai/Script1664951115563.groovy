import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Tab - Dokumen Pribadi'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah Akta Cerai Surat Kematian'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - SAYA SETUJU'), 3, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah (Modal)'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Button - Search'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), 'cerai', 3)
Mobile.delay(2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Documents/Text - Akta Cerai'), 3)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Image - Preview PDF'), 10)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - UNGGAH (Preview Modal)'), 3)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/List - Akta Cerai'), 5)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - SIMPAN (Modal)'), 3)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah Akta Cerai Surat Kematian'), 10)