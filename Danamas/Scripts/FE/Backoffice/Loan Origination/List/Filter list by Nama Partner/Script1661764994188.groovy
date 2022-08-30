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
WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), [:])

WebUI.callTestCase(findTestCase('FE/Backoffice/Side Menu/Click Data and Prospect'), [:])

WebUI.callTestCase(findTestCase('FE/Backoffice/Side Menu/Click Loan Origination'), [:])

//Filter list by Tipe Partner
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by Tipe Partner'), [('tipe_partner') : tipe_partner], FailureHandling.STOP_ON_FAILURE)

//Click dropdown Nama Partner
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/List/Select - Nama Partner'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Select - Nama Partner'))

//Select partner name option
//WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Origination/List/Option - Nama Partner', [('nama_partner') : nama_partner]), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Option - Nama Partner', [('nama_partner') : nama_partner]))

WebUI.waitForPageLoad(5)