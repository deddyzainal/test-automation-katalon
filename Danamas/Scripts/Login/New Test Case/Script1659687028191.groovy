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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.lancar.id/')

WebUI.waitForElementVisible(findTestObject('Object Repository/Recorder/Home page/Button - Masuk'), 
    0)

WebUI.click(findTestObject('Object Repository/Recorder/Home page/Button - Masuk'))

WebUI.waitForElementVisible(findTestObject('null'), 
    0)

WebUI.setText(findTestObject('null'), 
    '20220804154545')

WebUI.click(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 
    0)

WebUI.setEncryptedText(findTestObject('null'), 
    'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.click(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('null'), 
    0)

WebUI.closeBrowser()
