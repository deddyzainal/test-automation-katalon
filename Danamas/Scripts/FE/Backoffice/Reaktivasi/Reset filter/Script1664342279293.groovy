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

//Filter by No Pinjaman, Nama Peminjam, KTP
WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Filter by No Pinjaman'), [('no_pinjaman') : 'KC-KFO-0922-28-0001'], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Filter by Nama Peminjam'), [('nama_peminjam') : 'test10'], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice/Reaktivasi/Filter by KTP Peminjam'), [('ktp') : '2022092811371312'], FailureHandling.STOP_ON_FAILURE)

//Click button Reset Filter
WebUI.click(findTestObject('FE/Backoffice/Reaktivasi/Button - Reset Filter'))

//Verify No Pinjaman, Nama Peminjam, KTP fields are empty
WebUI.verifyElementText(findTestObject('FE/Backoffice/Reaktivasi/Input - No Pinjaman'), '', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Reaktivasi/Input - Nama Peminjam'), '', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Reaktivasi/Input - KTP'), '', FailureHandling.STOP_ON_FAILURE)
