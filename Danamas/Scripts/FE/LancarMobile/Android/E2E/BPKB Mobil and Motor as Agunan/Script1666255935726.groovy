import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

//Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

// Create new account by API request
String datetime = new Date().format('yyyyMMddHHmmss')
GlobalVariable.datetime = datetime
System.out.println(GlobalVariable.datetime)
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Register/Create New Account by API'), [:], FailureHandling.STOP_ON_FAILURE)

// Login to recently created account
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Login/Login with credential'), [('phoneNumber') : GlobalVariable.datetime
        , ('password') : GlobalVariable.defaultPassword], FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - COBA SEKARANG 1'), 10)

// Use IVT for calculating property value
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Kalkulator Properti/Use IVT'), [('jenisJaminan') : 'Rumah', ('luasTanah') : '75'
        , ('luasBangunan') : '85', ('lokasi') : 'Tanjung Duren Selatan', ('kelurahan') : 'Tanjung Duren Selatan', ('kecamatan') : 'Grogol petamburan'
        , ('kota') : 'Jakarta Barat', ('provinsi') : 'Daerah Khusus Ibukota Jakarta', ('kodePos') : '11470'], FailureHandling.STOP_ON_FAILURE)

// Set property value, loan value, and tenure
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Simulasi Pinjaman/Set property and loan value and tenure'), [('nilaiProperti') : '1500'
        , ('nilaiPinjaman') : '550', ('tenor') : '10'], FailureHandling.STOP_ON_FAILURE)

// Set Profil Kustomer with only BPKB as Agunan
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Profil Kustomer/Any Profil with BPKB as Agunan'), [('tujuan') : 'Bisnis'
        , ('agunan') : 'Ya'], FailureHandling.STOP_ON_FAILURE)
