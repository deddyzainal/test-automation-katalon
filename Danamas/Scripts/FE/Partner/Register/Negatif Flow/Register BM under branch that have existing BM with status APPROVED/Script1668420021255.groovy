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

WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), [('email') : GlobalVariable.BackofficeEmail
        , ('password') : GlobalVariable.BackofficePassword], FailureHandling.STOP_ON_FAILURE)

//Click menu Request
WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Request'), [:], FailureHandling.STOP_ON_FAILURE)

//Filter list by No HP
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Request/Filter list by No HP'), [('nomor_hp') : nohp], FailureHandling.STOP_ON_FAILURE)

//Approve request
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Request/Approve request'), [:], FailureHandling.STOP_ON_FAILURE)

//Verify status is Approved
WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Request/Filter list by No HP'), [('nomor_hp') : nohp], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('FE/Backoffice/Sales/Request/List/TextValue - Status'), 'Approved', FailureHandling.STOP_ON_FAILURE)

String timestamp = new Date().format('yyyyMMddHHmmss')

System.print(timestamp + '****')

GlobalVariable.timestamp = timestamp

WebUI.callTestCase(findTestCase('FE/Partner/Register/Input data KTP'), [('gender') : 'Laki-laki', ('Agama') : 'Islam', ('nama') : 'bambang'
        , ('tempatlahir') : 'Jakarta', ('statusPerkawinan') : 'Kawin', ('alamat') : 'JL Sungai sambas', ('rt') : '10/', ('kodepos') : '12334'
        , ('rw') : '05', ('date1') : '10-Agustus', ('eYear') : '1999', ('timestamp1') : GlobalVariable.timestamp, ('fax') : '13123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut (1)'))

WebUI.callTestCase(findTestCase('FE/Partner/Register/Input data Rekening Bank'), [('nama') : 'saya\t', ('norekening') : '1235167871'
        , ('Bank') : 'BNI'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut (1)'))

'select agen'
WebUI.click(findTestObject('FE/PARTNER/Register/select_Agen'))

if (Agen.toLowerCase() == 'branch') {
    WebUI.click(findTestObject('/FE/PARTNER/Beranda/Option - Branch'))

    WebUI.callTestCase(findTestCase('FE/Partner/Register/Input data Agen Branch'), [('kota') : 'Bangli', ('cabang') : 'test'
            , ('posisi') : 'Branch Manager'], FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyTextPresent('Akun Branch Manager Telah Terdaftar', false)
}

WebUI.closeBrowser()

