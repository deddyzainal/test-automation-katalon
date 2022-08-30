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

// Click link Hubungi Kami in header
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Link - Hubungi Kami (Header)'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Home/Link - Hubungi Kami (Header)'))

// Verify Hubungi Kami page is opened
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Misc pages/Text - Bicara dengan kami title'), 10)

// Return to Home, then click link Hubungi Kami in footer
WebUI.back()
WebUI.scrollToElement(findTestObject('FE/LancarWeb/Home/Link - Hubungi Kami (Footer)'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Home/Link - Hubungi Kami (Footer)'))

// Verify Hubungi Kami page is opened
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Misc pages/Text - Bicara dengan kami title'), 10)