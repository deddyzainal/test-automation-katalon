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

if(GlobalVariable.loanNumber == '') {
	//Create loan
	CustomKeywords.'backoffice.createLoan.loanSubmitted'()
	
	//Approve loan in Loan Assessment
	WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Loan Assessment'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by No Pinjaman'), [('no_pinjaman') : GlobalVariable.loanNumber], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Assign Credit Analyst'), [('no_pinjaman') : GlobalVariable.loanNumber
		, ('nama_credit_analyst') : 'Meitri Delfiza'], FailureHandling.STOP_ON_FAILURE)

	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Open assessment detail'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Edit Biro Modul'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Add SMMA Blacklist'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Edit SMMA Blacklist'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Edit Modul Penghasilan'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Edit Detail Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Edit Assessment Tempat Usaha'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Edit Pasca dan Hasil CUE Quant'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Edit Persetujuan Akhir'), null, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Approve loan'), null, FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Offer Letter'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Offer Letter/Open offer letter detail'), [('id_pinjaman') : GlobalVariable.loanNumber], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Offer Letter/Edit offer letter'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Offer Letter/Send document'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Loan Assessment'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by No Pinjaman'), [('no_pinjaman') : GlobalVariable.loanNumber], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/List/TextValue - Status'), 'OFFER_SENT', FailureHandling.STOP_ON_FAILURE)
