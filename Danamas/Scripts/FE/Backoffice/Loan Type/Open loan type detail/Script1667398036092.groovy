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
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/List/DataTable - Row', [('jenis_pinjaman') : jenis_pinjaman]), 4, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Loan Type/List/DataTable - Row', [('jenis_pinjaman') : jenis_pinjaman]))

WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Button - Ubah Detail'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Jumlah Pokok Pinjaman Minimum'), FailureHandling.STOP_ON_FAILURE)

//Click tab Jumlah Pendanaan Minimum
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Jumlah Pendanaan Minimum'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Jumlah Pendanaan Minimum'), FailureHandling.STOP_ON_FAILURE)

//Click tab Bunga Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Bunga Pinjaman'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Metode Bunga Pinjaman'), FailureHandling.STOP_ON_FAILURE)

//Click tab Durasi Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Durasi Pinjaman'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Periode Durasi Pinjaman'), FailureHandling.STOP_ON_FAILURE)

//Click tab Pencairan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Pencairan'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Jadwal Pencairan'), FailureHandling.STOP_ON_FAILURE)

//Click tab Pembayaran Pemberi Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Pembayaran Pemberi Pinjaman'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Jadwal Pembayaran'), FailureHandling.STOP_ON_FAILURE)

//Click tab Biaya-Biaya
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Biaya-Biaya'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Biaya Admin'), FailureHandling.STOP_ON_FAILURE)

//Click tab LTV
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - LTV'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Maksimum Nilai LTV'), FailureHandling.STOP_ON_FAILURE)

//Click tab Perusahaan Penjamin
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Perusahaan Penjamin'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Perusahaan Penjamin'), FailureHandling.STOP_ON_FAILURE)

//Click tab Denda
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Denda'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Tipe Denda Pemberi Pinjaman'), FailureHandling.STOP_ON_FAILURE)

//Click tab Floating Rate
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Floating Rate'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Tenor'), FailureHandling.STOP_ON_FAILURE)

//Click tab Jaminan Pembayaran
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Jaminan Pembayaran'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Jaminan Pembayaran'), FailureHandling.STOP_ON_FAILURE)

//Click tab Informasi Tambahan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Detail/Tab - Informasi Tambahan'))
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Type/Detail/Label - Nama'), FailureHandling.STOP_ON_FAILURE)