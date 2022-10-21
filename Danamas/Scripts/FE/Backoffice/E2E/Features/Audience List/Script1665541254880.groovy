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

WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Notification Settings'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Audience List'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Filter by Nama Audien'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Reset filter'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Sort by Nama Audien'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Sort by Update Terkini'), null, FailureHandling.STOP_ON_FAILURE)

String datetime = new Date().format('yyMMddHHmmss')

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Add new template'), [('nama_audience') : 'Audience ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Filter by Nama Audien'), [('nama_audien') : 'Audience ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Edit audience'), [('nama_audience') : 'Audience2 ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Filter by Nama Audien'), [('nama_audien') : 'Audience2 ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Open audience detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/Detail/Edit audience'), [('nama_audience') : 'Audience3 ' + datetime, ('deskripsi') : 'Update Deskripsi 2', ('email') : ['katalon@danamas.co.id']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Filter by Nama Audien'), [('nama_audien') : 'Audience3 ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Audience List/List/Delete audience'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()
