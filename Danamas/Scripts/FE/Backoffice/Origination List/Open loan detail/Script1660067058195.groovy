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

//Click on the list (data row 1)
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination List/Table - Row 1'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination List/Table - Row 1'))

WebUI.waitForPageLoad(5)

//Verify some values (Nama, Gender, Loan Id, loan detail table, Status Pinjaman) in detail page is visible
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/TextValue - Nama'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/TextValue - Gender'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/TextValue - Loan Id'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Table - Loan Detail'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Informasi Pinjaman/TextValue - Status Pinjaman'))