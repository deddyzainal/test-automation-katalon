import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

// Register new borrower using API
WebUI.callTestCase(findTestCase('BE/Register account'), [:], FailureHandling.STOP_ON_FAILURE)

// Open Lancar web
WebUI.openBrowser(GlobalVariable.LancarWeb)

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Login with recently created borrower account
WebUI.callTestCase(findTestCase('FE/LancarWeb/Login/Login with credential'), [('nomorTelepon') : GlobalVariable.datetime
        , ('password') : GlobalVariable.defaultPassword], FailureHandling.STOP_ON_FAILURE)

// Calculate property value based on Google Maps location
WebUI.callTestCase(findTestCase('FE/LancarWeb/Kalkulator Properti/Use Google Map location'), [('luasTanah') : '75', ('luasBangunan') : '85'
        , ('lokasi') : 'Tanjung Duren Selatan', ('kelurahan') : 'TANJUNG DUREN SELATAN', ('kecamatan') : 'Grogol Petamburan'
        , ('kota') : 'Jakarta Barat', ('provinsi') : 'DKI Jakarta', ('kodePos') : '11470'], FailureHandling.STOP_ON_FAILURE)

// Set property value, loan, and tenure
WebUI.callTestCase(findTestCase('FE/LancarWeb/Simulasi Pinjaman/Set property value, loan value, and tenure'), [('nilaiProperti') : '2000'
        , ('nilaiPinjaman') : '1250', ('tenor') : '10'], FailureHandling.STOP_ON_FAILURE)

// Complete profile as Business owner
WebUI.callTestCase(findTestCase('FE/LancarWeb/Profil Kustomer/Any Profil with SHM as Agunan'), [('tujuan') : 'pribadi', ('agunan') : 'ya'
        , ('pekerjaan') : 'bisnis', ('pemilikSertifikat') : 'Debby', ('pendapatanBulanan') : '25000000', ('pengalaman') : '6'], 
    FailureHandling.STOP_ON_FAILURE)

// Upload KTP
WebUI.callTestCase(findTestCase('FE/LancarWeb/Upload KTP/Upload populated KTP'), [('populatedKTP') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/DEBBY_ANGGRAINI.png'], 
    FailureHandling.STOP_ON_FAILURE)

// Complete KTP data
WebUI.callTestCase(findTestCase('FE/LancarWeb/Upload KTP/Complete KTP data'), [('namaKTP') : 'Debby Anggraini', ('NIK') : '3114050501850036'
        , ('namaIbu') : 'Ibunya Debby', ('gender') : 'Perempuan', ('dobYear') : '1985', ('dobMonth') : 'Januari', ('dobDate') : '5'
        , ('tempatLahir') : 'Jakarta Barat', ('statusPerkawinan') : 'Kawin', ('pendidikan') : 'Sarjana', ('alamat') : 'Jl. Pasar Kembang no. 7'
        , ('rt') : '11', ('rw') : '22', ('provinsi') : 'DKI Jakarta', ('kota') : 'Jakarta Barat', ('kecamatan') : 'Grogol Petamburan'
        , ('kelurahan') : 'TANJUNG DUREN SELATAN'], FailureHandling.STOP_ON_FAILURE)

// Upload selfie with KTP
WebUI.callTestCase(findTestCase('FE/LancarWeb/Upload KTP/Upload Selfie dengan KTP'), [('pictureFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/Foto_selfie_ktp.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)

// Upload KTP Pasangan
WebUI.callTestCase(findTestCase('FE/LancarWeb/Upload KTP/Upload KTP Pasangan'), [('KTPpasanganFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/DEBBY_ANGGRAINI.png'
        , ('namaPasangan') : 'Debby Anggraini', ('NIKpasangan') : '3114050501850036', ('dobYearPasangan') : '1985', ('dobMonthPasangan') : 'Januari'
        , ('dobDatePasangan') : '5'], FailureHandling.STOP_ON_FAILURE)

// Upload KK
WebUI.callTestCase(findTestCase('FE/LancarWeb/Upload KTP/Upload Kartu Keluarga'), [('KKfilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/kk.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)

// Submit KTP and selfie
WebUI.click(findTestObject('FE/LancarWeb/Upload KTP/Button - KIRIM (enabled)'))

// Accept gimmick offer
WebUI.callTestCase(findTestCase('FE/LancarWeb/Pre-screening/Accept gimmick offer'), [:], FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Pribadi
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Buku Nikah'), [('bukuNikahFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/buku-nikah.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Finansial as Bisnis profile
WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Izin Usaha'), [('izinUsahaFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/siup.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Rekening Koran Payroll'), [('rekeningKoranFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/BNI-Bank Statement.pdf'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Faktur Perusahaan'), [('fakturPerusahaanFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/faktur-penjualan-1.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload Foto Tempat Usaha'), [('tempatUsahaFilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/tempat-usaha.jpeg'], 
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

// Request document resubmission - PBB
WebUI.callTestCase(findTestCase('FE/LancarMobile/Backoffice/Trigger IMB Resubmission'), [:], FailureHandling.STOP_ON_FAILURE)

// Borrower resubmit IMB document
WebUI.navigateToUrl(GlobalVariable.LancarWeb)

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

WebUI.scrollToElement(findTestObject('FE/LancarWeb/Home/Button - Lanjutkan Pengajuan'), 5)

WebUI.click(findTestObject('FE/LancarWeb/Home/Button - Lanjutkan Pengajuan'))

WebUI.callTestCase(findTestCase('FE/LancarWeb/Unggah Dokumen/Upload IMB'), [('IMBfilepath') : '/Users/garahandhito/Danamas/qa-automation/Danamas/Data Files/LancarWeb/pbb.jpeg'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - KIRIM (enabled)'))

// Approve loan and send Offer Letter
WebUI.callTestCase(findTestCase('FE/LancarMobile/Backoffice/Approve loan'), [:], FailureHandling.STOP_ON_FAILURE)

// Accept Offer Letter
WebUI.callTestCase(findTestCase('FE/LancarWeb/Pencairan/Terima Penawaran'), [:], FailureHandling.STOP_ON_FAILURE)

// Loan disbursement
WebUI.callTestCase(findTestCase('FE/LancarWeb/Pencairan/Pencairan Pinjaman'), [('noRekening') : '0046673832', ('pemegangAkun') : 'RISA AJENG CHRISANTY'], 
    FailureHandling.STOP_ON_FAILURE)

