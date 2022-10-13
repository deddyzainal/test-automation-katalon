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

//Input ID Pinjaman
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Credit Analyst/Input - ID Pinjaman'), 3, FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'backoffice.common.setTextWithDelay'(findTestObject('FE/Backoffice/Credit Analyst/Input - ID Pinjaman'), id_pinjaman)
//WebUI.setText(findTestObject('FE/Backoffice/Credit Analyst/Input - ID Pinjaman'), id_pinjaman)

WebUI.delay(3)

//Verify input text match with ID Pinjaman on the list
WebUI.verifyElementText(findTestObject('FE/Backoffice/Credit Analyst/TextValue - ID Pinjaman'), id_pinjaman, FailureHandling.STOP_ON_FAILURE)