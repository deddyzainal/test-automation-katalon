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

WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), [:])
WebUI.callTestCase(findTestCase('FE/Backoffice/Origination List/Filter list by Status Pinjaman'), [('status_pinjaman') : 'Passed'])
WebUI.callTestCase(findTestCase('FE/Backoffice/Origination List/Open loan detail'), [:])
WebUI.callTestCase(findTestCase('FE/Backoffice/Origination Detail/Click Ubah button'), [:])

WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Label - Collateral'), 3)

//Input Collateral NJOP
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Collateral NJOP'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Collateral NJOP'), collateral_njop)

//Click dropdown Collateral Ownership
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Select - Collateral Ownership'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Select - Collateral Ownership'))

//Select option Collateral Ownership
WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Option - Collateral Ownership', [('collateral_ownership'):collateral_ownership]), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Option - Collateral Ownership', [('collateral_ownership'):collateral_ownership]))