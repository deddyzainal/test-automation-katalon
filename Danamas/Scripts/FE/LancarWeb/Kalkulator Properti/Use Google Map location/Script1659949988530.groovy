import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Handle Tooltip if it appears
if(WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - Tooltip OK'), 3)) {
	WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - Tooltip OK'))
}

// Get Nilai Minimum Properti
String nilaiAwal = WebUI.getText(findTestObject('FE/LancarWeb/Kalkulator Properti/TextValue - Nilai Minimum Properti'))

// Click button Ya, hitung sekarang
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - Ya, hitung sekarang'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - Ya, hitung sekarang'))

// Click Jenis Jaminan select
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/Select - Jenis Jaminan'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Select - Jenis Jaminan'))

// Select Rumah
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/Select - Rumah'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Select - Rumah'))

// Input Luas Tanah
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/Input - Luas Tanah'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Input - Luas Tanah'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Kalkulator Properti/Input - Luas Tanah'), luasTanah)

// Input Luas Bangunan
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Input - Luas Bangunan'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Kalkulator Properti/Input - Luas Bangunan'), luasBangunan)

// Input Lokasi
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Input - Cari Lokasi'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Kalkulator Properti/Input - Cari Lokasi'), lokasi)

// Select first found location
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/Google Map - First found location'), 20)
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Google Map - First found location'))

// Click button Pilih Lokasi Ini
WebUI.scrollToElement(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - HITUNG HARGA PROPERTI'), 3)
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - Pilih Lokasi Ini'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - Pilih Lokasi Ini'))

// Check Detail Lokasi
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/TextValue - Kode Pos'), 5)
WebUI.verifyElementText(findTestObject('FE/LancarWeb/Kalkulator Properti/TextValue - Kelurahan'), kelurahan)
WebUI.verifyElementText(findTestObject('FE/LancarWeb/Kalkulator Properti/TextValue - Kecamatan'), kecamatan)
WebUI.verifyElementText(findTestObject('FE/LancarWeb/Kalkulator Properti/TextValue - Kota'), kota)
WebUI.verifyElementText(findTestObject('FE/LancarWeb/Kalkulator Properti/TextValue - Provinsi'), provinsi)
WebUI.verifyElementText(findTestObject('FE/LancarWeb/Kalkulator Properti/TextValue - Kode Pos'), kodePos)

// Click button HITUNG HARGA PROPERTI
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - HITUNG HARGA PROPERTI'))

// Compare updated Nilai Minimum Properti
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/TextValue - Nilai Minimum Properti'), 3)
String nilaiBaru = WebUI.getText(findTestObject('FE/LancarWeb/Kalkulator Properti/TextValue - Nilai Minimum Properti'))
WebUI.verifyNotMatch(nilaiBaru, nilaiAwal, false)

// Click button LIHAT NILAI PINJAMAN
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - LIHAT NILAI PINJAMAN'))

// Verify leaving Kalkulator Properti page
WebUI.verifyElementNotPresent(findTestObject('FE/LancarWeb/Kalkulator Properti/TextValue - Nilai Minimum Properti'), 5)
