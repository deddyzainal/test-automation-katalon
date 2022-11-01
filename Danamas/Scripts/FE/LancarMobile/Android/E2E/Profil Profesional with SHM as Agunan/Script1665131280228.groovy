import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

//Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

// Create new account by API
String datetime = new Date().format('yyyyMMddHHmmss')
GlobalVariable.datetime = datetime
System.out.println(GlobalVariable.datetime)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Register/Create New Account by API'), [:], FailureHandling.STOP_ON_FAILURE)

// Login to recently created account
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

// Set profile as Profesional with SHM as Agunan
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Profil Kustomer/Any Profil with SHM as Agunan'), [('tujuan') : 'Pribadi'
        , ('agunan') : 'Ya', ('pemilikSertifikat') : 'Supri', ('pekerjaan') : 'Profesional', ('pendapatan') : '25000000'
        , ('pengalaman') : '6'], FailureHandling.STOP_ON_FAILURE)

// Upload KTP
//WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah KTP'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Handle Scan KTP error when uploading'), [:], FailureHandling.STOP_ON_FAILURE)

// Complete KTP data with Kawin as marital status
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Complete KTP Data'), [('namaKTP') : 'Debby Anggraini'
        , ('nik') : '3114050501850036', ('namaIbuKandung') : 'Ibu Debby', ('jenisKelamin') : 'Perempuan', ('statusPerkawinan') : 'Kawin'
        , ('dobTanggal') : '12', ('dobBulan') : '4', ('dobTahun') : '1989', ('tempatLahir') : 'Surabaya', ('pendidikan') : 'Sarjana'
        , ('alamatKTP') : 'Jl. Kenangan no. 5', ('rt') : '011', ('rw') : '033', ('provinsi') : 'Jawa Timur', ('kotaKabupaten') : 'Lamongan'
        , ('kecamatan') : 'Pucuk', ('kelurahan') : 'KESAMBI'], FailureHandling.STOP_ON_FAILURE)

// Upload selfie with KTP
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah Selfie dengan KTP'), [:], FailureHandling.STOP_ON_FAILURE)

// Upload KTP Pasangan
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah KTP Pasangan'), [('nikPasangan') : '1234123456785678'
        , ('namaPasangan') : 'Ahmad Subarjo', ('dobDatePasangan') : '5', ('dobMonthPasangan') : '2', ('dobYearPasangan') : '1985'], 
    FailureHandling.STOP_ON_FAILURE)

// Upload Kartu Keluarga
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah Kartu Keluarga'), [:], FailureHandling.STOP_ON_FAILURE)

// Submit uploaded documents
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - KIRIM'), 3)

// Accept gimmick offer after passing pre-screening
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Pre-screening/Accept Gimmick Offer'), [:], FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Pribadi
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Buku Nikah'), [:], FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Finansial
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Izin Praktik'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Rekening Koran'), [:], FailureHandling.STOP_ON_FAILURE)

// Upload Dokumen Agunan
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah IMB'), [('resubmission') : false], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah PBB Terbaru'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Sertifikat Kepemilikan'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Foto Agunan Dalam'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Foto Agunan Depan'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Foto Akses Jalan Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

// Submit uploaded additional documents
Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - KIRIM DOKUMEN'), 5)
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Text - Submit Document Success'), 10)
