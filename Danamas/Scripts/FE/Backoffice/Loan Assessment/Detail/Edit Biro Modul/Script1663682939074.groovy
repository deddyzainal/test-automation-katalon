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

//Click tab Biro Modul
//WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Biro Modul'))
//WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Label - Biro Modul'), 3, FailureHandling.STOP_ON_FAILURE)

//Click button Edit
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Edit'), 2)
WebUI.delay(3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Edit'))

//Generate Data Pefindo
//WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Generate Data Pefindo'), 2)
//WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Generate Data Pefindo'))
//WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)
//Verify Data Pefindo is shown


//Open Fasilitas Aktif (All)
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pemohon/Button - Fasilitas Aktif'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pemohon/Button - Fasilitas Aktif'))
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pemohon/Label - Fasilitas Aktif'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyTextPresent('Semua', false, FailureHandling.STOP_ON_FAILURE)

//Open Detail Fasilitas Aktif
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pemohon/DataTable - Fasilitas Aktif'))
WebUI.verifyTextPresent('Original Data', false, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyTextPresent('Perubahan Data', false, FailureHandling.STOP_ON_FAILURE)

//Close dialog Fasilitas Aktif
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pemohon/Button - Close'))

//Open Fasilitas Aktif Pasangan
if(status == 'Kawin') {
	WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pasangan/Button - Fasilitas Aktif'), 2)
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pasangan/Button - Fasilitas Aktif'))
	WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pasangan/Label - Fasilitas Aktif'), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyTextPresent('Semua', false, FailureHandling.STOP_ON_FAILURE)
	
	//Open Detail Fasilitas Aktif
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pasangan/DataTable - Fasilitas Aktif'))
	WebUI.verifyTextPresent('Original Data', false, FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyTextPresent('Perubahan Data', false, FailureHandling.STOP_ON_FAILURE)
	
	//Close dialog Fasilitas Aktif
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pasangan/Button - Close'))
}

//Click button Save
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Save'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Save'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)
