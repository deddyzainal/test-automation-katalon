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

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Button - YA, HITUNG SEKARANG'), 5)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Select - Jenis Jaminan'), 5)

if (jenisJaminan.toLowerCase() == "rumah")
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Option - Rumah'), 3)
else if (jenisJaminan.toLowerCase() == "apartemen")
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Option - Apartemen'), 3)
else if (jenisJaminan.toLowerCase() == "ruko")
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Option - Ruko'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Luas Tanah'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Luas Tanah'), luasTanah, 3)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Luas Bangunan'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Luas Bangunan'), luasBangunan, 3)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Cari Lokasi'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Input - Cari Lokasi'), lokasi, 3)
Mobile.hideKeyboard()

// Tap the first found location twice, somehow the first tap is not registered though it was success by Katalon
Mobile.delay(2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Option - First found location'), 10)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Option - First found location'), 2)
Mobile.delay(5)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Kalkulator Properti/Button - Pilih Lokasi Ini'), 3)

// Verifying the location detail returned from the selected location
Mobile.scrollToText(kodePos)
Mobile.scrollToText(kelurahan)
Mobile.scrollToText(kecamatan)
Mobile.scrollToText(kota)
Mobile.scrollToText(provinsi)
Mobile.scrollToText('Lokasi tidak tersedia, silahkan pilih lokasi lain')