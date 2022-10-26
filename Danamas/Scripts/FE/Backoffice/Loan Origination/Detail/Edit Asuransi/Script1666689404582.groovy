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

//Click Edit Data button
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Origination/Detail/Asuransi/Button - Edit Data'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Asuransi/Button - Edit Data'))

//Input Asuransi Jiwa
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/Detail/Asuransi/Input - Asuransi Jiwa'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice/Loan Origination/Detail/Asuransi/Input - Asuransi Jiwa'), asuransi_jiwa)

//Input Asuransi Kebakaran
WebUI.setText(findTestObject('FE/Backoffice/Loan Origination/Detail/Asuransi/Input - Asuransi Kebakaran'), asuransi_kebakaran)

//Input Premi
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Origination/Detail/Asuransi/Input - Premi'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Loan Origination/Detail/Asuransi/Input - Premi'), premi)

//Click button Perbarui Informasi
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Asuransi/Button - Perbarui Informasi'))

//Click button Perbarui & Lanjutkan in confirmation dialog
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/Detail/Asuransi/Button - Perbarui dan Lanjutkan'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Asuransi/Button - Perbarui dan Lanjutkan'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Data asuransi telah diperbaharui!', FailureHandling.STOP_ON_FAILURE)