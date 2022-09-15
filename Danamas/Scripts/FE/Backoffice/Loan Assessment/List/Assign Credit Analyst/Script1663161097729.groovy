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

//Click checkbox on the list
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/List/Checkbox - Assessment List'))

//Click button Tugaskan
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/List/Button - Tugaskan'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/List/Button - Tugaskan'))

//Select Nama CA
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/List/Penugasan CA/Select - Nama Credit Analyst'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/List/Penugasan CA/Select - Nama Credit Analyst'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/List/Penugasan CA/Option - Nama Credit Analyst', [('nama_credit_analyst') : nama_credit_analyst]))

//Click button Tugaskan on the dialog
WebUI.waitForElementClickable(findTestObject('FE/Backoffice/Loan Assessment/List/Penugasan CA/Button - Tugaskan'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/List/Penugasan CA/Button - Tugaskan'))

WebUI.waitForPageLoad(5)

//Verify Nama Credit Analyst in the list already filled
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/List/TextValue - Nama Credit Analyst'), nama_credit_analyst, FailureHandling.STOP_ON_FAILURE)