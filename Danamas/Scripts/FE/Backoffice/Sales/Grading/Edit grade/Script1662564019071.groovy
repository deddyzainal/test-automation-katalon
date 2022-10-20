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

//Click button Ubah Informasi
WebUI.click(findTestObject('FE/Backoffice/Sales/Grading/Detail/Button - Ubah Informasi'))

//Input Nominal Target Penjualan
WebUI.setText(findTestObject('FE/Backoffice/Sales/Grading/Form/Input - Nominal Target Penjualan'), nominal_target_penjualan)

//Input Persentase Pencapaian
WebUI.setText(findTestObject('FE/Backoffice/Sales/Grading/Form/Input - Persentase Pencapaian'), persentase_pencapaian)

//Input Persentase Pencapaian
WebUI.setText(findTestObject('FE/Backoffice/Sales/Grading/Form/Input - Persentase Pencapaian'), persentase_pencapaian)

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Sales/Grading/Form/Button - Simpan'))

//Click button Confirm on the dialog
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Button - Confirm'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Common/Button - Confirm'))

//Verify success dialog is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Grading/Form/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Sales/Grading/Form/Snackbar - Heading'), 'Informasi Grade berhasil diubah', FailureHandling.STOP_ON_FAILURE)
