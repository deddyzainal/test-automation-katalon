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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

String timestamp = new Date().format('yyyyMMddHHmmss')

System.print(timestamp + '****')

GlobalVariable.timestamp = timestamp

WebUI.callTestCase(findTestCase('FE/Partner/Register/Input data KTP'), [('gender') : 'Laki-laki', ('Agama') : 'Islam', ('nama') : 'bambang'
        , ('tempatlahir') : 'Jakarta', ('statusPerkawinan') : 'Kawin', ('alamat') : 'JL Sungai sambas', ('rt') : '10/', ('kodepos') : '12334'
        , ('rw') : '05', ('date1') : '10-Agustus', ('eYear') : '1999', ('timestamp1') : GlobalVariable.timestamp, ('fax') : '13123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut (1)'))

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Register/select_Bank'), FailureHandling.STOP_ON_FAILURE)

'select bank'
WebUI.click(findTestObject('FE/PARTNER/Register/select_Bank'))

WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Bank'), Bank)

WebUI.verifyTextPresent('Data yang kamu cari tidak tersedia', false)

WebUI.closeBrowser()

