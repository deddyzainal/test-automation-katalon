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

//Click button Ubah Informasi
WebUI.click(findTestObject('FE/Backoffice/Sales/Branch/Detail/Button - Ubah Informasi'))

//Click dropdown kota
WebUI.click(findTestObject('FE/Backoffice/Sales/Branch/Form/Select - Kota'))

//Input kota in search field
WebUI.setText(findTestObject('FE/Backoffice/Sales/Branch/Form/Input - Kota'), kota)

//Select kota
WebUI.click(findTestObject('FE/Backoffice/Sales/Branch/Form/Option - Kota', [('kota') : kota]))

//Input Nama Branch
WebUI.setText(findTestObject('FE/Backoffice/Sales/Branch/Form/Input - Nama Branch'), nama_branch)

//Select Grade
WebUI.click(findTestObject('FE/Backoffice/Sales/Branch/Form/Select - Grade'))
WebUI.setText(findTestObject('FE/Backoffice/Sales/Branch/Form/Input - Search Grade'), grade)
WebUI.click(findTestObject('FE/Backoffice/Sales/Branch/Form/Option - Grade', [('grade') : grade]))

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Sales/Branch/Form/Button - Simpan'))

//Click button Confirm on the dialog
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Button - Confirm'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Common/Button - Confirm'))

//Verify success dialog is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Branch/Form/Snackbar - Subheading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Sales/Branch/Form/Snackbar - Subheading'), 'Berhasil menambahkan Branch baru', FailureHandling.STOP_ON_FAILURE)
