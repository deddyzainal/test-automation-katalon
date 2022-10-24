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

WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Filter'))

WebUI.click(findTestObject('FE/PARTNER/Pengajuan/select_Pilih Status'))

if (status.toLowerCase() == 'pre screening') {
    WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Option - Pre Screening'))
} else if (status.toLowerCase() == 'passed') {
    WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Option - Passed'))
} else if (status.toLowerCase() == 'submitted') {
    WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Option - Submitted'))
} else if (status.toLowerCase() == 'approved') {
    WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Option - Approved'))
} else if (status.toLowerCase() == 'published') {
    WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Option - Published'))
} else if (status.toLowerCase() == 'cancelled') {
    WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Option - Cancelled'))
}

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Pengajuan/select_Pilih Status'), 5)

WebUI.click(findTestObject('FE/PARTNER/Pengajuan/button_Pilih'))

