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

//Upload Foto Rekening Koran Operasional
WebUI.scrollToElement(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Rekening Koran Operasional'), 2)
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Rekening Koran Operasional'), rekening_koran_operasional)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Rekening Koran Operasional'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Bukti Transaksi Usaha
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Bukti Transaksi Usaha'), bukti_transaksi_usaha)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Bukti Transaksi Usaha'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Izin Usaha
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Izin Usaha'), izin_usaha)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Izin Usaha'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Foto Tempat Usaha
WebUI.scrollToElement(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Tempat Usaha'), 2)
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Tempat Usaha'), tempat_usaha)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Tempat Usaha'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Foto Selfie dengan Tempat Usaha
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Selfie dengan Tempat Usaha'), selfie_ditempat_usaha)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Selfie dengan Tempat Usaha'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Slip Gaji
WebUI.scrollToElement(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Slip Gaji'), 2)
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Slip Gaji'), slip_gaji)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Slip Gaji'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Rekening Koran Payroll
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Rekening Koran Payroll'), rekening_koran_payroll)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Rekening Koran Payroll'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Foto Selfie ditempat Kerja
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Selfie ditempat Kerja'), selfie_ditempat_kerja)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Selfie ditempat Kerja'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Surat Keterangan Kerja
WebUI.scrollToElement(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Surat Keterangan Kerja'), 2)
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Surat Keterangan Kerja'), surat_keterangan_kerja)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Surat Keterangan Kerja'), 8, FailureHandling.STOP_ON_FAILURE)
