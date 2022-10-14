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
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Rekening Koran Operasional'
        , ('file') : rekening_koran_operasional], FailureHandling.STOP_ON_FAILURE)

//Upload Bukti Transaksi Usaha
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Bukti Transaksi Usaha'
        , ('file') : bukti_transaksi_usaha], FailureHandling.STOP_ON_FAILURE)

//Upload Izin Usaha
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Izin Usaha'
        , ('file') : izin_usaha], FailureHandling.STOP_ON_FAILURE)

//Upload Foto Tempat Usaha
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Tempat Usaha'
        , ('file') : tempat_usaha], FailureHandling.STOP_ON_FAILURE)

//Upload Foto Selfie dengan Tempat Usaha
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Selfie dengan Tempat Usaha'
        , ('file') : selfie_ditempat_usaha], FailureHandling.STOP_ON_FAILURE)

//Upload Slip Gaji
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Slip Gaji'
        , ('file') : slip_gaji], FailureHandling.STOP_ON_FAILURE)

//Upload Rekening Koran Payroll
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Rekening Koran Payroll'
        , ('file') : rekening_koran_payroll], FailureHandling.STOP_ON_FAILURE)

//Upload Foto Selfie ditempat Kerja
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Selfie ditempat Kerja'
        , ('file') : selfie_ditempat_kerja], FailureHandling.STOP_ON_FAILURE)

//Upload Surat Keterangan Kerja
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Surat Keterangan Kerja'
        , ('file') : surat_keterangan_kerja], FailureHandling.STOP_ON_FAILURE)
