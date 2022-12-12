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

//if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Beranda/Info - Gamification'), 3, FailureHandling.OPTIONAL)) {
WebUI.verifyTextPresent('Level Baru Terbuka', false)

String naiklevel = WebUI.getText(findTestObject('FE/PARTNER/Beranda/Get_Level'), FailureHandling.OPTIONAL) + ' Tier'

println(naiklevel)

if (level.toLowerCase() == 'lihat') {
    WebUI.callTestCase(findTestCase('FE/Partner/Beranda/List/Gamification/Lihat Poin'), [:], FailureHandling.STOP_ON_FAILURE)

    String verlevel = 'Selamat Anda naik ke level ' + WebUI.getText(findTestObject('FE/PARTNER/Beranda/Level'))

    println(verlevel)

    WebUI.verifyMatch(naiklevel, verlevel, false, FailureHandling.STOP_ON_FAILURE)

    WebUI.back()
} else if (level.toLowerCase() == 'tutup') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/Tutup'))
}

