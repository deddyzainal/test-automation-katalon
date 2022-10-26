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

WebUI.check(findTestObject('FE/PARTNER/Profil/check_alamatdomisili'))

WebUI.scrollToElement(findTestObject('FE/PARTNER/Profil/check_alamatdomisili'), 2)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'))

WebUI.clearText(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'), alamatdomisili)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_RTRW2'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_RTRW2'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_RTRW2'), rt2)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_RTRW2'), rw2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/div_provinsi'))

WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Provinsi'), Provinsi)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Provinsi'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/Option - Provinsi', [('Provinsi') : Provinsi]))

// select kota/kabupaten
WebUI.click(findTestObject('FE/PARTNER/Beranda/div_kotakabupaten'))

//WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Kota'), Kota)
WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Kota'), '')

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Kota'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/Option - Kota', [('Kota') : Kota]))

WebUI.scrollToElement(findTestObject('FE/PARTNER/Beranda/div_kecamatan'), 2)

// Select kecamatan
WebUI.click(findTestObject('FE/PARTNER/Beranda/div_kecamatan'))

WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Kecamatan'), Kecamatan)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Kecamatan'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/Option - Kecamatan', [('Kecamatan') : Kecamatan]))

// Select kelurahan
WebUI.click(findTestObject('FE/PARTNER/Beranda/div_kelurahan'))

WebUI.setText(findTestObject('FE/PARTNER/Register/Cari Kelurahan'), Kelurahan)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Kelurahan'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/Option - Kelurahan', [('Kelurahan') : Kelurahan]))

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Kode Pos3'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Kode Pos3'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Kode Pos3'), kodepos2)

