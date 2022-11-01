import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

//Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

// Create new user by API
String datetime = new Date().format('yyyyMMddHHmmss')
GlobalVariable.datetime = datetime
System.out.println(GlobalVariable.datetime)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Register/Create New Account by API'), [:], FailureHandling.STOP_ON_FAILURE)

// Login to the recently created user
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Login/Login with credential'), [('phoneNumber') : GlobalVariable.datetime
        , ('password') : GlobalVariable.defaultPassword], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - COBA SEKARANG 1'), 10)

// Use IVT to calculate property value
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Kalkulator Properti/Use IVT'), [('jenisJaminan') : 'Rumah', ('luasTanah') : '75'
        , ('luasBangunan') : '85', ('lokasi') : 'Tanjung Duren Selatan', ('kelurahan') : 'Tanjung Duren Selatan', ('kecamatan') : 'Grogol petamburan'
        , ('kota') : 'Jakarta Barat', ('provinsi') : 'Daerah Khusus Ibukota Jakarta', ('kodePos') : '11470'], FailureHandling.STOP_ON_FAILURE)

// Set property value, loan value, and tenure
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Simulasi Pinjaman/Set property and loan value and tenure'), [('nilaiProperti') : '1500'
        , ('nilaiPinjaman') : '550', ('tenor') : '10'], FailureHandling.STOP_ON_FAILURE)

// Set profile as Bisnis with SHM as Agunan
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Profil Kustomer/Any Profil with SHM as Agunan'), [('tujuan') : 'Pribadi'
        , ('agunan') : 'Ya', ('pemilikSertifikat') : 'Supri', ('pekerjaan') : 'Bisnis', ('pendapatan') : '25000000', ('pengalaman') : '6'], 
    FailureHandling.STOP_ON_FAILURE)

// Upload KTP
//WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah KTP'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Handle Scan KTP error when uploading'), [:], FailureHandling.STOP_ON_FAILURE)

//Complete KTP data with Kawin as marital status
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Complete KTP Data'), [('namaKTP') : 'Debby Anggraini'
        , ('nik') : '3114050501850036', ('namaIbuKandung') : 'Ibu Debby', ('jenisKelamin') : 'Perempuan', ('statusPerkawinan') : 'Kawin'
        , ('dobTanggal') : '5', ('dobBulan') : '1', ('dobTahun') : '1985', ('tempatLahir') : 'Surabaya', ('pendidikan') : 'Sarjana'
        , ('alamatKTP') : 'Jl. Kenangan no. 5', ('rt') : '011', ('rw') : '033', ('provinsi') : 'Jawa Timur', ('kotaKabupaten') : 'Lamongan'
        , ('kecamatan') : 'Pucuk', ('kelurahan') : 'KESAMBI'], FailureHandling.STOP_ON_FAILURE)

// Upload selfie with KTP
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah Selfie dengan KTP'), [:], FailureHandling.STOP_ON_FAILURE)

// Upload KTP pasangan
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah KTP Pasangan'), [('nikPasangan') : '3114050501850036'
        , ('namaPasangan') : 'Ahmad Subarjo', ('dobDatePasangan') : '5', ('dobMonthPasangan') : '1', ('dobYearPasangan') : '1985'], 
    FailureHandling.STOP_ON_FAILURE)

// Upload Kartu Keluarga
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah Kartu Keluarga'), [:], FailureHandling.STOP_ON_FAILURE)

// Submit uploaded documents
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - KIRIM'), 3)

// Accept gimmick offer after pre-screening
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Pre-screening/Accept Gimmick Offer'), [:], FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Pribadi
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Buku Nikah'), [:], FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Finansial
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Faktur Perusahaan'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Foto Tempat Usaha'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Rekening Koran Payroll'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Izin Usaha'), [:], FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Agunan
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah IMB'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah PBB Terbaru'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Sertifikat Kepemilikan'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Foto Agunan Dalam'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Foto Agunan Depan'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Foto Akses Jalan Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

// Submit uploaded additional documents
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - KIRIM DOKUMEN'), 5)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Text - Submit Document Success'), 10)

// Credity analyst approve loan request and send offer letter by API
WebUI.callTestCase(findTestCase('FE/LancarMobile/Backoffice/Approve loan'), [:], FailureHandling.STOP_ON_FAILURE)

// Borrower user relogin to the account
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Login/Login with credential'), [('phoneNumber') : GlobalVariable.datetime
        , ('password') : GlobalVariable.defaultPassword], FailureHandling.STOP_ON_FAILURE)

// Borrower user accepts the offer letter and proceed with the disbursement
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Pencairan Pinjaman/Accept Offer Letter and Disbursement'), [('noRekening') : '0046673832'], 
    FailureHandling.STOP_ON_FAILURE)
