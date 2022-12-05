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
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Tab - Loan Terms'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Button - Ubah Loan'), 3, FailureHandling.STOP_ON_FAILURE)

//Open tab Loan Terms
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Tab - Loan Terms'), FailureHandling.STOP_ON_FAILURE)

//Open tab Funding Detail
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Tab - Funding Detail'), FailureHandling.STOP_ON_FAILURE)

//Open tab Disbursement
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Tab - Disbursement'), FailureHandling.STOP_ON_FAILURE)

//Open tab Payment
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Tab - Payment'), FailureHandling.STOP_ON_FAILURE)

//Open tab Judgemental Score
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Tab - Judgemental Score'), FailureHandling.STOP_ON_FAILURE)

//Open tab Riwayat Pinjaman
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Tab - Riwayat Pinjaman'), FailureHandling.STOP_ON_FAILURE)

//Open tab Additional Info
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Tab - Additional Info'), FailureHandling.STOP_ON_FAILURE)

//Open tab Bank Statement
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Tab - Bank Statement'), FailureHandling.STOP_ON_FAILURE)

//Open tab Pefindo
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Detail/Tab - Pefindo'), FailureHandling.STOP_ON_FAILURE)