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

WebUI.click(findTestObject('FE/PARTNER/Logout/icon_akun'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Logout/agent_profil'), 3)

WebUI.click(findTestObject('FE/PARTNER/Profil/Atur PIN'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/input_Buat PIN baru'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/input_Buat PIN baru'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_Buat PIN baru'), newpin)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/input_Ketik ulang PIN'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/input_Ketik ulang PIN'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_Ketik ulang PIN'), newpin)

WebUI.click(findTestObject('FE/PARTNER/Profil/button_SimpanPIN'))

WebUI.verifyTextPresent(text, false)

WebUI.click(findTestObject('FE/PARTNER/Profil/button_OKpin'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/button_OKpin'), 3)

