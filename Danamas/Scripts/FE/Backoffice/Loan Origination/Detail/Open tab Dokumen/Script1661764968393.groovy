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

//Click tab Dokumen
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/Detail/Tab - Dokumen'), 3)

WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Tab - Dokumen'))

WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Origination/Detail/Tab - Dokumen'), 3)

//Verify element in Dokumen tab is present
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Label - Dokumen Agunan'))

//Open folder Dokumen Pribadi
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Dokumen Pribadi'))

WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Button - Unduh Foto KTP'), FailureHandling.STOP_ON_FAILURE)

//Download Foto KTP
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Download Foto KTP'), [:], FailureHandling.STOP_ON_FAILURE)

//Go back to folder Dokumen
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Click breadcrumb Dokumen'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Dokumen Finansial
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Dokumen Finansial'))

//Open folder Rekening Koran
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Rekening Koran'))

//Open folder Rekening Koran Bulan 1
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Rekening Koran 1'))

//Download Rekening Koran Bulan 1
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Download Rekening Koran 1'), [:], FailureHandling.STOP_ON_FAILURE)

//Go back to folder Rekening Koran
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Click breadcrumb Rekening Koran'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Rekening Koran Bulan 2
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Rekening Koran 2'))

//Go back to folder Rekening Koran
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Click breadcrumb Rekening Koran'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Rekening Koran Bulan 3
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Rekening Koran 3'))

//Go back to folder Dokumen Finansial
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Click breadcrumb Dokumen Finansial'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Slip Gaji
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Slip Gaji'))

//Go back to folder Dokumen Finansial
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Click breadcrumb Dokumen Finansial'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Izin Praktik
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Izin Praktik'))

//Go back to folder Dokumen Finansial
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Click breadcrumb Dokumen Finansial'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Faktur Perusahaan
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Faktur Perusahaan'))

//Open folder Faktur Perusahaan Bulan 1
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Faktur Perusahaan 1'))

//Go back to folder Faktur Perusahaan
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Click breadcrumb Faktur Perusahaan'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Faktur Perusahaan Bulan 2
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Faktur Perusahaan 2'))

//Go back to folder Faktur Perusahaan
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Click breadcrumb Faktur Perusahaan'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Faktur Perusahaan Bulan 3
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Faktur Perusahaan 3'))

//Go back to folder Dokumen
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Click breadcrumb Dokumen'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Dokumen Agunan
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Dokumen Agunan'))

//Download PBB
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Download PBB'), [:], FailureHandling.STOP_ON_FAILURE)

//Go back to folder Dokumen
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Click breadcrumb Dokumen'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Dokumen Tambahan
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Dokumen/Folder - Dokumen Tambahan'))