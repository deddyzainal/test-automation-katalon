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

WebUI.callTestCase(findTestCase('FE/Partner/Register/Register User AS Branch - Branch Manager'), [('Agen') : 'branch', ('timestamp1') : GlobalVariable.timestamp], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/E2E/Approve request'), [('no_hp') : GlobalVariable.timestamp, ('email') : ''
        , ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Login/Login with credential'), [('nomorhp') : GlobalVariable.timestamp, ('katasandi') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Menu Akun/AturPIN'), [('newpin') : '123456', ('text') : 'Yay, PIN baru Anda sudah dapat digunakan'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Beranda/User Branch Partner'), [('badge') : GlobalVariable.badge], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/New Loan/Make New Loan and Submit Document with Different Option (Jenis Pekerjaan, Status Kawin)'), 
    [('pengajuan') : 'dana express', ('badge') : GlobalVariable.badge], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/E2E/Document resubmission'), [('nama_peminjam') : 'Joko Santoso2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Send Document/Resubmission Document'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/E2E/Request additional document'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Partner/Send Document/Requested Additional Document'), [:], FailureHandling.STOP_ON_FAILURE)

