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

// Open KTP data form
//WebUI.click(findTestObject('FE/LancarWeb/Upload KTP/Link - Cek kelengkapan informasi KTP'))
//CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Fill Name
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Nama sesuai KTP'), 2)

WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Nama sesuai KTP'))

WebUI.clearText(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Nama sesuai KTP'))

WebUI.sendKeys(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Nama sesuai KTP'), namaKTP)

// Fill NIK
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - NIK'))

WebUI.clearText(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - NIK'))

WebUI.sendKeys(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - NIK'), NIK)

// Fill Nama Ibu Kandung
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Nama Ibu Kandung'))

WebUI.clearText(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Nama Ibu Kandung'))

WebUI.sendKeys(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Nama Ibu Kandung'), namaIbu)

// Select Jenis Kelamin
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Select - Jenis Kelamin'))

if (gender.toLowerCase() == 'laki-laki') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Laki-laki'))
} else if (gender.toLowerCase() == 'perempuan') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Perempuan'))
}

// Input Tanggal Lahir
// Open datepicker
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Button - Open Calendar'))

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Lengkapi KTP/Button - Choose month and year'), 3)

WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Button - Choose month and year'))

// Select year
String yearXpath = String.format('//mat-calendar//td[contains(@aria-label, "%s")]', dobYear)

WebUI.enhancedClick(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', yearXpath))

// Select month
String monthXpath = String.format('//mat-calendar//td[contains(@aria-label, "%s")]', dobMonth)

WebUI.enhancedClick(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', monthXpath))

// Select date
String dateXpath = String.format('//mat-calendar//div[text()=" %s "]/..', dobDate)

WebUI.enhancedClick(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', dateXpath))

// Input Tempat Lahir
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Tempat Lahir'), 2)

WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Tempat Lahir'))

WebUI.clearText(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Tempat Lahir'))

WebUI.sendKeys(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Tempat Lahir'), tempatLahir)

// Select Status Perkawinan
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Select - Status Perkawinan'))

if (statusPerkawinan.toLowerCase() == 'belum kawin') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Belum Kawin'))
} else if (statusPerkawinan.toLowerCase() == 'kawin') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Kawin'))
} else if (statusPerkawinan.toLowerCase() == 'cerai hidup') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Cerai Hidup'))
} else if (statusPerkawinan.toLowerCase() == 'cerai mati') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Cerai Mati'))
}

// Select Pendidikan Terakhir
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Select - Pendidikan Terakhir'))

if (pendidikan.toLowerCase() == 'sd') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - SD'))
} else if (pendidikan.toLowerCase() == 'smp') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - SMP'))
} else if (pendidikan.toLowerCase() == 'sma') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - SMA'))
} else if (pendidikan.toLowerCase() == 'diploma') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Diploma'))
} else if (pendidikan.toLowerCase() == 'sarjana') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Sarjana'))
} else if (pendidikan.toLowerCase() == 'magister') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Magister Master'))
} else if (pendidikan.toLowerCase() == 'master') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Magister Master'))
} else if (pendidikan.toLowerCase() == 'doktor') {
	WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Option - Doktor'))
}

// Input Alamat sesuai KTP
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Alamat sesuai KTP'), 2)

WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Alamat sesuai KTP'))

WebUI.clearText(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Alamat sesuai KTP'))

WebUI.sendKeys(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Alamat sesuai KTP'), alamat)

// Input RT
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - RT'))

WebUI.clearText(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - RT'))

WebUI.sendKeys(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - RT'), rt)

// Input RW
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - RW'))

WebUI.clearText(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - RW'))

WebUI.sendKeys(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - RW'), rw)

// Select Provinsi
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Select - Provinsi'))

String provinsiXpath = String.format('//mat-option/span[text()=" %s "]', provinsi)

WebUI.scrollToElement(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', provinsiXpath), 2)

WebUI.click(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', provinsiXpath))

// Select Kota/Kabupaten
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Select - Kota Kabupaten'))

String kotaXpath = String.format('//mat-option/span[text()=" %s "]', kota)

WebUI.scrollToElement(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kotaXpath), 2)

WebUI.click(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kotaXpath))

// Select Kecamatan
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Select - Kecamatan'))

String kecamatanXpath = String.format('//mat-option/span[text()=" %s "]', kecamatan)

WebUI.scrollToElement(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kecamatanXpath), 2)

WebUI.click(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kecamatanXpath))

// Select Kelurahan
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Select - Kelurahan'))

String kelurahanXpath = String.format('//mat-option/span[text()=" %s "]', kelurahan)

WebUI.scrollToElement(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kelurahanXpath), 2)

WebUI.click(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kelurahanXpath))

// Click button KIRIM
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Lengkapi KTP/Button - KIRIM (enabled)'), 2)

WebUI.enhancedClick(findTestObject('FE/LancarWeb/Lengkapi KTP/Button - KIRIM (enabled)'))