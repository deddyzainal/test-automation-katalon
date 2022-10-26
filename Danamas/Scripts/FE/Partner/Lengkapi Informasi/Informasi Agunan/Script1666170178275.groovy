import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/select_jenis agunan'), 0)

// Select Jenis Agunan
WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/select_jenis agunan'))

if (JenisAgunan.toLowerCase() == 'rumah') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Rumah'))

    'luas tanah'
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/input_tanah'))

    'luas tanah'
    WebUI.sendKeys(findTestObject('FE/PARTNER/Lengkapi Informasi/input_tanah'), luastanah)
} else if (JenisAgunan.toLowerCase() == 'apartment') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Apartement'))
} else if (JenisAgunan.toLowerCase() == 'ruko') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Ruko'))
} else if (JenisAgunan.toLowerCase() == 'tanah produktif') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Tanah'))
}

'luas tanah/bangunan'
WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/input_bangunan'))

WebUI.clearText(findTestObject('FE/PARTNER/Lengkapi Informasi/input_bangunan'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Lengkapi Informasi/input_bangunan'), bangunan)

'pilih lokasi'
WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Pilih_Lokasi'))

WebUI.setText(findTestObject('FE/PARTNER/Lengkapi Informasi/Cari_Lokasi'), alamat)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/Cari_Lokasi'), 3)

WebUI.clickOffset(findTestObject('FE/PARTNER/Lengkapi Informasi/Cari_Lokasi'), 80, 80)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/button_Konfirmasi'), 2)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_Konfirmasi'))

WebUI.scrollToPosition(200, 300)

'alamat'
WebUI.click(findTestObject('FE/PARTNER/Beranda/textarea_Alamat sesuai KTP'))

'alamat'
WebUI.clearText(findTestObject('FE/PARTNER/Beranda/textarea_Alamat sesuai KTP'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/textarea_Alamat sesuai KTP'), alamat)

WebUI.delay(2)

// Select provinsi
WebUI.click(findTestObject('FE/PARTNER/Beranda/div_provinsi'))

WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Provinsi'), Provinsi)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Provinsi'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/Option - Provinsi', [('Provinsi') : Provinsi]))

// select kota/kabupaten
WebUI.click(findTestObject('FE/PARTNER/Beranda/div_kotakabupaten'))

WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Kota'), Kota)

//WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Kota'), Kota)
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Kota'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/Option - Kota', [('Kota') : Kota]))

WebUI.scrollToPosition(500, 600)

// Select kecamatan
WebUI.click(findTestObject('FE/PARTNER/Beranda/div_kecamatan'))

WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Kecamatan'), Kecamatan)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Kecamatan'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/Option - Kecamatan', [('Kecamatan') : Kecamatan]))

// Select kelurahan
WebUI.click(findTestObject('FE/PARTNER/Beranda/div_kelurahan'))

WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Kelurahan'), Kelurahan)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Kelurahan'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/Option - Kelurahan', [('Kelurahan') : Kelurahan]))

WebUI.scrollToPosition(950, 1000)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Kode Pos'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Kode Pos'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Kode Pos'), kodepos)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/select_status kepemilikan'))

if (milik.toLowerCase() == 'milik sendiri') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Milik Sendiri'))
} else if (milik.toLowerCase() == 'milik pasangan') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Milik Pasangan'))
} else if (milik.toLowerCase() == 'milik orang tua') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Milik Orang Tua'))
} else if (milik.toLowerCase() == 'milik keluarga') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Milik Keluarga'))
}

WebUI.scrollToPosition(1000, 1100)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Input Nama Pemilik Dokumen di PBB'))

WebUI.clearText(findTestObject('FE/PARTNER/Lengkapi Informasi/Input Nama Pemilik Dokumen di PBB'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Lengkapi Informasi/Input Nama Pemilik Dokumen di PBB'), namapemilik)

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto PBB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Sertifikat Kepemilikan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Sertifikat Kepemilikan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(2000, 2100)

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Izin Mendirikan Bangunan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Agunan (Tampak Dalam)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Agunan (Tampak Depan)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Jalan Akses Masuk Ke Agunan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Profil/button_Simpan'))

