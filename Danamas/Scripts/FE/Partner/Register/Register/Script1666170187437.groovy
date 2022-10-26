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

String timestamp = new Date().format('yyyyMMddHHmmss')

WebUI.openBrowser(GlobalVariable.PartnerWeb)

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/button_Buat Akun'), 5)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Buat Akun'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/input_Nomor HP'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/input_Nomor HP'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Nomor HP'), timestamp)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/button_Lanjut'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/input - OTP'), 3)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

