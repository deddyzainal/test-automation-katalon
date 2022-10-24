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

WebUI.click(findTestObject('FE/PARTNER/Logout/icon_akun'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Logout/agent_profil'), 3)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/Atur PIN'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/Atur PIN'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/Lupa PIN'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/Lupa PIN'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/button_Yakin'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/button_Yakin'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/input_Nama Ibu Kandung'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/input_Nama Ibu Kandung'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_Nama Ibu Kandung'), ibu)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut2'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/Text - Link untuk mengatur ulang PIN telah dikirim melalui email'), 
    5)

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Profil/Text - Link untuk mengatur ulang PIN telah dikirim melalui email'))

WebUI.click(findTestObject('FE/PARTNER/Profil/button_OK'))

WebUI.closeBrowser()

