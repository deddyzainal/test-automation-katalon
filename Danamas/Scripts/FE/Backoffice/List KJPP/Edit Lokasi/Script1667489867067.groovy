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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Click button edit on the list
WebUI.mouseOver(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/DataTable - Row'))
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/Button - Edit'))

//Select Provinsi
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/Select - Provinsi'))
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/Option - Provinsi', [('provinsi') : provinsi]))

//Select Kota
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/Select - Kota'))
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/Option - Kota', [('kota') : kota]))

//Input Nama PIC
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/Input - Nama PIC'), nama_pic)

//Select Kode Negara
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/Select - Kode Negara'))
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/Option - Kode Negara', [('negara') : negara]))

//Input No Telepon PIC
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/Input - No Telepon PIC'), no_telepon_pic)

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Lokasi/Button - Simpan'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Subheading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Subheading'), 'Berhasil mengedit lokasi', FailureHandling.STOP_ON_FAILURE)