import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Filter list by Tipe Agent = 'Partner'
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by Tipe Agent'), [('tipe_agent') : 'Partner'], FailureHandling.STOP_ON_FAILURE)

//Click dropdown Tipe Partner
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/List/Select - Tipe Partner'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Select - Tipe Partner'))

//Select tipe partner option
//ßWebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Origination/List/Option - Tipe Partner', [('tipe_partner') : tipe_partner]), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Option - Tipe Partner', [('tipe_partner') : tipe_partner]))

WebUI.delay(3)