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

WebUI.delay(2)

WebUI.click(findTestObject('FE/PARTNER/Register/select_Tipe_Partner'))

if (type.toLowerCase() == 'internal') {
    WebUI.click(findTestObject('FE/PARTNER/Register/Option - internal'))

    WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/select_nama_Partner'), 2)

    WebUI.click(findTestObject('FE/PARTNER/Register/select_nama_Partner'))

    WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Register/Option - Partner'), namapartner, false)
} else if (type.toLowerCase() == 'external') {
    WebUI.click(findTestObject('FE/PARTNER/Register/Option - External'))
}

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/select_nama_Partner'), 2)

WebUI.click(findTestObject('FE/PARTNER/Register/select_nama_Partner'))

WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Register/Option - Nama Partner'), namapartner, false)

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Register/Option - Cabang Partner'), 3, FailureHandling.OPTIONAL)) {
    WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Register/Option - Cabang Partner'), cabangpartner, false //}
        )
} else if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Register/input_Kode Referral'), 3, FailureHandling.OPTIONAL)) {
    WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Kode Referral'), kodereferral)
}

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut (1)'))

