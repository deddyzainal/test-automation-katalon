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
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Button - Edit Data'))

WebUI.waitForPageLoad(3)



//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Button - Simpan'))

//Click button Confirm on onfirmation modal
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Button - Confirm'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Button - Confirm'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Snackbar Text'), 5)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Snackbar Text'), 'Sukses Mengubah Data', FailureHandling.STOP_ON_FAILURE)


