import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Click button Tanggal Pengajuan
WebUI.click(findTestObject('FE/Backoffice/Telesales/List/Button - Tanggal Pengajuan'))

//Select option 7 Hari Terakhir
WebUI.click(findTestObject('FE/Backoffice/Telesales/List/Option - 7 Hari Terakhir'))

//Click button Apply
WebUI.click(findTestObject('FE/Backoffice/Telesales/List/Button - Apply'))

WebUI.delay(3)

//String datetime = new Date().format('dd MMMM yyyy')
//WebUI.verifyElementText(findTestObject('FE/Backoffice/Telesales/List/TextValue - Tanggal Pengajuan'), datetime)