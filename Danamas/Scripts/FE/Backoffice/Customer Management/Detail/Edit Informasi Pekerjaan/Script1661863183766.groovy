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
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Button - Edit Data'))

WebUI.waitForPageLoad(3)

//Select Pekerjaan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Select - Pekerjaan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Option - Pekerjaan', [('pekerjaan'):pekerjaan]))

//Select Tipe Pekerjaan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Select - Tipe Pekerjaan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Option - Tipe Pekerjaan', [('tipe_pekerjaan'):tipe_pekerjaan]))

//Select Lama Bekerja
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Select - Lama Bekerja'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Option - Lama Bekerja', [('lama_bekerja'):lama_bekerja]))

//Select Sumber Pendapatan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Select - Sumber Pendapatan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Option - Sumber Pendapatan', [('sumber_pendapatan'):sumber_pendapatan]))

//Input Pendapatan Bulanan
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Input - Pendapatan Bulanan'), pendapatan_bulanan)

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Pekerjaan/Button - Simpan'))

//Click button Confirm on onfirmation modal
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Button - Confirm'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Common/Button - Confirm'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Sukses Mengubah Data', FailureHandling.STOP_ON_FAILURE)


