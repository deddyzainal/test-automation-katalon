import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Tooltip - Slider Tutorial'), 2, FailureHandling.OPTIONAL)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Tooltip - Tenure Tutorial'), 2, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Button - Edit Harga Properti'), 5)
Mobile.delay(1)
Mobile.clearText(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Input - Harga Properti'), 3)
Mobile.delay(1)
// Inputting the value is modified this way because it does not work as intended when inputting the value in a single type
Mobile.sendKeys(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Input - Harga Properti'), nilaiProperti.substring(0, 1))
Mobile.sendKeys(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Input - Harga Properti'), nilaiProperti.substring(1))
Mobile.hideKeyboard()
Mobile.delay(1)

// First tap to remove the focus from the Edit Harga Properti field
Mobile.tap(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Button - Edit Nilai Pinjaman'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Button - Edit Nilai Pinjaman'), 2)
Mobile.delay(1)
Mobile.clearText(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Input - Nilai Pinjaman'), 2)
Mobile.sendKeys(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Input - Nilai Pinjaman'), nilaiPinjaman)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.scrollToText('SETUJU, SELANJUTNYA')

// First tap to remove the focus from the Edit Nilai Pinjaman field
Mobile.tap(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Button - Edit Tenor'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Button - Edit Tenor'), 2)
Mobile.delay(1)
Mobile.clearText(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Input - Tenor'), 2)
Mobile.sendKeys(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Input - Tenor'), tenor)
Mobile.hideKeyboard()

// First tap to remove the focus from the Edit Tenor field
Mobile.tap(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Button - SETUJU, SELANJUTNYA'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Simulasi Pinjaman/Button - SETUJU, SELANJUTNYA'), 2)