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

//Click dropdown Status Pinjaman
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/List/Select - Status Pinjaman'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Select - Status Pinjaman'))

//Select status pinjaman option
//WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Origination/List/Option - Status Pinjaman', [('status_pinjaman'):status_pinjaman]), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Option - Status Pinjaman', [('status_pinjaman'):status_pinjaman]))

//Verify Status Pinjaman in the list match with selected option
WebUI.delay(3)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Origination/List/TextValue - Status'), status_pinjaman.toUpperCase())