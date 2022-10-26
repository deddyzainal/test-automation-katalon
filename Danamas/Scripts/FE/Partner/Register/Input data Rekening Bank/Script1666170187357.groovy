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

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Register/select_Bank'), FailureHandling.STOP_ON_FAILURE)

'select bank'
WebUI.click(findTestObject('FE/PARTNER/Register/select_Bank'))

WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Bank'), Bank)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Bank'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/Option - Bank', [('Bank') : Bank]))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/input_Nama pemilik rekening'), 2)

WebUI.click(findTestObject('FE/PARTNER/Register/input_Nama pemilik rekening'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_Nama pemilik rekening'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Nama pemilik rekening'), nama)

WebUI.click(findTestObject('FE/PARTNER/Register/input_Nomor rekening'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_Nomor rekening'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Nomor rekening'), norekening)

