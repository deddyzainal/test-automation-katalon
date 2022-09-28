import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

//WebUI.callTestCase(findTestCase('BE/Register account'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Login/Login with credential'), [('phoneNumber') : '20220928092904'
        , ('password') : GlobalVariable.defaultPassword], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - COBA SEKARANG 1'), 10)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Kalkulator Properti/Use IVT'), [('jenisJaminan') : 'Rumah', ('luasTanah') : '75'
        , ('luasBangunan') : '85', ('lokasi') : 'Tanjung Duren Selatan', ('kelurahan') : 'Tanjung Duren Selatan', ('kecamatan') : 'Grogol petamburan'
        , ('kota') : 'Jakarta Barat', ('provinsi') : 'Daerah Khusus Ibukota Jakarta', ('kodePos') : '11470'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Simulasi Pinjaman/Set property and loan value and tenure'), [('nilaiProperti') : '1500'
        , ('nilaiPinjaman') : '550', ('tenor') : '10'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Profil Kustomer/Any Profil with SHM as Agunan'), [('tujuan') : 'Pribadi'
        , ('agunan') : 'Ya', ('pemilikSertifikat') : 'Supri', ('pekerjaan') : 'Pegawai', ('pendapatan') : '20000000', ('pengalaman') : '6'], 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah KTP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Upload KTP/Unggah Selfie dengan KTP'), [:], FailureHandling.STOP_ON_FAILURE)

