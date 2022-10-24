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

WebUI.callTestCase(findTestCase('FE/Partner/Menu Akun/Edit Profile After Set Pin'), [('newpin') : '123456'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Profil/button_Ubah Informasi Pribadi'))

WebUI.verifyElementVisible(findTestObject('FE/PARTNER/Profil/text_Ubah Informasi Pribadi'))

//gender
if (gender.toLowerCase() == 'laki-laki') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/option-laki laki'))
} else if (gender.toLowerCase() == 'perempuan') {
    WebUI.click(findTestObject('FE/PARTNER/Beranda/option-perempuan'))
}

WebUI.click(findTestObject('FE/PARTNER/Register/input_Masukkan tempat lahir'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_Masukkan tempat lahir'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Masukkan tempat lahir'), tempatlahir)

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

WebUI.click(findTestObject('FE/PARTNER/Profil/input_RTRW'))

WebUI.clearText(findTestObject('FE/PARTNER/Profil/input_RTRW'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_RTRW'), rt)

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_RTRW'), rw)

WebUI.click(findTestObject('FE/PARTNER/Beranda/input_Kode Pos2'))

WebUI.clearText(findTestObject('FE/PARTNER/Beranda/input_Kode Pos2'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FE/PARTNER/Beranda/input_Kode Pos2'), kodepos)

WebUI.scrollToPosition(700, 750)

WebUI.check(findTestObject('FE/PARTNER/Profil/check_alamatdomisili'))

WebUI.scrollToPosition(900, 950)

WebUI.click(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'))

WebUI.clearText(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'), alamatdomisili)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/textarea_Alamat Domisili'), 2)

WebUI.scrollToElement(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'), 2)

WebUI.click(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'))

WebUI.clearText(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'), rt2)

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'), rw2)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/input_Masukkan RTRW'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/input_Kode Pos'))

WebUI.clearText(findTestObject('FE/PARTNER/Profil/input_Kode Pos'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_Kode Pos'), kodepos2)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/input_Kode Pos'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/input_Fax2'))

WebUI.clearText(findTestObject('FE/PARTNER/Profil/input_Fax2'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_Fax2'), fax)

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/input_Fax2'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/button_Simpan Informasi Pribadi'))

WebUI.click(findTestObject('FE/PARTNER/Profil/button_Ya, simpan'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/button_Ya, simpan'), 2)

WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Profil/button_OKsimpan'), 2)

WebUI.click(findTestObject('FE/PARTNER/Profil/button_OKsimpan'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

