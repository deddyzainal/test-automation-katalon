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

WebUI.click(findTestObject('FE/PARTNER/Agent/Menu_Agent'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/FE/PARTNER/Agent/Agent - RM'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Menu Agent/List/Relationship Manager'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/FE/PARTNER/Agent/Agent - Lepasan'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Menu Agent/List/Agent Lepasan'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Agent/Daftar Agen'))

WebUI.click(findTestObject('FE/PARTNER/Agent/input_Daftar Agen'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Agent/input_Daftar Agen'), nama_nohp)

WebUI.waitForElementPresent(findTestObject('FE/PARTNER/Agent/NoHP - Agent'), 5)

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Agent/NoHP - Agent'))

WebUI.click(findTestObject('FE/PARTNER/Agent/NoHP - Agent'))

