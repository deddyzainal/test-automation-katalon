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

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Slip Gaji or SPT'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Slip Gaji or SPT'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Rekening Koran Gaji Bulan 1'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Rekening Koran Gaji Bulan 1'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Rekening Koran Gaji Bulan 2'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Rekening Koran Gaji Bulan 2'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Rekening Koran Gaji Bulan 3'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Rekening Koran Gaji Bulan 3'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.scrollToPosition(300, 400)

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Foto Selfie dengan ID Card'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Selfie dengan ID Card'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Surat Keterangan Kerja'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Surat Keterangan Kerja'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Rekening Koran Operasional Bulan 1'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Rekening Koran Operasional Bulan 1'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Rekening Koran Operasional Bulan 2'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Rekening Koran Operasional Bulan 2'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.scrollToPosition(500, 600)

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Rekening Koran Operasional Bulan 3'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Rekening Koran Operasional Bulan 3'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Bukti Transaksi Usaha'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Bukti Transaksi Usaha'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Foto Izin Usaha'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Izin Usaha'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Foto Tempat Usaha'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Tempat Usaha'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.scrollToPosition(800, 900)

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Selfie dengan Latar Tempat Usaha'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Selfie dengan Latar Tempat Usaha'), [:], FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Unggah Izin Praktik'), 3, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Izin Praktik'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('FE/PARTNER/Profil/button_Simpan'))

