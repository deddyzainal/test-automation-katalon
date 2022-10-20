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

//Click button Tambah Partner
WebUI.click(findTestObject('FE/Backoffice/Sales/Partner/List/Button - Tambah Partner'))

//Select Tipe Partner
WebUI.click(findTestObject('FE/Backoffice/Sales/Partner/Form/Select - Tipe Partner'))
WebUI.click(findTestObject('FE/Backoffice/Sales/Partner/Form/Option - Tipe Partner', [('tipe_partner') : tipe_partner]))

//Input Nama Partner
WebUI.setText(findTestObject('FE/Backoffice/Sales/Partner/Form/Input - Nama Partner'), nama_partner)

//Input Nama Bank
WebUI.setText(findTestObject('FE/Backoffice/Sales/Partner/Form/Input - Nama Bank'), nama_bank)

//Input Nama Pemilik Rekening
WebUI.setText(findTestObject('FE/Backoffice/Sales/Partner/Form/Input - Nama Pemilik Rekening'), nama_pemilik_rekening)

//Input Nomor Rekening
WebUI.scrollToElement(findTestObject('FE/Backoffice/Sales/Partner/Form/Input - Nomor Rekening'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Sales/Partner/Form/Input - Nomor Rekening'), nomor_rekening)

//Select Tipe Pembayaran Insentif
WebUI.click(findTestObject('FE/Backoffice/Sales/Partner/Form/Select - Tipe Pembayaran Insentif'))
WebUI.click(findTestObject('FE/Backoffice/Sales/Partner/Form/Option - Tipe Pembayaran Insentif', [('tipe_pembayaran_insentif') : tipe_pembayaran_insentif]))

//Click button Tambah Partner Baru
WebUI.scrollToElement(findTestObject('FE/Backoffice/Sales/Partner/Form/Button - Tambah Partner Baru'), 2)
WebUI.click(findTestObject('FE/Backoffice/Sales/Partner/Form/Button - Tambah Partner Baru'))

//Click button Confirm on the dialog
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Button - Confirm'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Common/Button - Confirm'))

//Verify success dialog is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Partner/Form/Snackbar - Subheading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Sales/Partner/Form/Snackbar - Subheading'), 'Berhasil menambahkan partner baru!', FailureHandling.STOP_ON_FAILURE)
