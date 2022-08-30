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

// Create new borrower
WebUI.callTestCase(findTestCase('BE/Register account'), [:], FailureHandling.STOP_ON_FAILURE)

// Open Lancar web
WebUI.openBrowser(GlobalVariable.LancarWeb)
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Login to recently created borrower
WebUI.callTestCase(findTestCase('FE/LancarWeb/Login/Login with credential'), [('nomorTelepon') : GlobalVariable.datetime
        , ('password') : GlobalVariable.defaultPassword], FailureHandling.STOP_ON_FAILURE)

// Calculate property value
WebUI.callTestCase(findTestCase('FE/LancarWeb/Kalkulator Properti/Use Google Map location'), [('luasTanah') : '75', ('luasBangunan') : '85'
        , ('lokasi') : 'Tanjung Duren Selatan', ('kelurahan') : 'TANJUNG DUREN SELATAN', ('kecamatan') : 'Grogol Petamburan'
        , ('kota') : 'Jakarta Barat', ('provinsi') : 'DKI Jakarta', ('kodePos') : '11470'], FailureHandling.STOP_ON_FAILURE)

// Set property value, loan value, and tenure
WebUI.callTestCase(findTestCase('FE/LancarWeb/Simulasi Pinjaman/Set property value, loan value, and tenure'), [('nilaiProperti') : '2000'
        , ('nilaiPinjaman') : '1250', ('tenor') : '10'], FailureHandling.STOP_ON_FAILURE)

// Set profile as Pegawai and SHM as collateral
WebUI.callTestCase(findTestCase('FE/LancarWeb/Profil Kustomer/Any Profil with SHM as Agunan'), [('tujuan') : 'pribadi', ('agunan') : 'ya'
        , ('pekerjaan') : 'pegawai', ('pemilikSertifikat') : 'Debby', ('pendapatanBulanan') : '20000000', ('pengalaman') : '6'], 
    FailureHandling.STOP_ON_FAILURE)

// Upload populated KTP
WebUI.callTestCase(findTestCase('FE/LancarWeb/Upload KTP/Upload populated KTP'), [('populatedKTP') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/DEBBY_ANGGRAINI.png'], 
    FailureHandling.STOP_ON_FAILURE)

// Complete KTP data
WebUI.callTestCase(findTestCase('FE/LancarWeb/Upload KTP/Complete KTP data'), [('namaKTP') : 'Debby Anggraini', ('NIK') : '3174096112900001'
        , ('namaIbu') : 'Ibunya Debby', ('gender') : 'Perempuan', ('dobYear') : '1990', ('dobMonth') : 'Juni', ('dobDate') : '15'
        , ('tempatLahir') : 'Jakarta Barat', ('statusPerkawinan') : 'Kawin', ('pendidikan') : 'Sarjana', ('alamat') : 'Jl. Pasar Kembang no. 7'
        , ('rt') : '11', ('rw') : '22', ('provinsi') : 'DKI Jakarta', ('kota') : 'Jakarta Barat', ('kecamatan') : 'Grogol Petamburan'
        , ('kelurahan') : 'TANJUNG DUREN SELATAN'], FailureHandling.STOP_ON_FAILURE)

// Upload selfie with KTP
WebUI.callTestCase(findTestCase('FE/LancarWeb/Upload KTP/Upload Selfie dengan KTP'), [('pictureFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/Foto_selfie_ktp.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)

// Submit KTP and selfie
WebUI.click(findTestObject('FE/LancarWeb/Upload KTP/Button - KIRIM (enabled)'))

// Wait for pre-screening result and accept the gimmick offer
WebUI.callTestCase(findTestCase('FE/LancarWeb/Pre-screening/Accept gimmick offer'), [:], FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Pribadi
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Buku Nikah'), [('bukuNikahFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/buku-nikah.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Finansial
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Slip Gaji'), [('slipGajiFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/slip-gaji-2.pdf'], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Rekening Koran Payroll'), [('rekeningKoranFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/BNI-Bank Statement.pdf'], 
    FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Agunan
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Sertifikat Kepemilikan'), [('sertifikatKepemilikanFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/sertifikat_kepemilikan.pdf'], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload PBB Terbaru'), [('PBBterbaruFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/pbb.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload IMB'), [('PBBterbaruFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/pbb.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Foto Agunan Tampak Dalam'), [('agunanDalamFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/tampak_dalam.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Foto Agunan Tampak Depan'), [('agunanDepanFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/tampak_depan.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Foto Akses Jalan Masuk ke Agunan'), [('aksesJalanFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/akses_jalan_masuk.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)

// Submit uploaded documents
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - KIRIM (enabled)'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - KIRIM (enabled)'))

// Verify leaving Unggah Dokumen page
WebUI.verifyElementNotPresent(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - KIRIM (enabled)'), 10)

// Verify successful submission message is displayed
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Text - Pengajuan pinjaman telah diajukan'), 20)

// Approve the loan and send Offer Letter
WebUI.callTestCase(findTestCase('FE/LancarWeb/Kirim Surat Penawaran/Send Offer Letter'), [('collateralAddr') : 'Jl. Sahabat Baru no. 16'
        , ('collateralCertNo') : '1234567890', ('provisionRate') : '5', ('provisionAmount') : '5000000', ('lifeInsuranceFee') : '3000000'
        , ('fireInsuranceFee') : '1250000', ('notaryFee') : '1000000', ('advancePenalty') : '5', ('latePenalty') : '2'], 
    FailureHandling.STOP_ON_FAILURE)

// Accept Offer Letter
WebUI.callTestCase(findTestCase('FE/LancarWeb/Pencairan/Terima Penawaran'), [:], FailureHandling.STOP_ON_FAILURE)

// Loan disbursement
WebUI.callTestCase(findTestCase('FE/LancarWeb/Pencairan/Pencairan Pinjaman'), [('noRekening') : '0046673832', ('pemegangAkung') : 'RISA AJENG CHRISANTY'], 
    FailureHandling.STOP_ON_FAILURE)

