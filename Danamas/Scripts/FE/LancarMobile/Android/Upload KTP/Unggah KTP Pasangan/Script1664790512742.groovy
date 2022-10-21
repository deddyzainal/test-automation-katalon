import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

//Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload KTP Pasangan'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - UNGGAH (Modal)'), 3)

// Select KTP from Documents Explorer
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Button - Search'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Input - Search'), 'Pasangan', 3)
Mobile.delay(2)
Mobile.hideKeyboard()
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Documents/Text - KTP Pasangan'), 5)

// Submit KTP Pasangan file
//Mobile.waitForElementNotPresent(findTestObject('FE/LancarMobile/Android/Common/Text - Loading Indicator'), 5, FailureHandling.STOP_ON_FAILURE)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Image - Preview Image'), 5)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Unggah KTP Pasangan'), 3)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/List - KTP Pasangan'), 5)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Lanjut (Modal)'), 3)

// Input NIK Pasangan
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - NIK Pasangan'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - NIK Pasangan'), nikPasangan, 3)
Mobile.hideKeyboard()

// Input Nama Pasangan
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - Nama Pasangan'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - Nama Pasangan'), namaPasangan, 3)
Mobile.hideKeyboard()

// Pick Pasangan DoB
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Open Datepicker Pasangan'), 3)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Open Datepicker Pasangan'), 3, FailureHandling.OPTIONAL)
CustomKeywords.'mobileHelper.CommonActions.pickDate'(dobDatePasangan, dobMonthPasangan, dobYearPasangan)

// Submit Pasangan data
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - SIMPAN (Datepicker)'), 3)

// Verify submission succeed and the modal is closed
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Upload KTP Pasangan'), 10)