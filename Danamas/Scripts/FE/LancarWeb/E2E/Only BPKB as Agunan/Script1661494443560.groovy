import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('BE/Register account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser(GlobalVariable.LancarWeb)

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

WebUI.callTestCase(findTestCase('FE/LancarWeb/Login/Login with credential'), [('nomorTelepon') : GlobalVariable.datetime
        , ('password') : GlobalVariable.defaultPassword], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarWeb/Kalkulator Properti/Use Google Map location'), [('luasTanah') : '75', ('luasBangunan') : '85'
        , ('lokasi') : 'Tanjung Duren Selatan', ('kelurahan') : 'TANJUNG DUREN SELATAN', ('kecamatan') : 'Grogol Petamburan'
        , ('kota') : 'Jakarta Barat', ('provinsi') : 'DKI Jakarta', ('kodePos') : '11470'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarWeb/Simulasi Pinjaman/Set property value, loan value, and tenure'), [('nilaiProperti') : '2000'
        , ('nilaiPinjaman') : '1250', ('tenor') : '10'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarWeb/Profil Kustomer/Any Profil with BPKB as Agunan'), [('tujuan') : 'pribadi', ('agunan') : 'ya'], 
    FailureHandling.STOP_ON_FAILURE)

