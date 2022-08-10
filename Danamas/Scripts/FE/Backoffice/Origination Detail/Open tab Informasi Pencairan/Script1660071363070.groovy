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

//Click tab Informasi Pinjaman
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Tab - Informasi Pencairan'), 3)
WebUI.click(findTestObject('Object Repository/Origination Detail/Tab - Informasi Pencairan'))

WebUI.scrollToPosition(0, 620)

//Verify some values in Informasi Pencairan tab is present
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Informasi Pencairan/TextValue - Pencairan Ke'))

WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Informasi Pencairan/TextValue - No Pinjaman'))

WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Informasi Pencairan/TextValue - Jumlah Dicairkan'))

WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Informasi Pencairan/TextValue - Tanggal Pencairan'))

WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Origination Detail/Informasi Pencairan/TextValue - Status'))

