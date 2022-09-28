import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Button - YA, HITUNG SEKARANG'), 5)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Select - Jenis Jaminan'), 5)

if (jenisJaminan.toLowerCase() == 'rumah') {
    Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Option - Rumah'), 3)
} else if (jenisJaminan.toLowerCase() == 'apartemen') {
    Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Option - Apartemen'), 3)
} else if (jenisJaminan.toLowerCase() == 'ruko') {
    Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Option - Ruko'), 3)
}

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Luas Tanah'), 3)

Mobile.setText(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Luas Tanah'), luasTanah, 3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Luas Bangunan'), 3)

Mobile.setText(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Luas Bangunan'), luasBangunan, 3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Cari Lokasi'), 3)

Mobile.setText(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Cari Lokasi'), lokasi, 3)

Mobile.hideKeyboard()

// Tap the first found location twice, somehow the first tap is not registered though it was success by Katalon
Mobile.delay(2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Option - First found location'), 10)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Option - First found location'), 2)

Mobile.delay(5)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Button - Pilih Lokasi Ini'), 3)

// Verifying the location detail returned from the selected location
Mobile.scrollToText(kodePos)

Mobile.scrollToText(kelurahan)

Mobile.scrollToText(kecamatan)

Mobile.scrollToText(kota)

Mobile.scrollToText(provinsi)

Mobile.scrollToText('HITUNG HARGA PROPERTI')

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Button - HITUNG HARGA PROPERTI'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Button - LIHAT NILAI PINJAMAN'), 5)

Mobile.delay(2)

boolean buttonVisible = Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Button - LIHAT NILAI PINJAMAN'), 2, FailureHandling.OPTIONAL)

if (buttonVisible == true) {
    Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Button - LIHAT NILAI PINJAMAN'), 1, FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(2)