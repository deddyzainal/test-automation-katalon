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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Click button Edit Data
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Button - Edit Data'))

WebUI.waitForPageLoad(3)

//Input NIK Penjamin
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Input - NIK Penjamin'), nik_penjamin)

//Input Nama Penjamin
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Input - Nama Penjamin'), nama_penjamin)

//Select Kota
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Select - Kota'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Option - Kota', [('kota'):kota]))

//Input Tanggal Lahir
//WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Input - Tanggal Lahir'), tanggal_lahir)

//Input Alamat
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Input - Alamat'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Input - Alamat'), alamat)

//Input No Telepon
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Input - No Telepon'), no_telepon)

//Select Hubungan dengan Peminjam
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Select - Relasi'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Option - Relasi', [('relasi'):relasi]))

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Penjamin/Button - Simpan'))

//Click button Confirm on onfirmation modal
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Button - Confirm'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Common/Button - Confirm'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Sukses Mengubah Data', FailureHandling.STOP_ON_FAILURE)


