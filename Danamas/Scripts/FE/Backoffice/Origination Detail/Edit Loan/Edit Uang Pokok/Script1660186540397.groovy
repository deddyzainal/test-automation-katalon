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

WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Label - Uang Pokok'), 3)

//Input Jumlah Pinjaman
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Jumlah Pinjaman'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Jumlah Pinjaman'), jumlah_pinjaman)

//Input Principal Amount Request
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Principal Amount Request'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Principal Amount Request'), principal_amount_request)

////Input Tanggal Terakhir Didanai
//WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Field - Tanggal Terakhir Didanai'), 3)
////WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Field - Tanggal Terakhir Didanai'))
//WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Tanggal Terakhir Didanai'), tanggal_terakhir_didanai)
//
////Input Tanggal Pencairan
//WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Field - Tanggal Pencairan'), 3)
////WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Field - Tanggal Pencairan'))
//WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Tanggal Pencairan'), tanggal_pencairan)
