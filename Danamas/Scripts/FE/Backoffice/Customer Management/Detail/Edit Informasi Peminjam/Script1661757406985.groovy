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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Click button Edit Data
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Button - Edit Data'))

WebUI.waitForPageLoad(3)

//Input Nama Sesuai KTP
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Nama'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Nama'), nama)

//Input NIK
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - NIK'), nik)

//Select Jenis Kelamin
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Jenis Kelamin'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Option - Jenis Kelamin', [('jenis_kelamin'):jenis_kelamin]))

//Input Nama Ibu Kandung
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Nama Ibu Kandung'), nama_ibu_kandung)

//Input Tempat Lahir
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Tempat Lahir'), tempat_lahir)

//Input Tanggal Lahir
//WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Tanggal Lahir'), tanggal_lahir)

//Input Nomor Handphone
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Nomor Handphone'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Nomor Handphone'), nomor_handphone)

//Input Email
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Email'), email)

//Select Status Pernikahan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Status Pernikahan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Option - Status Pernikahan', [('status_pernikahan'):status_pernikahan]))

//Select Pendidikan Terakhir
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Pendidikan Terakhir'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Option - Pendidikan Terakhir', [('pendidikan_terakhir'):pendidikan_terakhir]))

//Select Agama
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Agama'), 2)
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Agama'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Option - Agama', [('agama'):agama]))

//Select Kewarganegaraan
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Kewarganegaraan'), 2)
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Kewarganegaraan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Option - Kewarganegaraan', [('kewarganegaraan'):kewarganegaraan]))

//Upload Foto KK
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto KK'), 2)
//WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto KK'))
WebUI.uploadFile(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto KK'), foto_kk)

//Upload Foto NPWP
WebUI.uploadFile(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto NPWP'), foto_npwp)

//Upload Foto KTP
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto KTP'), 2)
WebUI.uploadFile(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto KTP'), foto_ktp)

//Upload Foto Selfie dengan KTP
WebUI.uploadFile(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto Selfie dengan KTP'), foto_selfie)

//Upload Foto KTP Pasangan

//Upload Foto Buku Nikah

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Button - Simpan'))

//Click button Confirm on onfirmation modal
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Button - Confirm'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Button - Confirm'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Snackbar Text'), 5)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Snackbar Text'), 'Sukses Mengubah Data', FailureHandling.STOP_ON_FAILURE)


