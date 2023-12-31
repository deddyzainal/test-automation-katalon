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

WebUI.callTestCase(findTestCase('FE/Partner/Login/Login with credential'), [('nomorhp') : '20220921163134', ('katasandi') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Profil/Profile_badge'))

badge = WebUI.getText(findTestObject('FE/PARTNER/Profil/Profile_badge'), FailureHandling.STOP_ON_FAILURE)

System.print(badge)

GlobalVariable.badge = badge

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/img Tentang Produk'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/img Tentang Produk'))

if (pengajuan.toLowerCase() == 'pinjaman beragunan properti') {
    WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/img_pinjamanberagunan'), 3)

    WebUI.click(findTestObject('FE/PARTNER/Beranda/img_pinjamanberagunan'))

    WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/Detail Produk'))
} else if (pengajuan.toLowerCase() == 'dana express') {
    WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/img_danaexpress'), 3)

    WebUI.click(findTestObject('FE/PARTNER/Beranda/img_danaexpress'))

    WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/Detail Produk'))
}

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Buat Pengajuan baru'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/input_NIK'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_NIK'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_NIK'), timestamp + 12)

//WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_NIK'), nik)
WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Cek Status'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/button_Ya, tambah'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Ya, tambah'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/1. Informasi Peminjam'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/1. Informasi Peminjam'))

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/uploadktp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/uploadfotoselfie'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Beranda/List/Input Data/Input Data - Informasi Peminjam'), [('gender') : 'laki-laki'
        , ('tempatlahir') : 'jakarta', ('nama') : 'test11', ('pendidikan') : 'Sarjana', ('statusPerkawinan') : 'Belum kawin'
        , ('date1') : '10-Agustus', ('eYear') : '1999'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Beranda/List/Input Data/Input Data - Alamat Domisili sama dengan KTP'), [('alamat') : 'jl sungai sambas'
        , ('rt') : '10/', ('rw') : '05', ('Provinsi') : 'DKI Jakarta', ('Kota') : 'Jakarta Selatan', ('Kecamatan') : 'Kebayoran Baru'
        , ('Kelurahan') : 'SENAYAN', ('kodepos') : '10293'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Simpan'))

WebUI.callTestCase(findTestCase('FE/Partner/Beranda/List/Input Data/Input Data - Informasi Pekerjaan'), [('pekerjaan') : 'Saya pegawai tetap'
        , ('detailpekerjaan') : 'Pegawai Swasta', ('lamabekerja') : '8', ('sumberpendapatan') : 'Gaji', ('pendapatanbulanan') : '100000000'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Beranda/List/Input Data/Input Data - Informasi Pinjaman'), [('nilai_Agunan') : '1000000000'
        , ('jumlah_pinjaman') : '100000000', ('tipepeminjam') : 'individual', ('tujuanpinjaman') : 'pribadi', ('tenor') : '10'
        , ('badge') : GlobalVariable.badge], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Beranda/List/Gamification/Popup'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyTextPresent('Pengajuan pinjaman telah berhasil di kirim untuk pre-screening!', false)
//
//WebUI.click(findTestObject('FE/PARTNER/Beranda/button_OK'))
if (WebUI.verifyElementText(findTestObject('FE/PARTNER/Beranda/Info - Gamification'), '+5 Point Didapatkan', FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Beranda/List/Gamification/Get Point'), [('poin') : 'tutup'], FailureHandling.OPTIONAL)
} else {
    WebUI.callTestCase(findTestCase('FE/Partner/Beranda/List/Gamification/Get Level'), [('poin') : 'tutup'], FailureHandling.OPTIONAL)
}

WebUI.closeBrowser()

