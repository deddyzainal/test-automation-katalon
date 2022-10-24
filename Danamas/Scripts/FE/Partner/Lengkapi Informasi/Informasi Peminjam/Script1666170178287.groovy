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

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Upload KK'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Upload NPWP (Opsional)'), [:], FailureHandling.STOP_ON_FAILURE)

//if (WebUI.verifyElementPresent(findTestObject('FE/Partner/Upload File/Unggah Foto Buku Nikah'), 5, FailureHandling.OPTIONAL
  //)) {
    //WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Buku Nikah'), [:], FailureHandling.STOP_ON_FAILURE)
//}
if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/upload/unggah_Foto Buku Nikah'), 3, FailureHandling.OPTIONAL)) {
	WebUI.callTestCase(findTestCase('FE/Partner/Upload File/Unggah Foto Buku Nikah'), [:], FailureHandling.STOP_ON_FAILURE)
}
    WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/input_NPWP'), 3)

    WebUI.clearText(findTestObject('FE/PARTNER/Register/input_NPWP'))

    WebUI.click(findTestObject('FE/PARTNER/Register/input_NPWP'))

    WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_NPWP'), npwp)

    WebUI.scrollToElement(findTestObject('FE/PARTNER/Register/select_Agama'), 3)

    // Select agama
    WebUI.click(findTestObject('FE/PARTNER/Register/select_Agama'))

    WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/Option - Agama'), 3)

    WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Beranda/Option - Agama', [('Agama') : Agama]), Agama, false)

    // Select Kewarganegaraan
    WebUI.click(findTestObject('FE/PARTNER/Register/select_Kewarganegaraan'))

    if (Kewarganegaraan.toLowerCase() == 'wna') {
        WebUI.click(findTestObject('/FE/PARTNER/Register/Option - WNA'))
    } else if (Kewarganegaraan.toLowerCase() == 'wni') {
        WebUI.click(findTestObject('/FE/PARTNER/Register/Option - WNI'))
    }
    
    WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/button_Simpan'), 3)

    WebUI.click(findTestObject('FE/PARTNER/Profil/button_Simpan')) 
