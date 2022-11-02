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

WebUI.callTestCase(findTestCase('FE/Partner/Login/Login with credential'), [('nomorhp') : GlobalVariable.timestamp, ('katasandi') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Menu Pengajuan/Menu Pengajuan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Menu Pengajuan/Filter by Status'), [('status') : 'passed'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Menu Pengajuan/Cari Aplikasi by No Pinjaman'), [('nama_peminjam') : 'Debby Anggraini'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/status_Passed'))

WebUI.scrollToElement(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Unggah Ulang Dokumen'), 2)

WebUI.verifyTextPresent('Unggah Permintaan Dokumen', false)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Unggah Ulang Dokumen'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Unggah Ulang Dokumen'), 2)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Upload resubmission'), FailureHandling.STOP_ON_FAILURE)

File file1 = new File('Data Files/PartnerWeb/dokumen1.jpeg')

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file1.getAbsolutePath())

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/upload/close'), 2)

WebUI.click(findTestObject('FE/PARTNER/upload/close'))

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Upload resubmission2'), FailureHandling.STOP_ON_FAILURE)

File file2 = new File('Data Files/PartnerWeb/dokumen2.jpeg')

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file2.getAbsolutePath())

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/upload/close'), 2)

WebUI.click(findTestObject('FE/PARTNER/upload/close'))

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_Kirim Kelengkapan Data'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Unggah Ulang Dokumen'), 5)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_Kirim'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Permintaan dokumen telah berhasil dikirim', false)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('SUBMITTED', false)

WebUI.closeBrowser()

