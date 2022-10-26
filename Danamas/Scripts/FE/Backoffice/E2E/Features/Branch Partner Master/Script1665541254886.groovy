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

String datetime = new Date().format('yyMMddHHmmss')

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Branch Partner Master'), null, FailureHandling.STOP_ON_FAILURE)

//Branch
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Branch/Search by branch name'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Branch/Add branch'), [('nama_branch') : 'Branch ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Branch/Search by branch name'), [('nama_branch') : 'Branch ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Branch/Open branch detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Branch/Edit branch'), [('nama_branch') : 'Branch ' + datetime], FailureHandling.STOP_ON_FAILURE)

//Partner
WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Branch Partner Master'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Open tab Partner'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Search by partner name'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Add partner'), [('nama_partner') : 'Partner ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Search by partner name'), [('nama_partner') : 'Partner ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Open partner detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Edit partner'), [('nama_partner') : 'Partner ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Add partner branch'), [('nama_cabang') : 'Test ' + datetime, ('no_handphone') : datetime, ('branch_email') : datetime+'@gmail.com'], FailureHandling.STOP_ON_FAILURE)

String newdate = new Date().format('yyMMddHHmmss')

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Add partner branch'), [('nama_cabang') : 'Test ' + newdate, ('no_handphone') : newdate, ('branch_email') : newdate+'@gmail.com'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Search partner branch'), [('partner_branch') : 'Test ' + newdate], FailureHandling.STOP_ON_FAILURE)