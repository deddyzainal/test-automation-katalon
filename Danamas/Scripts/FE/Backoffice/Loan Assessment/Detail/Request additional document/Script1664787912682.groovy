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

//Click button Menu Lainnya
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Button - Menu Lainnya'))

//Click menu Request Tambahan Dokumen
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Menu - Request Tambahan Dokumen'))

//Input Nama Dokumen 1
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Input - Nama Dokumen'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Input - Nama Dokumen', [('no') : '1']), nama_dokumen_1)

//Input Deskripsi 1
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Input - Deskripsi', [('no') : '1']), deskripsi_1)

//Click button Tambah Dokumen
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Button - Tambah Dokumen'))

//Input Nama Dokumen 2
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Input - Nama Dokumen', [('no') : '2']), nama_dokumen_2)

//Input Deskripsi 2
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Input - Deskripsi', [('no') : '2']), deskripsi_2)

//Click button Tambah Dokumen
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Button - Tambah Dokumen'))

//Input Nama Dokumen 3
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Input - Nama Dokumen', [('no') : '3']), nama_dokumen_3)

//Input Deskripsi 3
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Input - Deskripsi', [('no') : '3']), deskripsi_3)

//Delete Dokumen 3
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Button - Delete', [('no') : '3']))

//Click button Ya, Kirim Permintaan
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/Button - Ya, Kirim Permintaan'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)