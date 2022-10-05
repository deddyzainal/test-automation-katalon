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

//Click button Buat Pengguna Baru
WebUI.click(findTestObject('FE/Backoffice/User Management/List/Button - Buat Pengguna Baru'))

//Select Role
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/User Management/Form/Select - Role'), 3)
WebUI.click(findTestObject('FE/Backoffice/User Management/Form/Select - Role'))
WebUI.click(findTestObject('FE/Backoffice/User Management/Form/Option - Role', [('role') : role]))

//Select Jabatan
WebUI.click(findTestObject('FE/Backoffice/User Management/Form/Select - Jabatan'))
WebUI.click(findTestObject('FE/Backoffice/User Management/Form/Option - Jabatan', [('jabatan') : jabatan]))

//Input Nama Pengguna
WebUI.setText(findTestObject('FE/Backoffice/User Management/Form/Input - Nama Pengguna'), nama_pengguna)

//Input Email
WebUI.setText(findTestObject('FE/Backoffice/User Management/Form/Input - Email'), email)

//Input Kata Sandi
WebUI.setText(findTestObject('FE/Backoffice/User Management/Form/Input - Kata Sandi'), kata_sandi)

//Select Status
WebUI.click(findTestObject('FE/Backoffice/User Management/Form/Select - Status'))
WebUI.click(findTestObject('FE/Backoffice/User Management/Form/Option - Status', [('status') : status]))

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/User Management/Form/Button - Simpan'))

//Verify success dialog is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/User Management/Form/Snackbar - Subheading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/User Management/Form/Snackbar - Subheading'), 'Berhasil membuat pengguna baru!', FailureHandling.STOP_ON_FAILURE)
