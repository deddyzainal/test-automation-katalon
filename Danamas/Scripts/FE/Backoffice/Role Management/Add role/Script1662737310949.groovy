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

//Click button Buat Role Baru
WebUI.click(findTestObject('FE/Backoffice/Role Management/List/Button - Buat Role Baru'))

//Input Nama Pengguna
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Role Management/Form/Input - Nama Role'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Role Management/Form/Input - Nama Role'), nama_role)

//Select Portal
WebUI.click(findTestObject('FE/Backoffice/Role Management/Form/Select - Portal'))
WebUI.click(findTestObject('FE/Backoffice/Role Management/Form/Option - Portal', [('portal') : portal]))

//Select Akses Menu
WebUI.click(findTestObject('FE/Backoffice/Role Management/Form/Select - Akses Menu'))
WebUI.click(findTestObject('FE/Backoffice/Role Management/Form/Option - Akses Menu', [('akses_menu') : akses_menu]))

//Select dropdown Akses Aksi
WebUI.click(findTestObject('FE/Backoffice/Role Management/Form/Select - Akses Aksi'))

for(int i = 0; i < akses_aksi.size; i++) {
	//Select aksi
	WebUI.click(findTestObject('FE/Backoffice/Role Management/Form/Option - Akses Aksi', [('akses_aksi') : akses_aksi[i]]))
}

//Dismiss options dialog by clicking again the dropdown
WebUI.click(findTestObject('FE/Backoffice/Role Management/Form/Select - Akses Aksi'))

//Select Akses Sub-Aksi
WebUI.click(findTestObject('FE/Backoffice/Role Management/Form/Select - Akses SubAksi'))
WebUI.click(findTestObject('FE/Backoffice/Role Management/Form/Option - Akses SubAksi', [('akses_sub') : akses_sub]))

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Role Management/Form/Button - Simpan'))

//Verify success dialog is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Role Management/Form/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Role Management/Form/Snackbar - Heading'), 'Berhasil membuat role baru!', FailureHandling.STOP_ON_FAILURE)
