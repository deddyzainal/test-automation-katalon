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

//Search loan by No Pinjaman
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by ID Pinjaman'), [('no_pinjaman') : no_pinjaman], 
    FailureHandling.STOP_ON_FAILURE)

//Click checkbox on the list
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Checkbox - Origination List'))

//Click Tugaskan
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Button - Tugaskan'))

//Select Telesales
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/List/Penugasan Telesales/Select - Nama Telesales'), 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Penugasan Telesales/Select - Nama Telesales'))

WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Penugasan Telesales/Option - Nama Telesales', [('nama_telesales') : nama_telesales]))

//Click button Tugaskan
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Penugasan Telesales/Button - Tugaskan'))

//Verify telesales is assigned by checking value on the list
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by ID Pinjaman'), [('no_pinjaman') : no_pinjaman],
	FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Origination/List/TextValue - Telesales'), nama_telesales, FailureHandling.STOP_ON_FAILURE)

