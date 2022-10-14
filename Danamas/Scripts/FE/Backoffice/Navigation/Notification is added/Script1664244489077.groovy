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


//Get prev notification
int prev_notif = 0
if (WebUI.verifyElementPresent(findTestObject('FE/Backoffice/Navigation/Image - Notification Badge'), 3, FailureHandling.OPTIONAL)) {
	prev_notif = WebUI.getText(findTestObject('FE/Backoffice/Navigation/Image - Notification Badge'), FailureHandling.STOP_ON_FAILURE).toInteger()
}

//Assign CA
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Assign Credit Analyst'), [('nama_credit_analyst') : 'stg_ca'], 
    FailureHandling.STOP_ON_FAILURE)

//Verify notification counter is added
int current_notif = WebUI.getText(findTestObject('Object Repository/FE/Backoffice/Navigation/Image - Notification Badge'), FailureHandling.STOP_ON_FAILURE).toInteger()
WebUI.verifyEqual(current_notif, prev_notif + 1, FailureHandling.STOP_ON_FAILURE)

//Click new notification
WebUI.click(findTestObject('FE/Backoffice/Navigation/Image - Notification Badge'))
WebUI.click(findTestObject('FE/Backoffice/Navigation/List - New Notification'))

//Verify notification counter is reduced
current_notif = 0
if (WebUI.verifyElementPresent(findTestObject('FE/Backoffice/Navigation/Image - Notification Badge'), 3, FailureHandling.OPTIONAL)) {
	current_notif = WebUI.getText(findTestObject('Object Repository/FE/Backoffice/Navigation/Image - Notification Badge'), FailureHandling.STOP_ON_FAILURE).toInteger()
}

WebUI.verifyEqual(current_notif, prev_notif, FailureHandling.STOP_ON_FAILURE)
