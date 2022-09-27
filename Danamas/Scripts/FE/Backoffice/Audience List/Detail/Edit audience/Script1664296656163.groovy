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

//Click button Edit
WebUI.click(findTestObject('FE/Backoffice/Audience List/Detail/Button - Edit'))

//Input Nama Audience
WebUI.setText(findTestObject('FE/Backoffice/Audience List/Form/Input - Nama Audience'), nama_audience)

//Input Deskripsi
WebUI.setText(findTestObject('FE/Backoffice/Audience List/Form/Input - Deskripsi'), deskripsi)

//Input List Audience
for(int i = 0; i < email.size; i++) {
	WebUI.setText(findTestObject('FE/Backoffice/Audience List/Form/Input - List Audience'), email[i])
	WebUI.click(findTestObject('FE/Backoffice/Audience List/Form/Option - Email', [('email') : email[i]]))
}

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Audience List/Form/Button - Simpan'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Audience berhasil diubah!', FailureHandling.STOP_ON_FAILURE)