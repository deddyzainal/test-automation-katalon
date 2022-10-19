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

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/input_Nama Sesuai KTP'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Nama Sesuai KTP'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Nama Sesuai KTP'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Nama Sesuai KTP'), nama)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'), timestamp)

WebUI.scrollToElement(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Alamat Email'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Alamat Email'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Alamat Email'), timestamp + '@mailinator.com')

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_NIK'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_NIK'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_NIK'), timestamp + 12)

if (gender.toLowerCase() == 'laki-laki') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/option-laki laki'))
} else if (gender.toLowerCase() == 'perempuan') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/option-perempuan'))
}

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'), tempatlahir)

// Input Tanggal lahir
// Open datepicker
WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Button - Open Calendar'))

WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Choose year'))

String cYear = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/Choose year'))

String cMonth = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/Choose month'))

System.print('****' + cYear)

//String eYear = 1999
WebUI.click(findTestObject('FE/PARTNER/Pengajuan/button - back'))

WebDriver driver2 = DriverFactory.getWebDriver()

List<WebElement> el = driver2.findElements(By.xpath('//div[@class=\'yli-content\']'))

for (WebElement e : el) {
    System.print(e.getText() + '***')

    if (e.getText().equals(eYear)) {
        e.click()

        break
    }
}

WebUI.delay(3)

System.print((cMonth + '****') + cYear)

//month and date
//String date1 = "1-Januari";
String eDate = date1.split('-')[0]

String eMonth = date1.split('-')[1]

while (!(cMonth.equals(eMonth))) {
    WebUI.click(findTestObject('FE/PARTNER/Pengajuan/button - back'))

    cMonth = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/Choose month'))
}

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> ele = driver.findElements(By.xpath('//div[@class=\'dli-content\']'))

for (WebElement e : ele) {
    //  System.print(e.getText() + '***')
    if (e.getText().equals(eDate)) {
        e.click()

        break
    }
}

WebUI.scrollToElement(findTestObject('FE/PARTNER/Pengajuan/Button - Open Calendar'), 2)

// Select Pendidikan Terakhir
WebUI.click(findTestObject('FE/PARTNER/Beranda/select_pendidikan terakhir'))

WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Register/Option - Pendidikan'), pendidikan, false)

WebUI.scrollToElement(findTestObject('FE/PARTNER/Beranda/select_status perkawinan'), 2)

// Select Status Perkawinan
WebUI.click(findTestObject('FE/PARTNER/Beranda/select_status perkawinan'))

WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Beranda/Option - Perkawinan'), statusPerkawinan, false)

if (statusPerkawinan == 'Kawin'){
	
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/uploadktppasangan'), [:], FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(1)
	WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Simpan'))
	
	}else {
		WebUI.delay(1)	
		WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Simpan'))
	}
	
