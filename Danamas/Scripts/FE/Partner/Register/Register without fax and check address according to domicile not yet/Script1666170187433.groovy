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

WebUI.callTestCase(findTestCase('FE/Partner/Register/List/Input Data/Input data KTP'), [('gender') : 'Laki-laki', ('Agama') : 'Islam', ('nama') : 'bambang'
        , ('tempatlahir') : 'Jakarta', ('statusPerkawinan') : 'Kawin', ('alamat') : 'JL Sungai sambas', ('rt') : '10/', ('kodepos') : '12334'
        , ('rw') : '05', ('date1') : '10-Agustus', ('eYear') : '1999', ('timestamp1') : GlobalVariable.timestamp, ('fax') : '13123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/check_alamatdomisili'), 2)

WebUI.check(findTestObject('FE/PARTNER/Profil/check_alamatdomisili'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'))

WebUI.clearText(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'), alamat2)

WebUI.click(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'), rt)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'), rw)

WebUI.click(findTestObject('FE/PARTNER/Register/Masukkan kode pos'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/Masukkan kode pos'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/Masukkan kode pos'), kodepos)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut (1)'))

WebUI.callTestCase(findTestCase('FE/Partner/Register/List/Input Data/Input data Rekening Bank'), [('nama') : 'saya\t', ('norekening') : '1235167871'
        , ('Bank') : 'bni'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut (1)'))

