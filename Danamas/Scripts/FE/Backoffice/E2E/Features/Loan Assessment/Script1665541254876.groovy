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

WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), [('email') : GlobalVariable.email_ca, ('password') : GlobalVariable.password_ca], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Data and Prospect'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Loan Assessment'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by Nama Peminjam'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by No Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by No Telepon'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by Status'), [('status') : 'PASSED'], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by No Pinjaman'), [('no_pinjaman') : no_pinjaman], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Assign Credit Analyst'), [('no_pinjaman') : no_pinjaman], FailureHandling.STOP_ON_FAILURE)

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
