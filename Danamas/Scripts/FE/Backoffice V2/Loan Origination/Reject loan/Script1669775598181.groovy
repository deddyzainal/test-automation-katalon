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

//Click data on the list
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/List/DataTable - Row 1'), FailureHandling.STOP_ON_FAILURE)

//Click button Cancel
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Button - Cancel'), FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Select - Tipe Cancel'), 2, FailureHandling.STOP_ON_FAILURE)

//Select REJECT in dropdown
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Select - Tipe Cancel'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Select - Option', [('option') : 'Reject']), FailureHandling.STOP_ON_FAILURE)

//Input Reason
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Input - Reason'), reason, FailureHandling.STOP_ON_FAILURE)

//Click button Confirm on confirmation dialog
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Button - Confirm'), FailureHandling.STOP_ON_FAILURE)

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Snackbar'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Snackbar'), 'Success', FailureHandling.STOP_ON_FAILURE)

//Verify status in detail page is 'REJECTED'
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/Loan Origination/Detail/TextValue - Status'), 'REJECTED', FailureHandling.STOP_ON_FAILURE)