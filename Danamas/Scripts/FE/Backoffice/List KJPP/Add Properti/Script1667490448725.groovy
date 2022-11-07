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

//Click tab Properti
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Tab - Properti'))
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/List KJPP/Detail/Properti/Button - Tambah Properti'), 3, FailureHandling.STOP_ON_FAILURE)

//Click button Tambah Properti
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Properti/Button - Tambah Properti'))

//Input Jenis Properti
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Detail/Properti/Input - Jenis Properti'), jenis_properti)

//Input Luas Awal
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Detail/Properti/Input - Luas Awal'), luas_awal)

//Input Luas Akhir
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Detail/Properti/Input - Luas Akhir'), luas_akhir)

//Input Biaya Appraisal
WebUI.setText(findTestObject('FE/Backoffice/List KJPP/Detail/Properti/Input - Biaya Appraisal'), biaya_appraisal)

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/List KJPP/Detail/Properti/Button - Tambah'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Subheading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Subheading'), 'Berhasil menambah properti', FailureHandling.STOP_ON_FAILURE)