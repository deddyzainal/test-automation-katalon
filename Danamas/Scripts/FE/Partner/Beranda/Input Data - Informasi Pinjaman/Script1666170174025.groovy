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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/4_Informasi Pinjaman'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/4_Informasi Pinjaman'), FailureHandling.STOP_ON_FAILURE)

// select tipe peminjam
WebUI.click(findTestObject('FE/PARTNER/Beranda/select_tipe peminjam'))

if (tipepeminjam.toLowerCase() == 'individual') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/Option - Individual'))
}

// select tujuan pinjaman
WebUI.click(findTestObject('FE/PARTNER/Beranda/select_tujuan pinjaman'))

if (tujuanpinjaman.toLowerCase() == 'pribadi') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/Option - Pribadi'))
} else if (tujuanpinjaman.toLowerCase() == 'bisnis') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/Option - Bisnis'))
}

// select jumlah pinjaman
WebUI.click(findTestObject('FE/PARTNER/Beranda/input_jumlah pinjaman'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_jumlah pinjaman'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_jumlah pinjaman'), jumlah_pinjaman)

WebUI.scrollToElement(findTestObject('FE/PARTNER/Beranda/input_jumlah pinjaman'), 2)

// select tenor
WebUI.click(findTestObject('FE/PARTNER/Beranda/select_Pilih tenor'))

WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Register/Option - Tenor'), tenor, false)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_nilai agunan'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_nilai agunan'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_nilai agunan'), nilai_Agunan)

if (badge == 'Branch') {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Formulir Persetujuan Pinjaman'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.check(findTestObject('FE/PARTNER/Beranda/Persetujuan Pinjaman'))

    WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Kirim'))

    WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Kirim2'))
} else {
    WebUI.check(findTestObject('FE/PARTNER/Beranda/Persetujuan Pinjaman'))

    WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Kirim'))

    WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Kirim2'))
}

