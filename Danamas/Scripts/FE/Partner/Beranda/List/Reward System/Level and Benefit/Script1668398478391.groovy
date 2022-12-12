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

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/Page Point'), 3)

String clevel = 'Reward ' + WebUI.getText(findTestObject('FE/PARTNER/Beranda/Level'))

println(clevel)

WebUI.click(findTestObject('FE/PARTNER/Beranda/Detail Level'))

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Beranda/Reward Level'))

String elevel = WebUI.getText(findTestObject('FE/PARTNER/Beranda/Level Name'))

println(elevel)

int i = 2

while (!(clevel == elevel)) {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/button - next level', [('index') : i]))

    WebUI.delay(2)

    i = (i + 1)

    elevel = WebUI.getText(findTestObject('FE/PARTNER/Beranda/Level Name'))

    println(elevel)
}

WebUI.verifyMatch(clevel, elevel, false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_back2'))

