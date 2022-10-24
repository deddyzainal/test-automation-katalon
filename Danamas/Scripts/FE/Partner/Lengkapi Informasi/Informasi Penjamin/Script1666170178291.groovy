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

String timestamp = new Date().format('yyyyMMddHHmmss')

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Lengkapi Informasi/input_NIK Penjamin'), 2)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/input_NIK Penjamin'))

WebUI.clearText(findTestObject('FE/PARTNER/Lengkapi Informasi/input_NIK Penjamin'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Lengkapi Informasi/input_NIK Penjamin'), timestamp + 12)

WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/input_Nama Penjamin'))

WebUI.clearText(findTestObject('FE/PARTNER/Lengkapi Informasi/input_Nama Penjamin'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Lengkapi Informasi/input_Nama Penjamin'), nama)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'), tempatlahir)

WebUI.scrollToElement(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'), 2)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Pengajuan/Button - Open Calendar'), 2)

// Input Tanggal Pengajuan
// Open datepicker
WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Button - Open Calendar'))

String cMonth = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/Choose month'))

String cYear = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/Choose year'))

System.print((cMonth + '****') + cYear)

//String date1 = "01-Agustus-2022";
String eDate = date1.split('-')[0]

String eMonth = date1.split('-')[1]

String eYear = date1.split('-')[2]

while (!(cMonth.equals(eMonth)) || !(cYear.equals(eYear))) {
    WebUI.click(findTestObject('FE/PARTNER/Pengajuan/button - back'))

    cMonth = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/Choose month'))

    cYear = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/Choose year'))
}

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> el = driver.findElements(By.xpath('//div[@class=\'dli-content\']'))

for (WebElement e : el) {
    System.print(e.getText() + '***')

    if (e.getText().equals(eDate)) {
        e.click()

        break
    }
}

System.print((((((cMonth + '****') + cYear) + '****') + eMonth) + '****') + eYear)

'alamat penjamin\r\n'
WebUI.click(findTestObject('FE/PARTNER/Beranda/textarea_Alamat sesuai KTP'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/textarea_Alamat sesuai KTP'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/textarea_Alamat sesuai KTP'), alamat)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'), timestamp)

// Select Hubungan
WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/select_hubungan'))

if (hubungan.toLowerCase() == 'anak') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Anak'))
} else if (hubungan.toLowerCase() == 'orang tua') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Orang Tua'))
} else if (hubungan.toLowerCase() == 'istri/suami') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Istri or Suami'))
} else if (hubungan.toLowerCase() == 'saudara') {
    WebUI.click(findTestObject('FE/PARTNER/Lengkapi Informasi/Option - Saudara'))
}

WebUI.click(findTestObject('FE/PARTNER/Profil/button_Simpan'), FailureHandling.STOP_ON_FAILURE)

