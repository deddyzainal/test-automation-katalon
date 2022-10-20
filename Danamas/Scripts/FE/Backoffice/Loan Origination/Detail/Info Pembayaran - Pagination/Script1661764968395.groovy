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

//Scroll to pagination section
WebUI.scrollToElement(findTestObject('null'), 5)

//Count total page
int total_page = WebUI.getText(findTestObject('null')).toInteger()

if (total_page > 1) {
    int row_no = 1

    //Click Next button and verify row number
    for (int i = 1; i < total_page; i++) {
        WebUI.click(findTestObject('null'))
        row_no = (row_no + 10)
        WebUI.verifyElementText(findTestObject('null'), row_no.toString())
    } 
	
	//Click Prev button and verify row number
    for (int i=1; i<total_page; i++) {
		WebUI.click(findTestObject('null'))
    	row_no = row_no - 10
        WebUI.verifyElementText(findTestObject('null'), row_no.toString())
    }
    	
    //Click page number and verify row number
    for (int i=1; i<total_page; i++) {
    	WebUI.click(findTestObject('null', [('page_no'): i+1 ]))
    	row_no = row_no + 10
        WebUI.verifyElementText(findTestObject('null'), row_no.toString())
    }
}

