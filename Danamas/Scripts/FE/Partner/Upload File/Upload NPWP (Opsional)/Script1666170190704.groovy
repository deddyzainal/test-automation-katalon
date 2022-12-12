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

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Foto NPWP (Opsional)'), 2)

WebUI.click(findTestObject('FE/PARTNER/Register/Foto NPWP (Opsional)'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Foto NPWP (Opsional)'), 2)
if(WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/Cara Unggah'), 2, FailureHandling.OPTIONAL)) {
WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Cara Unggah'), [:], FailureHandling.STOP_ON_FAILURE)
}
File file1 = new File('Data Files/PartnerWeb/npwp.jpg')

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah3'), file1.getAbsolutePath())

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/upload/close'), 2)

WebUI.click(findTestObject('FE/PARTNER/upload/close'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Foto NPWP'), 5)

