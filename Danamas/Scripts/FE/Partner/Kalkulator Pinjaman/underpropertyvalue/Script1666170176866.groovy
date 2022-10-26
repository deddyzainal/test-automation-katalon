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

WebUI.openBrowser(GlobalVariable.PartnerWeb)

WebUI.callTestCase(findTestCase('FE/Partner/Login/Login with credential'), [('nomorhp') : '20220921163134', ('katasandi') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Beranda/img kalkulator pinjaman'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/img kalkulator pinjaman'), FailureHandling.STOP_ON_FAILURE)

//WebUI.sendKeys(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_nilai_property'), Keys.chord(Keys.CONTROL, 's'))
WebUI.click(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_nilai_property'))

WebUI.clearText(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_nilai_property'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_nilai_property'), '50')

WebUI.verifyTextPresent('Nilai minimum properti Rp 70,000,000', false)

//WebUI.sendKeys(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_nilai_property'), '100')
//WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Kalkulator Pinjaman/Nilai minimum properti'), 0)
WebUI.closeBrowser()

