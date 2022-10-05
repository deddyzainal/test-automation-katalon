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

WebUI.scrollToElement(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Label - Dokumen Agunan'), 0, FailureHandling.STOP_ON_FAILURE)

//Upload Foto PBB Baru
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto PBB Baru'), pbb)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto PBB Baru'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Foto sertifikat kepemilikan
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Sertifikat Kepemilikan'), sertifikat_kepemilikan)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Sertifikat Kepemilikan'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Foto IMB
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto IMB'), imb)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto IMB'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Foto Agunan Tampak Dalam
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Agunan Tampak Dalam'), agunan_tampak_dalam)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Agunan Tampak Dalam'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Foto Agunan Tampak Depan
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Agunan Tampak Depan'), agunan_tampak_depan)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Agunan Tampak Depan'), 8, FailureHandling.STOP_ON_FAILURE)

//Upload Foto Akses Jalan Masuk ke Agunan
WebUI.scrollToElement(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Akses Jalan Masuk ke Agunan'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Akses Jalan Masuk ke Agunan'), akses_jalan_masuk)
WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Akses Jalan Masuk ke Agunan'), 8, FailureHandling.STOP_ON_FAILURE)
