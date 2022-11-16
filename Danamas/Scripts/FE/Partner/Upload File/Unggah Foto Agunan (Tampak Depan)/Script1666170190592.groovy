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

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/upload/Unggah Foto Agunan (Tampak Depan)'), 2)

WebUI.click(findTestObject('FE/PARTNER/upload/Unggah Foto Agunan (Tampak Depan)'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/upload/Unggah Foto Agunan (Tampak Depan)'), 2)

File file1 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file2 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file3 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file4 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file5 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file6 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file7 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file8 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file9 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file10 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file11 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file12 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file13 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file14 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')
File file15 = new File('Data Files/PartnerWeb/tampak_depan.jpeg')

WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file1.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file2.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file3.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file4.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file5.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file6.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file7.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file8.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file9.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file10.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file11.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file12.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file13.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file14.getAbsolutePath())
WebUI.uploadFile(findTestObject('FE/PARTNER/upload/button_Unggah4'), file15.getAbsolutePath())


WebUI.waitForElementVisible(findTestObject('FE/PARTNER/upload/close'), 2)

WebUI.click(findTestObject('FE/PARTNER/upload/close'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/upload/Unggah Foto Agunan (Tampak Depan)'), 5)

