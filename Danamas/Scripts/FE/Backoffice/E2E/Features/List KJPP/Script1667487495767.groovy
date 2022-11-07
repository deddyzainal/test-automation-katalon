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

String datetime = new Date().format('yyMMddHHmmss')

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu List KJPP'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Add new KJPP'), [('nama_kjpp') : 'KJPP ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Filter by Nama KJPP'), [('nama_kjpp') : 'KJPP ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Open KJPP detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Edit KJPP'), [('nama_kjpp') : 'KJPP ' + datetime], FailureHandling.STOP_ON_FAILURE)

//Lokasi
WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Add Lokasi'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Search Lokasi'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Edit Lokasi'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Delete Lokasi'), null, FailureHandling.STOP_ON_FAILURE)

//Properti
WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Add Properti'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Search Properti'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Edit Properti'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Search Properti'), [('properti') : 'Properti 2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/List KJPP/Delete Properti'), null, FailureHandling.STOP_ON_FAILURE)

