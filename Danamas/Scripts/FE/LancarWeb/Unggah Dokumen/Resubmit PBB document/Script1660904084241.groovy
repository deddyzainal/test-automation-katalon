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

// Open Lancar page
WebUI.navigateToUrl(GlobalVariable.LancarWeb)
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Login as borrower
WebUI.callTestCase(findTestCase('FE/LancarWeb/Login/Login with credential'), [('nomorTelepon') : GlobalVariable.datetime, ('password') : GlobalVariable.defaultPassword], 
    FailureHandling.STOP_ON_FAILURE)

// Open Dokumen Agunan tab
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Tab - Dokumen Agunan'), 30)
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Tab - Dokumen Agunan'))

// Open PBB reupload dialog
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Kembali PBB'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokument/Button - Unggah Kembali PBB'))

// Reupload PBB file
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Text - Resubmission request message'), 10)
WebUI.uploadFile(findTestObject('FE/LancarWeb/Unggah Dokumen/Input - Upload file (popup)'), pbbFilepath)
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)'), 20)
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - SIMPAN (popup)'))

// Verify PBB file reuploaded successfully
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah PBB Terbaru'), 5)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah PBB Terbaru')), "1 dokumen telah diunggah", false)

// Submit all documents
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - KIRIM (enabled)'))

// Verify resubmission success
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Text - Pengajuan pinjaman telah diajukan'), 30)