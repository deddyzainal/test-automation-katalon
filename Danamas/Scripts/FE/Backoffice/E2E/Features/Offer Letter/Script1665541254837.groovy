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

//if(GlobalVariable.loanNumber == '') {
//	//Assign telesales
//	//Register account
//	WebUI.callTestCase(findTestCase('BE/Register account'), null, FailureHandling.STOP_ON_FAILURE)
//	
//	//Login
//	WebUI.callTestCase(findTestCase('BE/Lancar/Login'), [('datetime') : GlobalVariable.datetime], FailureHandling.STOP_ON_FAILURE)
//	
//	//Submit loan
//	WebUI.callTestCase(findTestCase('BE/Lancar/Create loan'), [('token') : GlobalVariable.token, ('userId') : GlobalVariable.userId, ('datetime') : GlobalVariable.datetime], FailureHandling.STOP_ON_FAILURE)
//
//	
//	//Complete document in Telesales menu
//	WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Task List'), null, FailureHandling.STOP_ON_FAILURE)
//	
//	WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Telesales'), null, FailureHandling.STOP_ON_FAILURE)
//	
//	WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Filter list by ID Pinjaman'), [('id_pinjaman') : GlobalVariable.loanNumber],
//		FailureHandling.STOP_ON_FAILURE)
//	
//	WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Open detail'), null, FailureHandling.STOP_ON_FAILURE)
//	
//	WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Open customer detail'), null, FailureHandling.STOP_ON_FAILURE)
//	
//	WebUI.back()
//	
//	WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Click Edit Data'), null, FailureHandling.STOP_ON_FAILURE)
//	
//	WebUI.delay(3)
//	
//	WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload Dokumen Agunan'), null, FailureHandling.STOP_ON_FAILURE)
//	
//	WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload Bukti Keuangan'), null, FailureHandling.STOP_ON_FAILURE)
//	
//	WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Submit edit'), null, FailureHandling.STOP_ON_FAILURE)
//	
//	//Approve request in Loan Assessment
//	WebUI.callTestCase(findTestCase('null'), null, FailureHandling.STOP_ON_FAILURE)
//}

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Operation'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Offer Letter'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Offer Letter/Open offer letter detail'), [('id_pinjaman') : GlobalVariable.loanNumber], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Offer Letter/Edit offer letter'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Offer Letter/Send document'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Data and Prospect'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Loan Assessment'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by No Pinjaman'), [('no_pinjaman') : GlobalVariable.loanNumber], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/List/TextValue - Status'), 'OFFER_SENT', FailureHandling.STOP_ON_FAILURE)
