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

if(WebUI.getText(findTestObject('FE/Backoffice/Role Management/List/TextValue - Total Pengguna')) == '0') {
	//Click checkbox in the list
	WebUI.click(findTestObject('FE/Backoffice/Role Management/List/Checkbox - Role List'))
	
	//Click button Hapus Role
	WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Role Management/List/Button - Hapus Role'), 2, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice/Role Management/List/Button - Hapus Role'))
	
	//Click button Hapus on confirmation dialog
	WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Role Management/List/Button - Hapus'), 2, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice/Role Management/List/Button - Hapus'))
	
	//Verify success dialog is shown
	WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Role Management/List/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementText(findTestObject('FE/Backoffice/Role Management/List/Snackbar - Heading'), 'Berhasil menghapus role!', FailureHandling.STOP_ON_FAILURE)
}