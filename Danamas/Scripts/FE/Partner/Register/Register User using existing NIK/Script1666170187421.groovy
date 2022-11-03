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

System.print(timestamp + '****')

WebUI.openBrowser(GlobalVariable.PartnerWeb)

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/button_Buat Akun'), 5)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Buat Akun'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/input_Nomor HP'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/input_Nomor HP'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Nomor HP'), timestamp)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/button_Lanjut'), 3)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut'))

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/input_OTP_1'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_OTP_1'), timestamp.substring(8))

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut'))

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Register/Foto KTP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/Foto KTP'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/capture_Foto KTP (1)'), 2)

WebUI.click(findTestObject('FE/PARTNER/Register/capture_Foto KTP (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut_capture'))

WebUI.click(findTestObject('FE/PARTNER/Register/Foto Selfie'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/capture_Foto Selfie'), 2)

WebUI.click(findTestObject('FE/PARTNER/Register/capture_Foto Selfie'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut_captureselfie'))

WebUI.callTestCase(findTestCase('FE/Partner/Upload File/uploadfotonpwp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/input_Name Lengkap'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_Name Lengkap'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Name Lengkap'), nama)

WebUI.click(findTestObject('FE/PARTNER/Register/input_NIK'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_NIK'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_NIK'), nik)

WebUI.scrollToElement(findTestObject('FE/PARTNER/Register/input_NIK'), 2)

WebUI.click(findTestObject('FE/PARTNER/Register/input_NPWP'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_NPWP'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_NPWP'), timestamp + 1)

WebUI.click(findTestObject('FE/PARTNER/Register/input_Email'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_Email'), FailureHandling.STOP_ON_FAILURE)

'coba input email'
WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Email'), timestamp + '@mailinator.com')

//WebUI.click(findTestObject('FE/PARTNER/Beranda/select_jenis kelamin'))
WebUI.click(findTestObject('FE/PARTNER/Beranda/select_gender'))

    WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Beranda/Option - Gender'), gender, false)


WebUI.click(findTestObject('FE/PARTNER/Register/input_Masukkan tempat lahir'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_Masukkan tempat lahir'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Masukkan tempat lahir'), tempatlahir)

// Input Tanggal Lahir
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

WebUI.click(findTestObject('FE/PARTNER/Register/input_Nama Ibu Kandung'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_Nama Ibu Kandung'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Nama Ibu Kandung'), namaibu)

// Select Status Perkawinan
WebUI.click(findTestObject('FE/PARTNER/Beranda/select_status perkawinan'))

WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Beranda/Option - Perkawinan'), statusPerkawinan, false)

// Select agama
WebUI.click(findTestObject('FE/PARTNER/Register/select_Agama'))

WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Beranda/Option - Agama'), Agama, false)

WebUI.scrollToElement(findTestObject('FE/PARTNER/Register/select_Agama'), 2)

WebUI.click(findTestObject('FE/PARTNER/Register/textarea_Masukkan alamat sesuai KTP'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/textarea_Masukkan alamat sesuai KTP'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/textarea_Masukkan alamat sesuai KTP'), alamat)

WebUI.click(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'), rt)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'), rw)

WebUI.click(findTestObject('FE/PARTNER/Register/Masukkan kode pos'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/Masukkan kode pos'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/Masukkan kode pos'), kodepos)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut (1)'))

WebUI.scrollToElement(findTestObject('FE/PARTNER/Register/input_Name Lengkap'), 2)

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Register/input_NIK'))

WebUI.verifyTextNotPresent(' NIK telah terdaftar, silahkan masukkan NIK yang lain.', false)

WebUI.closeBrowser()

