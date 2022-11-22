import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


//Click dropdown Perusahaan Penjamin
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/List/Select - Perusahaan Penjamin'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Select - Perusahaan Penjamin'))

//Select Perusahaan Penjamin option
for(int i = 0; i < perusahaan_penjamin.size; i++) {
	WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Option - Perusahaan Penjamin', [('perusahaan_penjamin') : perusahaan_penjamin[i]]))
}

WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Select - Perusahaan Penjamin'))
WebUI.delay(3)

//Verify Perusahaan Penjamin in the list match with selected option
//WebUI.waitForPageLoad(5)
//WebUI.verifyElementText(findTestObject('null'), perusahaan_penjamin)