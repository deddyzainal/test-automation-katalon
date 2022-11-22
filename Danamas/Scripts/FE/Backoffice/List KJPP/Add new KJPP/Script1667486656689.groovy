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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Click button Tambah KJPP Baru
WebUI.click(findTestObject('FE/Backoffice/List KJPP/List/Button - Tambah KJPP Baru'))

//Input Nama KJPP
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Form/Input - Nama KJPP'), nama_kjpp)

//Select Status
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Form/Radio - Status KJPP', [('status') : status]))

//Select Provinsi
WebUI.scrollToElement(findTestObject('FE/Backoffice/List KJPP/Form/Select - Provinsi'), 3)
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Form/Select - Provinsi'))
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Form/Option - Provinsi', [('provinsi') : provinsi]))

//Select Kota
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Form/Select - Kota'))
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Form/Option - Kota', [('kota') : kota]))

//Input Nama PIC
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Form/Input - Nama PIC'), nama_pic)

//Select Kode Negara
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Form/Select - Kode Negara'))
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Form/Option - Kode Negara', [('negara') : negara]))

//Input No Telepon PIC
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Form/Input - No Telepon PIC'), no_telepon_pic)

//Input Jenis Properti
WebUI.scrollToElement(findTestObject('FE/Backoffice/List KJPP/Form/Input - Jenis Properti'), 3)
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Form/Input - Jenis Properti'), jenis_properti)

//Input Luas Awal
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Form/Input - Luas Awal'), luas_awal)

//Input Luas Akhir
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Form/Input - Luas Akhir'), luas_akhir)

//Input Biaya Appraisal
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Form/Input - Biaya Appraisal'), biaya_appraisal)

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Form/Button - Simpan'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Subheading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Subheading'), 'KJPP berhasil ditambah!', FailureHandling.STOP_ON_FAILURE)