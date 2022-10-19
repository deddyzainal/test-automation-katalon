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

WebUI.callTestCase(findTestCase('FE/Partner/Menu Akun/Edit Profile After Set Pin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Profil/icon-back'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/Atur PIN'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/Atur PIN'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/input_Masukkan PIN lama'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/input_Masukkan PIN lama'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_Masukkan PIN lama'), newpin)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/input_Buat PIN baru2'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/input_Buat PIN baru2'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_Buat PIN baru2'), newpin2)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/input_Ketik ulang PIN2'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/input_Ketik ulang PIN2'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_Ketik ulang PIN2'), newpin2)

WebUI.click(findTestObject('FE/PARTNER/Profil/button_Simpanchangepin'))

WebUI.verifyTextPresent('PIN Anda berhasil di ubah', false)

WebUI.click(findTestObject('FE/PARTNER/Profil/button_OK'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/button_OK'), 3)

WebUI.closeBrowser()

