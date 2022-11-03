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

String valuenamaKTP = WebUI.getAttribute(findTestObject('FE/PARTNER/Beranda/input_Nama Sesuai KTP'), 'value')

println(valuenamaKTP)

if (valuenamaKTP == '') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Nama Sesuai KTP'))

    WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Nama Sesuai KTP'), nama)
}

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'), timestamp)

WebUI.scrollToElement(findTestObject('FE/PARTNER/Beranda/input_Nomor HP'), 2)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Alamat Email'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Alamat Email'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Alamat Email'), timestamp + '@mailinator.com')

String valueNIK = WebUI.getAttribute(findTestObject('FE/PARTNER/Beranda/input_NIK'), 'value')

println(valueNIK)

if (valueNIK == '') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/input_NIK'))

    WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_NIK'), FailureHandling.STOP_ON_FAILURE)

    WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_NIK'), timestamp + 12)
}

String valuegender = WebUI.getAttribute(findTestObject('FE/PARTNER/Beranda/select_gender'), 'value')

println(valuegender)

if (WebUI.verifyOptionSelectedByValue(findTestObject('FE/PARTNER/Beranda/select_gender'), 'null', false, 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/select_gender'))

    WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Beranda/Option - Gender'), gender, false)
}

String valuettl = WebUI.getAttribute(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'), 'value')

println(valuettl)

if (valuettl == '') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'))

    WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'), FailureHandling.STOP_ON_FAILURE)

    WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Tempat Lahir'), tempatlahir)
}

// Input Tanggal lahir
// Open datepicker
String date = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/tanggal'))

println(date)

if (date == 'Pilih tanggal lahir') {
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
}

WebUI.scrollToElement(findTestObject('FE/PARTNER/Pengajuan/Button - Open Calendar'), 2)

// Select Pendidikan Terakhir
WebUI.click(findTestObject('FE/PARTNER/Beranda/select_pendidikan terakhir'))

WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Register/Option - Pendidikan'), pendidikan, false)

WebUI.scrollToElement(findTestObject('FE/PARTNER/Beranda/select_status perkawinan'), 2)

// Select Status Perkawinan
String statusPerkawinan2 = WebUI.getAttribute(findTestObject('FE/PARTNER/Beranda/select_status perkawinan'), 'value')

println(statusPerkawinan2)

if (WebUI.verifyOptionSelectedByValue(findTestObject('FE/PARTNER/Beranda/select_status perkawinan'), 'null', false, 3, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/select_status perkawinan'))

    WebUI.selectOptionByLabel(findTestObject('FE/PARTNER/Beranda/Option - Perkawinan'), statusPerkawinan, false)
}

if (WebUI.verifyOptionSelectedByLabel(findTestObject('FE/PARTNER/Beranda/select_status perkawinan'), 'Kawin', false, 3, 
    FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('FE/Partner/Upload File/uploadktppasangan'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(1)

    String valuenikpsg = WebUI.getAttribute(findTestObject('FE/PARTNER/Beranda/input_NIK Pasangan'), 'value')

    println(valuenikpsg)

    if (valuenikpsg == '') {
        WebUI.click(findTestObject('FE/PARTNER/Beranda/input_NIK Pasangan'))

        WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_NIK Pasangan'), nikpasangan)
    }
    
    String valuenamapsg = WebUI.getAttribute(findTestObject('FE/PARTNER/Beranda/input_Nama Lengkap Pasangan'), 'value')

    println(valuenamapsg)

    if (valuenamapsg == '') {
        WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Nama Lengkap Pasangan'))

        WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Nama Lengkap Pasangan'), namapasangan)
    }
    
    // Input Tanggal lahir
    // Open datepicker
    String date2a = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/tanggal2'))

    println(date2a)

    if (date2a == 'Masukkan tanggal lahir pasangan') {
        WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Button - Open Calendar2'))

        WebUI.click(findTestObject('FE/PARTNER/Pengajuan/Choose year2'))

        String cYear = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/Choose year2'))

        String cMonth = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/Choose month2'))

        System.print('****' + cYear)

        //String eYear = 1999
        WebUI.click(findTestObject('FE/PARTNER/Pengajuan/button - back2'))

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
        String eDate = date2.split('-')[0]

        String eMonth = date2.split('-')[1]

        while (!(cMonth.equals(eMonth))) {
            WebUI.click(findTestObject('FE/PARTNER/Pengajuan/button - back2'))

            cMonth = WebUI.getText(findTestObject('Object Repository/FE/PARTNER/Pengajuan/Choose month2'))
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
    }
}

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Simpan'))

