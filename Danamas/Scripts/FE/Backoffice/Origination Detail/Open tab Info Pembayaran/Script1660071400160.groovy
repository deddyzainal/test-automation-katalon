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

//Click tab Info Pembayaran
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Tab - Info Pembayaran'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Tab - Info Pembayaran'))

WebUI.scrollToPosition(0, 620)

//Verify some values in Info Pembayaran tab is present
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Info Pembayaran/TextValue - Cicilan Ke'))

WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Info Pembayaran/TextValue - Jatuh Tempo Cicilan'))

WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Info Pembayaran/TextValue - Jumlah Tanggungan'))

WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Info Pembayaran/TextValue - Cicilan Pokok'))

WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Info Pembayaran/TextValue - Tanggungan Pokok'))

WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Info Pembayaran/TextValue - Status'))


