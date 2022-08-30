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

//Click Edit Data button
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Button - Edit Data'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Button - Edit Data'))

//Select Tipe Peminjam
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Select - Tipe Peminjam'))
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Option - Tipe Peminjam', [('tipe_peminjam') : tipe_peminjam]))

//Select Tujuan Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Select - Tujuan Pinjaman'))
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Option - Tujuan Pinjaman', [('tujuan_pinjaman') : tujuan_pinjaman]))

//Input Jumlah Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Input - Jumlah Pinjaman'), jumlah_pinjaman)

//Select Tenure
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Select - Tenure'))
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Option - Tenure', [('tenure') : tenure]))

//Input Nilai Agunan
WebUI.setText(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Input - Nilai Agunan'), nilai_agunan)

//Click button Perbarui Informasi
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/Detail/Rincian Biaya Pinjaman/Button - Perbarui Informasi'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Snackbar Text'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Snackbar Text'), 'Rincian pinjaman telah diperbarui!')