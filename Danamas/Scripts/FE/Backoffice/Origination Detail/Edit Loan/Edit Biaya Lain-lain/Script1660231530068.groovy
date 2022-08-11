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

WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Label - Biaya Lain-lain'), 3)

//Input Biaya Admin
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Biaya Admin'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Biaya Admin'), biaya_admin)

//Input Biaya Proteksi
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Biaya Proteksi'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Biaya Proteksi'), biaya_proteksi)

//Input Biaya Asuransi
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Biaya Asuransi'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Biaya Asuransi'), biaya_asuransi)

//Input Notary Fee
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Notary Fee'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Notary Fee'), notary_fee)

//Input Appraisal Fee
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Appraisal Fee'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Appraisal Fee'), appraisal_fee)