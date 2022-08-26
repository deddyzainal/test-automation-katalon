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

//Filter list by Sumber Pinjaman = 'Agent'
WebUI.callTestCase(findTestCase('FE/Backoffice/Origination List/Filter list by Sumber Pinjaman'), [('sumber_pinjaman') : 'Agent'], FailureHandling.STOP_ON_FAILURE)

//Click dropdown Tipe Agent
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination List/Select - Tipe Agent'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination List/Select - Tipe Agent'))

//Select tipe agent option
//WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination List/Option - Tipe Agent', [('tipe_agent') : tipe_agent]), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination List/Option - Tipe Agent', [('tipe_agent') : tipe_agent]))

WebUI.waitForPageLoad(5)