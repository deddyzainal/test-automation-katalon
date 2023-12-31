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
//WebUI.callTestCase(findTestCase('FE/Partner/Login/Login with credential'), [('nomorhp') : '20220921163134', ('katasandi') : GlobalVariable.password], 
//    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Menu Pengajuan/List/Menu Pengajuan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Menu Pengajuan/List/Filter/Filter by Status'), [('status') : 'passed'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Menu Pengajuan/List/Cari Aplikasi by No Pinjaman'), [('nama_peminjam') : nama_peminjam], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/status_Passed'))

WebUI.scrollToElement(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Unggah Ulang Dokumen'), 2)

WebUI.verifyTextPresent('Unggah Ulang Dokumen', false)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Unggah Ulang Dokumen'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Unggah Ulang Dokumen'), 2)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Upload resubmission'), FailureHandling.STOP_ON_FAILURE)

File file1 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file2 = new File('Data Files/PartnerWeb/imb.pdf')

File file3 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file4 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file5 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file6 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file7 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file8 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file9 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file10 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file11 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file12 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file13 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file14 = new File('Data Files/PartnerWeb/pbb.jpeg')

File file15 = new File('Data Files/PartnerWeb/pbb.jpeg')

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file1.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file2.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file3.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file4.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file5.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file6.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file7.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file8.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file9.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file10.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file11.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file12.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file13.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file14.getAbsolutePath())

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah5'), file15.getAbsolutePath())

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/upload/close'), 2)

WebUI.click(findTestObject('FE/PARTNER/upload/close'))

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_Kirim Kelengkapan Data'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/button_ Unggah Ulang Dokumen'), 5)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/button_Kirim'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Perbaikan dokumen telah berhasil dikirim', false)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('SUBMITTED', false)

WebUI.closeBrowser()

