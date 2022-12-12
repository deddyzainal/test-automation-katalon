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

//Click button Buat User
WebUI.click(findTestObject('FE/Backoffice V2/User Management/List/Button - Buat User'), FailureHandling.STOP_ON_FAILURE)

//Input Phone Number
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/User Management/Add/Input - Phone No'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Add/Input - Phone No'), phone_no, FailureHandling.STOP_ON_FAILURE)

//Input Name
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Add/Input - Name'), name, FailureHandling.STOP_ON_FAILURE)

//Select User Type
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Add/Select - User Type'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Add/Select - Option', [('option') : user_type]), FailureHandling.STOP_ON_FAILURE)

//Select Borrower/Lender Type
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Add/Select - Borrower Lender Type'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Add/Select - Option', [('option') : borrower_lender_type]), FailureHandling.STOP_ON_FAILURE)

//Click button Add
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Add/Button - Add'), FailureHandling.STOP_ON_FAILURE)

//Verify data added in the list
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/User Management/List/TextValue - Name'), name, FailureHandling.STOP_ON_FAILURE)

