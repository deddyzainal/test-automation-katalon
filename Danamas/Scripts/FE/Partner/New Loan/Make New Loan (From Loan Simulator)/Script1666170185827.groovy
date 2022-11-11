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

String timestamp = new Date().format('yyyyMMddHHmmss')

WebUI.callTestCase(findTestCase('FE/Partner/Kalkulator Pinjaman/kalkulatorpinjaman'), [:], FailureHandling.STOP_ON_FAILURE)

//pilih menu pengajuan 
if (pengajuan.toLowerCase() == 'pinjaman beragunan properti') {
    WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/img_pinjamanberagunan'), 3)

    WebUI.click(findTestObject('FE/PARTNER/Beranda/img_pinjamanberagunan'))

    WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Pilih Produk'))
} else if (pengajuan.toLowerCase() == 'dana express') {
    WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/img_danaexpress'), 3)

    WebUI.click(findTestObject('FE/PARTNER/Beranda/img_danaexpress'))

    WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Pilih Produk'))
}

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/input_NIK'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_NIK'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_NIK'), timestamp + 12)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Cek Status'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/button_Ya, tambah'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Ya, tambah'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/1. Informasi Peminjam'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/1. Informasi Peminjam'))

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/uploadktp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/uploadfotoselfie'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Beranda/Input Data - Informasi Peminjam'), [('gender') : 'Laki-laki', ('tempatlahir') : 'jakarta'
        , ('nama') : 'test11', ('pendidikan') : 'Sarjana', ('statusPerkawinan') : 'Belum Kawin', ('date1') : '10-Agustus'
        , ('eYear') : '1999', ('nikpasangan') : '1312213121111123', ('date2') : '15-Agustus', ('namapasangan') : 'Joko'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Beranda/Input Data - Alamat Domisili sama dengan KTP'), [('alamat') : 'jl sungai sambas'
        , ('rt') : '10/', ('rw') : '05', ('Provinsi') : 'DKI Jakarta', ('Kota') : 'Jakarta Selatan', ('Kecamatan') : 'Kebayoran Baru'
        , ('Kelurahan') : 'SENAYAN', ('kodepos') : '10293'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Simpan'))

WebUI.callTestCase(findTestCase('FE/Partner/Beranda/Input Data - Informasi Pekerjaan'), [('pekerjaan') : 'Saya pegawai tetap'
        , ('detailpekerjaan') : 'Pegawai BUMN/BUMD', ('lamabekerja') : '5', ('sumberpendapatan') : 'Dana Hibah', ('pendapatanbulanan') : '100000000'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Beranda/Input Data - Informasi Pinjaman'), [('nilai_Agunan') : '1000000000', ('jumlah_pinjaman') : '100000000'
        , ('tipepeminjam') : 'individual', ('tujuanpinjaman') : 'pribadi', ('tenor') : '120', ('badge') : GlobalVariable.badge], 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyTextPresent('Pengajuan pinjaman telah berhasil di kirim untuk pre-screening!', false)
//
//WebUI.click(findTestObject('FE/PARTNER/Beranda/button_OK'))
WebUI.callTestCase(findTestCase('FE/Partner/Beranda/Get Point'), [('poin') : 'tutup'], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

