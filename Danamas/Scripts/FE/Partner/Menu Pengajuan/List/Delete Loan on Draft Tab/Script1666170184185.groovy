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

WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Option - Tersimpan'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Pengajuan/Option - Tersimpan'), 2)

WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Ubah'))

WebUI.check(findTestObject('FE/PARTNER/Pengajuan/Ubah - Check'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Pengajuan/Ubah - Check'), 2)

WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Delete - Check'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Pengajuan/button - Hapus'), 2)

WebUI.click(findTestObject('FE/PARTNER/Pengajuan/button - Hapus'))

WebUI.verifyTextPresent('Pengajuan tersimpan berhasil dihapus', false)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_OK'))

