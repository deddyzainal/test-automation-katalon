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

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Reaktivasi'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Filter by Nama Peminjam'), null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Filter by KTP Peminjam'), null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Reset filter'), null, FailureHandling.CONTINUE_ON_FAILURE)

//Filter by status CANCELLED
WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Filter by Status'), [('status') : 'CANCELLED'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh()

//Filter by status REJECTED
WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Filter by Status'), [('status') : 'REJECTED'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Filter by No Pinjaman'), [('no_pinjaman') : no_pinjaman], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Open loan detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Reactivate loan'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by ID Pinjaman'), [('no_pinjaman') : no_pinjaman], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Open loan detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/Detail/Cancel loan'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Loan Origination'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Origination/List/Filter list by ID Pinjaman'), [('no_pinjaman') : no_pinjaman], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Origination/List/TextValue - Status'), 'CANCELLED', FailureHandling.STOP_ON_FAILURE)