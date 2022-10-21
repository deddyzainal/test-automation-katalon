import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

//Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.scrollToText('Syarat dan Ketentuan')
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload Kartu Keluarga'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - Unggah (Modal)'), 3)

// Select Kartu Keluarga from Documents Explorer
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Button - Search'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), 'kk', 3)
Mobile.delay(2)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Image - Kartu Keluarga'), 3)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Button - SELECT'), 3, FailureHandling.OPTIONAL)

// Submit Kartu Keluarga
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/Image - Preview Image'), 10)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Unggah KK'), 3)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/List - Kartu Keluarga'), 10)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - SIMPAN (Modal)'), 3)

Mobile.verifyElementNotVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/List - Kartu Keluarga'), 5)