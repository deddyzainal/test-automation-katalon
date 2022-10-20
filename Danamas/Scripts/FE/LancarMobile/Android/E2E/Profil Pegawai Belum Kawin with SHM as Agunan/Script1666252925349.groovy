import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

//Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)
String datetime = new Date().format('yyyyMMddHHmmss')

GlobalVariable.datetime = datetime

System.out.println(GlobalVariable.datetime)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Register/Create New Account by API'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Login/Login with credential'), [('phoneNumber') : GlobalVariable.datetime
        , ('password') : GlobalVariable.defaultPassword], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - COBA SEKARANG 1'), 10)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Kalkulator Properti/Use IVT'), [('jenisJaminan') : 'Rumah', ('luasTanah') : '75'
        , ('luasBangunan') : '85', ('lokasi') : 'Tanjung Duren Selatan', ('kelurahan') : 'Tanjung Duren Selatan', ('kecamatan') : 'Grogol petamburan'
        , ('kota') : 'Jakarta Barat', ('provinsi') : 'Daerah Khusus Ibukota Jakarta', ('kodePos') : '11470'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Simulasi Pinjaman/Set property and loan value and tenure'), [('nilaiProperti') : '1500'
        , ('nilaiPinjaman') : '550', ('tenor') : '10'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Profil Kustomer/Any Profil with SHM as Agunan'), [('tujuan') : 'Pribadi'
        , ('agunan') : 'Ya', ('pemilikSertifikat') : 'Supri', ('pekerjaan') : 'Pegawai', ('pendapatan') : '25000000', ('pengalaman') : '6'], 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah KTP'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Handle Scan KTP error when uploading'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Complete KTP Data'), [('namaKTP') : 'Debby Anggraini'
        , ('nik') : '3114050501850036', ('namaIbuKandung') : 'Ibu Debby', ('jenisKelamin') : 'Perempuan', ('statusPerkawinan') : 'Belum Kawin'
        , ('dobTanggal') : '12', ('dobBulan') : '4', ('dobTahun') : '1989', ('tempatLahir') : 'Surabaya', ('pendidikan') : 'Sarjana'
        , ('alamatKTP') : 'Jl. Kenangan no. 5', ('rt') : '011', ('rw') : '033', ('provinsi') : 'Jawa Timur', ('kotaKabupaten') : 'Lamongan'
        , ('kecamatan') : 'Pucuk', ('kelurahan') : 'KESAMBI'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah Selfie dengan KTP'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - KIRIM'), 3)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Pre-screening/Accept Gimmick Offer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Slip Gaji'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Rekening Koran Payroll'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah IMB'), [('resubmission') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah PBB Terbaru'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Sertifikat Kepemilikan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Foto Agunan Dalam'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Foto Agunan Depan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Unggah Dokumen Tambahan/Unggah Foto Akses Jalan Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Button - KIRIM DOKUMEN'), 5)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Unggah Dokumen/Text - Submit Document Success'), 10)
