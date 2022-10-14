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

//Click button Cancel Permintaan Peminjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Button - Tolak'))

//Select Alasan Cancel
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Select - Alasan Cancel'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Option - Alasan Cancel', [('alasan_cancel') : alasan_cancel]))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Select - Alasan Cancel'))

//Click Ya, Tolak Pengajuan
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Button - Ya, Tolak Pengajuan'))

////Verify success snackbar is shown
//WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)