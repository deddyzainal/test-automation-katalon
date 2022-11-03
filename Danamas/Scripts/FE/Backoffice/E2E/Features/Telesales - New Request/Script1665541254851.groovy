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

if (GlobalVariable.loanNumber == '') {
	//Create loan
	CustomKeywords.'backoffice.createLoan.loanPassed'()
	
	//Assign Telesales in Loan Origination
	WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Loan Origination'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by ID Pinjaman'), [('no_pinjaman') : GlobalVariable.loanNumber],
		FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Assign Telesales'), [('no_pinjaman') : GlobalVariable.loanNumber
			, ('nama_telesales') : 'Meitri Delfiza'], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Telesales'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Filter list by Nama Peminjam'), [('nama_peminjam') : 'Katalon ' + 
        GlobalVariable.datetime], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Filter list by Kategori'), [('kategori') : 'NEW REQUEST'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Filter list by Tipe Pinjaman'), null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Filter list by ID Pinjaman'), [('id_pinjaman') : GlobalVariable.loanNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Open detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Open customer detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.back()

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Click Edit Data'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload Dokumen Agunan'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload Bukti Keuangan'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Submit edit'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Filter list by ID Pinjaman - Not found'), [('id_pinjaman') : GlobalVariable.loanNumber], 
    FailureHandling.STOP_ON_FAILURE)

