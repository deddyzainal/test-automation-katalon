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

//Filter list by Kategori Agen = 'Branch'
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Sales Team/List/Filter list by Kategori Agen'), [('kategori_agen') : 'Branch'], FailureHandling.STOP_ON_FAILURE)

//Click dropdown Kota Cabang
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Sales Team/List/Select - Kota Cabang'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/List/Select - Kota Cabang'))

//Select option
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/List/Option - Kota Cabang', [('kota_cabang') : kota_cabang]))

WebUI.waitForPageLoad(3)

//Verify Kota Cabang/Tipe Partner value on the list match with selected option
WebUI.verifyElementText(findTestObject('FE/Backoffice/Sales/Sales Team/List/TextValue - Kota Cabang Tipe Partner'), kota_cabang, FailureHandling.STOP_ON_FAILURE)