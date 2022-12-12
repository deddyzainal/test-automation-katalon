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

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/select_Pilih Kota'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/select_Pilih Kota'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Kota Agen'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Register/Option - Kota Agen'), kota, false)

//if (kota.toLowerCase() == 'bandung') {
//	WebUI.click(findTestObject('FE/PARTNER/Beranda/Option - kota'))
//} else if (kota.toLowerCase() == 'badung') {
//	WebUI.click(findTestObject('FE/PARTNER/Beranda/Option - kota'))
//}
// Select Kota/Kabupaten
WebUI.click(findTestObject('FE/PARTNER/Beranda/select_Pilih nama cabang'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/Option - Nama Cabang'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Register/Option - Nama Cabang'), cabang, false)

//if (cabang.toLowerCase() == 'danamas bandung') {
//    WebUI.click(findTestObject('FE/PARTNER/Beranda/Option - cabang'))
//} else if (cabang.toLowerCase() == 'danamas badung') {
//    WebUI.click(findTestObject('FE/PARTNER/Beranda/Option - cabang'))
//}
'select agen'
WebUI.click(findTestObject('FE/PARTNER/Beranda/select_Pilih Posisi'))

if (posisi.toLowerCase() == 'branch manager') {
    WebUI.click(findTestObject('/FE/PARTNER/Beranda/Option - Branch Manager'))
} else if (posisi.toLowerCase() == 'relationship manager') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/Option - Relationship Manager'))
}

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut (1)'))

