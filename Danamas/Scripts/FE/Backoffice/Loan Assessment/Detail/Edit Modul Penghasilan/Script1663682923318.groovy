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

//Click tab Modul Penghasilan
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Modul Penghasilan'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Modul Penghasilan'))

WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Label - Modul Penghasilan'), 5, FailureHandling.STOP_ON_FAILURE)

//Click button Edit
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Button - Edit'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Button - Edit'))

if(occupation == 'Pegawai Tetap') {
	//Input Penghasilan tahunan
	WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Penghasilan Slip Gaji/Input - Penghasilan Tahunan'), 2)
	WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Penghasilan Slip Gaji/Input - Penghasilan Tahunan'), penghasilan_tahunan)
	
	//Input Penghasilan bulanan
	//WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Penghasilan Slip Gaji/Input - Penghasilan Bulanan'), penghasilan_bulanan)
}
else if (occupation == 'Pekerja Profesional') {
	//Input Penghasilan rekening koran bulan 1
	WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Penghasilan Rekening Koran/Input - Bulan 1'), penghasilan_bulan_1)
	
	//Input Penghasilan rekening koran bulan 2
	WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Penghasilan Rekening Koran/Input - Bulan 2'), penghasilan_bulan_2)
	
	//Input Penghasilan rekening koran bulan 3
	WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Penghasilan Rekening Koran/Input - Bulan 3'), penghasilan_bulan_3)
}

//Input EBIT
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Jumlah Penghasilan/Input - EBIT'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Jumlah Penghasilan/Input - EBIT'), ebit)

//Input Penghasilan rata-rata per bulan pasangan
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Jumlah Penghasilan/Input - Penghasilan Perbulan Pasangan'))
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Jumlah Penghasilan/Input - Penghasilan Perbulan Pasangan'), penghasilan_perbulan_pasangan)

WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Jumlah Penghasilan/Input - Bulan 1'))

//Verify Bulan 1, 2, 3 are calculated
WebUI.verifyNotMatch(WebUI.getText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Jumlah Penghasilan/Input - Bulan 1')), '0', false, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyNotMatch(WebUI.getText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Jumlah Penghasilan/Input - Bulan 2')), '0', false, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyNotMatch(WebUI.getText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Jumlah Penghasilan/Input - Bulan 3')), '0', false, FailureHandling.STOP_ON_FAILURE)

//Click button Save
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Button - Save'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Button - Save'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Modul Penghasilan/Snackbar - Heading'), 'Sukses!', FailureHandling.STOP_ON_FAILURE)