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

WebUI.callTestCase(findTestCase('FE/Partner/Login/Login with credential'), [('nomorhp') : '20220921163134', ('katasandi') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Beranda/Detail Performa'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/List Performa'), 3)

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/List Performa'))

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/List Pre Screening'))

WebUI.click(findTestObject('FE/PARTNER/Beranda/Info Pre Screening'))

WebUI.verifyElementText(findTestObject('FE/PARTNER/Beranda/Detail Status'), 'Pre Screening')

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Mengerti2'))

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/List Passed'))

WebUI.click(findTestObject('FE/PARTNER/Beranda/Info Passed'))

WebUI.verifyElementText(findTestObject('FE/PARTNER/Beranda/Detail Status'), 'Passed')

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Mengerti2'))

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/List Submitted'))

WebUI.click(findTestObject('FE/PARTNER/Beranda/Info Submitted'))

WebUI.verifyElementText(findTestObject('FE/PARTNER/Beranda/Detail Status'), 'Submitted')

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Mengerti2'))

WebUI.scrollToElement(findTestObject('FE/PARTNER/Beranda/List Approved'), 3)

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/List Approved'))

WebUI.click(findTestObject('FE/PARTNER/Beranda/Info Approved'))

WebUI.verifyElementText(findTestObject('FE/PARTNER/Beranda/Detail Status'), 'Approved')

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Mengerti2'))

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/List Published'))

WebUI.click(findTestObject('FE/PARTNER/Beranda/Info Published'))

WebUI.verifyElementText(findTestObject('FE/PARTNER/Beranda/Detail Status'), 'Published')

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Mengerti2'))

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/List Cancelled'))

WebUI.click(findTestObject('FE/PARTNER/Beranda/Info Cancelled'))

WebUI.verifyElementText(findTestObject('FE/PARTNER/Beranda/Detail Status'), 'Canceled')

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Mengerti2'))

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/List Rejected'))

WebUI.click(findTestObject('FE/PARTNER/Beranda/Info Rejected'))

WebUI.verifyElementText(findTestObject('FE/PARTNER/Beranda/Detail Status'), 'Rejected')

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Mengerti2'))

WebUI.closeBrowser()

