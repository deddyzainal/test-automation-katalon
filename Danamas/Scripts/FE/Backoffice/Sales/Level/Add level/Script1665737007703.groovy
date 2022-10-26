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

//Get maks point from the last level
while(WebUI.verifyElementPresent(findTestObject('FE/Backoffice/Sales/Level/List/Button - Next Page'), 3, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('FE/Backoffice/Sales/Level/List/Button - Next Page'))
}

String prev_point = WebUI.getText(findTestObject('FE/Backoffice/Sales/Level/List/TextValue - Last Point'), FailureHandling.STOP_ON_FAILURE)
String[] str = prev_point.split(' - ')
int last_point = str[1].toInteger()
int min_point = last_point + 1
int max_point = min_point + 999

//Click button Tambah Level
WebUI.click(findTestObject('Object Repository/FE/Backoffice/Sales/Level/List/Button - Tambah Level'))

//Input Nama Level
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Level/Form/Input - Nama Level'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice/Sales/Level/Form/Input - Nama Level'), nama_level)

//Input Jumlah Poin Minimal
WebUI.setText(findTestObject('FE/Backoffice/Sales/Level/Form/Input - Poin Minimal'), min_point.toString())

//Input Jumlah Poin Maksimal
WebUI.setText(findTestObject('FE/Backoffice/Sales/Level/Form/Input - Poin Maksimal'), max_point.toString())

//Upload file icon
WebUI.uploadFile(findTestObject('FE/Backoffice/Sales/Level/Form/Input - Badge Icon'), file)

//Click button Tambah Level Baru
WebUI.click(findTestObject('FE/Backoffice/Sales/Level/Form/Button - Tambah Level Baru'))

//Click button Confirm on confirmation dialog
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Level/Form/Button - Confirm'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Sales/Level/Form/Button - Confirm'))

//Verify success dialog is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Branch/Form/Snackbar - Subheading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Sales/Branch/Form/Snackbar - Subheading'), 'Berhasil menambahkan Level baru', FailureHandling.STOP_ON_FAILURE)

