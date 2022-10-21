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

WebUI.callTestCase(findTestCase('FE/Partner/Login/Login with credential'), [('nomorhp') : '20220921163134', ('katasandi') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Menu Pengajuan/Menu Pengajuan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Menu Pengajuan/Filter by Status'), [('status') : 'passed'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Menu Pengajuan/Cari Aplikasi by No Pinjaman'), [('nama_peminjam') : 'test11'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/status_Passed'))

WebUI.scrollToElement(findTestObject('FE/PARTNER/Lengkapi Informasi/button_Lengkapi Informasi'), 2)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_Lengkapi Informasi'))

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/1. Informasi Peminjam'))

WebUI.callTestCase(findTestCase('FE/Partner/Lengkapi Informasi/Informasi Peminjam'), [('Agama') : 'Islam', ('Kewarganegaraan') : 'wni'
        , ('npwp') : '123456789012345'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/2. Informasi Penjamin'), 2)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/2. Informasi Penjamin'))

WebUI.callTestCase(findTestCase('FE/Partner/Lengkapi Informasi/Informasi Penjamin'), [('hubungan') : 'saudara', ('date1') : '10-Maret-2022'
        , ('nama') : 'Ricardo', ('tempatlahir') : 'Bandung', ('alamat') : 'Jl sungai sambas'], FailureHandling.STOP_ON_FAILURE)

'2'
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/3. Informasi Kontak Darurat'), 2)

'3'
WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/3. Informasi Kontak Darurat'))

WebUI.callTestCase(findTestCase('FE/Partner/Lengkapi Informasi/Informasi Kontak Darurat'), [('nama') : 'sutiyem', ('nohp') : '081265311111'
        , ('hubungan') : 'anak'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/4. Informasi Agunan'), 2)

'4'
WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/4. Informasi Agunan'))

WebUI.callTestCase(findTestCase('FE/Partner/Lengkapi Informasi/Informasi Agunan'), [('Provinsi') : 'DKI Jakarta', ('Kota') : 'Jakarta Selatan'
        , ('Kecamatan') : 'Kebayoran Baru', ('Kelurahan') : 'SENAYAN', ('kodepos') : '12134', ('luastanah') : '100', ('JenisAgunan') : 'rumah'
        , ('bangunan') : '150', ('alamat') : 'Jl Sungai Sambas', ('namapemilik') : 'Sutrisno', ('milik') : 'milik sendiri'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/5. Informasi Bank'), 2)

'5'
WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/5. Informasi Bank'))

WebUI.callTestCase(findTestCase('FE/Partner/Register/Input data Rekening Bank'), [('nama') : 'saya\t', ('norekening') : '1235167871'
        , ('Bank') : 'BNI'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Profil/button_Simpan'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/6. Bukti Keuangan'), 2)

'6'
WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/6. Bukti Keuangan'))

WebUI.callTestCase(findTestCase('FE/Partner/Lengkapi Informasi/Bukti Keuangan'), [:], FailureHandling.STOP_ON_FAILURE)

'klik submit'
WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_Kirim Kelengkapan Data'))

'klik submit'
WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_Kirim'))

WebUI.verifyTextPresent('Informasi pengajuan peminjam berhasil dikirim!', false)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

