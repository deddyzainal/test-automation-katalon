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

if(WebUI.verifyElementNotPresent(findTestObject('FE/Backoffice/Navigation/Menu - Credit Analyst'), 3, FailureHandling.OPTIONAL)) {
	//Click menu Task List
	WebUI.click(findTestObject('FE/Backoffice/Navigation/Menu - Task List'))
	WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Navigation/Menu - Credit Analyst'), 3, FailureHandling.STOP_ON_FAILURE)
}

//Click menu Telesales
WebUI.click(findTestObject('FE/Backoffice/Navigation/Menu - Credit Analyst'))

WebUI.waitForPageLoad(5)

//Verify label Task List Credit Analyst is visible
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Credit Analyst/Label - Task List Credit Analyst'), FailureHandling.STOP_ON_FAILURE)


