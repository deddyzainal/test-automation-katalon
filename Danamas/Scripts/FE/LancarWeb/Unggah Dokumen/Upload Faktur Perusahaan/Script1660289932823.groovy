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

WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Tab - Dokumen Finansial'))

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Faktur Perusahaan'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Faktur Perusahaan'))

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah (popup)'), 2)
WebUI.uploadFile(findTestObject('FE/LancarWeb/Unggah Dokumen/Input - Upload file (popup)'), fakturPerusahaanFilepath)
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)'), 10)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)')), 'Faktur Perusahaan (3 Bulan Terakhir) - Bulan 1', false)
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - SELANJUTNYA (popup)'))
WebUI.verifyElementNotPresent(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)'), 5)

WebUI.uploadFile(findTestObject('FE/LancarWeb/Unggah Dokumen/Input - Upload file (popup)'), fakturPerusahaanFilepath)
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)'), 10)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)')), 'Faktur Perusahaan (3 Bulan Terakhir) - Bulan 2', false)
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - SELANJUTNYA (popup)'))
WebUI.verifyElementNotPresent(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)'), 5)

WebUI.uploadFile(findTestObject('FE/LancarWeb/Unggah Dokumen/Input - Upload file (popup)'), fakturPerusahaanFilepath)
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)'), 10)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)')), 'Faktur Perusahaan (3 Bulan Terakhir) - Bulan 3', false)
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - SIMPAN (popup)'))
WebUI.verifyElementNotPresent(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)'), 5)

WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Faktur Perusahaan')), '3 dokumen telah diunggah', false)