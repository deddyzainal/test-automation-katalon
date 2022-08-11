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

WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Label - Informasi Tambahan'), 3)

//Input Pengalaman Kerja
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Pengalaman Kerja'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Pengalaman Kerja'), pengalaman_kerja)

//Click dropdown Tipe Pekerjaan
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Select - Tipe Pekerjaan'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Select - Tipe Pekerjaan'))

//Select option Tipe Pekerjaan
WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Option - Tipe Pekerjaan', [('tipe_pekerjaan'):tipe_pekerjaan]), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Option - Tipe Pekerjaan', [('tipe_pekerjaan'):tipe_pekerjaan]))

//Click dropdown Kebutuhan Pinjaman
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Select - Kebutuhan Pinjaman'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Select - Kebutuhan Pinjaman'))

//Select option Kebutuhan Pinjaman
WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Option - Kebutuhan Pinjaman', [('kebutuhan_pinjaman'):kebutuhan_pinjaman]), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Option - Kebutuhan Pinjaman', [('kebutuhan_pinjaman'):kebutuhan_pinjaman]))

//Input Pendapatan Bulanan
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Pendapatan Bulanan'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Pendapatan Bulanan'), pendapatan_bulanan)