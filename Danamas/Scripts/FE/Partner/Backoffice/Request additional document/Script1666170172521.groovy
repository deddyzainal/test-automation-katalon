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

WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Data and Prospect'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Loan Assessment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by Status'), [('status') : 'SUBMITTED'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by Nama Peminjam'), [('nama_peminjam') : 'Joko Tingkir'], 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Filter by Nama Peminjam'), [('nama_peminjam') : 'Joko Tingkir'], 
//  FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/List/Open assessment detail'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Request additional document'), [('nama_dokumen_1') : 'Dokumen Katalon 1'
        , ('deskripsi_1') : 'Deskripsi 1', ('nama_dokumen_2') : 'Dokumen Katalon 2', ('deskripsi_2') : 'Deskripsi 2', ('nama_dokumen_3') : 'Dokumen Katalon 3'
        , ('deskripsi_3') : 'Deskripsi 3'], FailureHandling.STOP_ON_FAILURE)

