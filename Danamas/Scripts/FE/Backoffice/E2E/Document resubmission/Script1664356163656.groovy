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

//Login
WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), [:], FailureHandling.STOP_ON_FAILURE)

//Click menu Data & Prospect
WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Data and Prospect'), [:], FailureHandling.STOP_ON_FAILURE)

//Click menu Loan Assessment
WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Loan Assessment'), [:], FailureHandling.STOP_ON_FAILURE)

//Filter list by No Pinjaman
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by No Pinjaman'), [('no_pinjaman') : no_pinjaman], 
    FailureHandling.STOP_ON_FAILURE)

//Open assessment detail
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Open assessment detail'), [:], FailureHandling.STOP_ON_FAILURE)

//Open folder Dokumen Agunan
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Open folder Dokumen Agunan'), [:], FailureHandling.STOP_ON_FAILURE)

//Resubmit PBB
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Resubmit PBB'), [:], FailureHandling.STOP_ON_FAILURE)

