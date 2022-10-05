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

WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Sales'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Branch Partner Master'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Branch/Search by branch name'), [('nama_branch') : 'Kantor Pusat'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Branch/Add branch'), [('kota') : 'Jakarta Barat', ('nama_branch') : 'Bali2'
        , ('grade') : 'Grade E'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Branch/Search by branch name'), [('nama_branch') : 'Bali2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Branch/Open branch detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Branch/Edit branch'), [('kota') : 'Jakarta Timur', ('nama_branch') : 'Bali2'
        , ('grade') : 'Grade O'], FailureHandling.STOP_ON_FAILURE)

//Partner
WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Open tab Partner'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Search by partner name'), [('nama_partner') : 'BSIM'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Add partner'), [('tipe_partner') : 'Internal', ('nama_partner') : 'Partner - Katalon2'
        , ('nama_bank') : 'Bank Sinarmas', ('nama_pemilik_rekening') : 'Kaka', ('nomor_rekening') : '66665656565656', ('tipe_pembayaran_insentif') : 'Terbuka'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Search by partner name'), [('nama_partner') : 'Partner - Katalon2'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Open partner detail'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Partner/Edit partner'), [('tipe_partner') : 'External', ('nama_partner') : 'Partner - Katalon2'
        , ('nama_bank') : 'Bank BTPN', ('nama_pemilik_rekening') : 'Carol', ('nomor_rekening') : '777775757577', ('tipe_pembayaran_insentif') : 'Tertutup'], 
    FailureHandling.STOP_ON_FAILURE)
//Grading
//WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Grading Master'), null, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Grading/Search by grade name'), [('grade') : 'Grade O'], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Grading/Add grade'), [('grade') : 'Grade Q', ('nominal_target_penjualan') : '200000000'
//        , ('persentase_pencapaian') : '70'], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Grading/Search by grade name'), [('grade') : 'Grade R'], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Grading/Open greade detail'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('FE/Backoffice/Sales/Grading/Edit grade'), [('nominal_target_penjualan') : '500000000', ('persentase_pencapaian') : '72'], 
//    FailureHandling.STOP_ON_FAILURE)

