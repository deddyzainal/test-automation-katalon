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

//Click Edit Data button
WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Button - Edit Data'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Button - Edit Data'))

//Input Luas Tanah
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Input - Luas Tanah'), luas_tanah)

//Input Luas Bangunan
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Input - Luas Bangunan'), luas_bangunan)

//Input Alamat
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Input - Alamat'), alamat)

//Input Longitude
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Input - Longitude'), longitude)

//Input Latitude
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Input - Latitude'), latitude)

//Select Provinsi
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Select - Provinsi'))
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Option - Provinsi', [('provinsi') : provinsi]))

//Select Kota Kabupaten
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Select - Kota Kabupaten'))
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Option - Kota Kabupaten', [('kota_kabupaten') : kota_kabupaten]))

//Select Kecamatan
WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Select - Kecamatan'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Select - Kecamatan'))
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Option - Kecamatan', [('kecamatan') : kecamatan]))

//Select Kelurahan Desa
WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Select - Kelurahan Desa'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Select - Kelurahan Desa'))
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Option - Kelurahan Desa', [('kelurahan_desa') : kelurahan_desa]))

//Input Kode Pos
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Input - Kode Pos'), kode_pos)

//Input Nama Pemilik
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Input - Nama Pemilik di PBB'), nama_pemilik)

//Click button Perbarui Informasi
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Detail Agunan/Button - Perbarui Informasi'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Snackbar Text'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Snackbar Text'), 'Informasi agunan telah diperbarui!')