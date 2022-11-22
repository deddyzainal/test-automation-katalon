import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
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

// User provides location which IVT cannot estimate
WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Kalkulator Properti/Cannot estimate property value'), [('jenisJaminan') : 'Rumah'
        , ('luasTanah') : '75', ('luasBangunan') : '85', ('lokasi') : 'Sekaran', ('kodePos') : '50229', ('kelurahan') : 'Sekaran'
        , ('kecamatan') : 'Gunung Pati', ('kota') : 'Semarang', ('provinsi') : 'Jawa Tengah'], FailureHandling.STOP_ON_FAILURE)
