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


if(WebUI.verifyElementNotPresent(findTestObject('FE/Backoffice/Navigation/Menu - List KJPP'), 3, FailureHandling.OPTIONAL)) {
	//Click menu Appraisal Management
	WebUI.click(findTestObject('FE/Backoffice/Navigation/Menu - Appraisal Management'))
	WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Navigation/Menu - List KJPP'), 3, FailureHandling.STOP_ON_FAILURE)
}

//Click menu List KJPP
WebUI.click(findTestObject('FE/Backoffice/Navigation/Menu - List KJPP'))

WebUI.waitForPageLoad(5)

//Verify element in KJPP list page is visible
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/List KJPP/List/Button - Tambah KJPP Baru'))



