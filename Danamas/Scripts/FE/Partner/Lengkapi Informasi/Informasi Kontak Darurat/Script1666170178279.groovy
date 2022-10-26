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

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/input_Nama Penjamin'), 2)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/input_Nama Penjamin'))

WebUI.clearText(findTestObject('FE/PARTNER/Lengkapi Informasi/input_Nama Penjamin'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Lengkapi Informasi/input_Nama Penjamin'), nama)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'), nohp)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/select_hubungan'))

if (hubungan.toLowerCase() == 'anak') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Anak'))
} else if (hubungan.toLowerCase() == 'orang tua') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Orang Tua'))
} else if (hubungan.toLowerCase() == 'istri/suami') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Istri or Suami'))
} else if (hubungan.toLowerCase() == 'saudara') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Saudara'))
}

WebUI.click(findTestObject('FE/PARTNER/Profil/button_Simpan'), FailureHandling.STOP_ON_FAILURE)

