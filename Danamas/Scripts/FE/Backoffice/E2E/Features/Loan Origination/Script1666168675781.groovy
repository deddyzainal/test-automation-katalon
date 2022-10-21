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

//WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Loan Origination'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by ID Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by Nama'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by No Telepon'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by Nama Telesales'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by Tipe Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by Status Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by Sumber Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by Branch Name'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by Nama Partner'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Assign Telesales'), [('no_pinjaman') : no_pinjaman], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Open loan detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Open Customer detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.back()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Open tab Rincian Biaya Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Edit Rincian Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Open tab Detail Agunan'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Edit Informasi Agunan'), null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Open tab Detail RM Agen'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Open tab Pencairan'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Open tab Pembayaran'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Open tab Asuransi'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Open tab Riwayat Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Open tab Dokumen'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Open tab Riwayat Status Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)
