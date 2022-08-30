import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// Verify pre-screening text is displayed
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pre-screening/TextValue - Pre-screening Header'), 5)

WebUI.callTestCase(findTestCase('FE/LancarWeb/Pre-screening/Handle pre-screening error'), [:], FailureHandling.OPTIONAL)

// Wait for gimmick offer is given
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pre-screening/TextValue - Gimmick Header'), 30)

// Accept gimmick offer
WebUI.scrollToElement(findTestObject('FE/LancarWeb/Pre-screening/Button - AMBIL PENAWARAN'), 3)

WebUI.click(findTestObject('FE/LancarWeb/Pre-screening/Button - AMBIL PENAWARAN'))

// Verify leaving Pre-screening page
WebUI.verifyElementNotPresent(findTestObject('FE/LancarWeb/Pre-screening/Button - AMBIL PENAWARAN'), 3)

