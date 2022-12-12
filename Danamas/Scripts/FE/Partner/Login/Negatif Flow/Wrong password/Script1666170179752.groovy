import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser(GlobalVariable.PartnerWeb)

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/Selamat datang di Partner App'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/button_Masuk'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/input_Nomor HP'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/input_Nomor HP'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Login/input_Nomor HP'), nomorhp)

// Click MASUK button
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/input_Kata Sandi'), 3)

WebUI.click(findTestObject('FE/PARTNER/Login/input_Kata Sandi'))

WebUI.setEncryptedText(findTestObject('FE/PARTNER/Login/input_Kata Sandi'), 'P9ET2sDE0SE=')

// Click MASUK button
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/button_MasukLogin'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/button_MasukLogin'))

// Verify wrong password error message is displayed
WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Login/Anda gagal masuk ke akun'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Anda gagal masuk ke akun', false)

WebUI.click(findTestObject('FE/PARTNER/Login/button_Coba lagi'))

WebUI.closeBrowser()

