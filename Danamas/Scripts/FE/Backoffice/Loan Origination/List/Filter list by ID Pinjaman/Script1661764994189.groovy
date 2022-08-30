import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
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


//Input no pinjaman in No Pinjaman field
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/List/Input - ID Pinjaman'), 3)

CustomKeywords.'backoffice.common.setTextWithDelay'(findTestObject('FE/Backoffice/Loan Origination/List/Input - ID Pinjaman'), 
    no_pinjaman)

//WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Input - ID Pinjaman'))
//WebUI.sendKeys(findTestObject('FE/Backoffice/Loan Origination/List/Input - ID Pinjaman'), no_pinjaman)
//Verify No Pinjaman in the list match with inputted text
WebUI.waitForPageLoad(5)

WebUI.verifyMatch(WebUI.getText(findTestObject('FE/Backoffice/Loan Origination/List/TextValue - ID Pinjaman')), no_pinjaman.toUpperCase(), 
    true)
