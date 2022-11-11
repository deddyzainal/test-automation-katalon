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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.click(findTestObject('FE/PARTNER/Beranda/filter_byperiode'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/filter_byperiode'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/Personalisasi Tanggal'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Pengajuan/Button - Open Calendar'), 5)

WebUI.verifyTextPresent('Bulanan', false)

// Input Tanggal Pengajuan
// Open datepicker
WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Button - Open Calendar'))

String cMonth = WebUI.getText(findTestObject('FE/PARTNER/Pengajuan/Choose month'))

String cYear = WebUI.getText(findTestObject('FE/PARTNER/Pengajuan/Choose year2'))

System.print((cMonth + '****') + cYear)

//String date1 = "01-Agustus-2022";
String eDate = date1.split('-')[0]

String e2Date = date1.split('-')[1]

String eMonth = date1.split('-')[2]

String eYear = date1.split('-')[3]

while (!(cMonth.equals(eMonth)) || !(cYear.equals(eYear))) {
    WebUI.click(findTestObject('FE/PARTNER/Pengajuan/button - back2'))

    cMonth = WebUI.getText(findTestObject('FE/PARTNER/Pengajuan/Choose month'))

    cYear = WebUI.getText(findTestObject('FE/PARTNER/Pengajuan/Choose year2'))
}

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> el = driver.findElements(By.xpath('//div[@class=\'dli-content\']'))

for (WebElement e : el) {
    System.print(e.getText() + '***')

    if (e.getText().equals(eDate)) {
        e.click()
    } else if (e.getText().equals(e2Date)) {
        e.click()

        break
    }
}

System.print((((((cMonth + '****') + cYear) + '****') + eMonth) + '****') + eYear)

WebUI.click(findTestObject('FE/PARTNER/Pengajuan/button_Pilih'))

WebUI.verifyTextPresent('Personalisasi', false)

