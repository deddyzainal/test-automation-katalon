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

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Profil/Profile_badge'))

badge = WebUI.getText(findTestObject('FE/PARTNER/Profil/Profile_badge'), FailureHandling.STOP_ON_FAILURE)

System.print(badge)

GlobalVariable.badge = badge

WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Beranda/img kalkulator pinjaman'), 10)

WebUI.click(findTestObject('FE/PARTNER/Beranda/img kalkulator pinjaman'), FailureHandling.STOP_ON_FAILURE)

//WebUI.sendKeys(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_nilai_property'), Keys.chord(Keys.CONTROL, 's'))
WebUI.click(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_nilai_property'))

WebUI.clearText(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_nilai_property'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_nilai_property'), '100')

//WebUI.sendKeys(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_nilai_property'), '100')
WebUI.click(findTestObject('FE/PARTNER/Kalkulator Pinjaman/button_Hitung Simulasi'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Kalkulator Pinjaman/button_Hitung Simulasi'), 3)

WebUI.click(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_jumlah_pinjaman'))

WebUI.clearText(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_jumlah_pinjaman'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Kalkulator Pinjaman/input_jumlah_pinjaman'), '75000000')

WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Kalkulator Pinjaman/Pilih_tenor_pinjaman'), '3', false)

WebUI.click(findTestObject('FE/PARTNER/Kalkulator Pinjaman/button_Hitung Simulasi2'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Kalkulator Pinjaman/button_Hitung Simulasi2'), 10)

WebUI.click(findTestObject('FE/PARTNER/Kalkulator Pinjaman/button_Ajukan Pinjaman'))

