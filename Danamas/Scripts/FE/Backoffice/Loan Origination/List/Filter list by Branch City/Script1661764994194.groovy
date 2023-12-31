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

//Filter list by Tipe Agent = 'Branch'
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by Tipe Agent'), [('tipe_agent') : 'Branch'], FailureHandling.STOP_ON_FAILURE)

//Click dropdown Branch City
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/List/Select - Branch City'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Select - Branch City'))

//Select branch city option
//WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Origination/List/Option - Branch City', [('branch_city') : branch_city]), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Option - Branch City', [('branch_city') : branch_city]))

WebUI.delay(2)


