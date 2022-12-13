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

WebUI.callTestCase(findTestCase('FE/Partner/Login/Login with credential'), [('nomorhp') : '20220921163134', ('katasandi') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/img buat pengajuan'), 3)

WebUI.click(findTestObject('FE/PARTNER/Beranda/img buat pengajuan'))

if (pengajuan.toLowerCase() == 'pinjaman beragunan properti') {
    WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/img_pinjamanberagunan'), 3)

    WebUI.click(findTestObject('FE/PARTNER/Beranda/img_pinjamanberagunan'))

    WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Pilih Produk'))
} else if (pengajuan.toLowerCase() == 'dana express') {
    WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Beranda/img_danaexpress'), 3)

    WebUI.click(findTestObject('FE/PARTNER/Beranda/img_danaexpress'))

    WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Pilih Produk'))
}

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_NIK'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_NIK'), nik)

WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Cek Status'))

if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Beranda/button_Mengerti2'), 3, FailureHandling.OPTIONAL)) {
    if (kondisi.toLowerCase() == 'mengerti') {
        WebUI.verifyTextPresent('Data Peminjam telah Diproses', false)

        WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Mengerti2'))
    } else if (kondisi.toLowerCase() == 'lihat riwayat pinjaman') {
        WebUI.click(findTestObject('FE/PARTNER/Pengajuan/button - Lihat Riwayat Pinjaman'))

        WebUI.callTestCase(findTestCase('FE/Partner/New Loan/List/History Riwayat Pinjaman'), [:], FailureHandling.STOP_ON_FAILURE)
    }
} else if (WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Beranda/button_Lihat Data'), 3, FailureHandling.OPTIONAL)) {
    if (kondisi2.toLowerCase() == 'lihat data') {
        WebUI.verifyTextPresent('Data Peminjam Ditemukan', false)

        WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Lihat Data'))

        WebUI.scrollToElement(findTestObject('FE/PARTNER/Pengajuan/kelurahan'), 3)

        WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Pengajuan/kelurahan'), 3)

        WebUI.scrollToPosition(0, 0)

        WebUI.callTestCase(findTestCase('FE/Partner/New Loan/List/Riwayat Pinjaman'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('FE/Partner/New Loan/List/History Riwayat Pinjaman'), [:], FailureHandling.STOP_ON_FAILURE)
    } else if (kondisi2.toLowerCase() == 'batalkan') {
        WebUI.click(findTestObject('FE/PARTNER/Beranda/button_Batalkan'))
    }
}

WebUI.closeBrowser()

