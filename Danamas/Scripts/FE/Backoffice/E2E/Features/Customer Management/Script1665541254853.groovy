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

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Customer Management'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Search list by Email'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Search list by Nama'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Search list by No Telepon'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Search list by Digi Sign Status'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Search list by Email'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Open customer detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Peminjam'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Alamat'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Alamat'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Pekerjaan'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Pekerjaan'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Penjamin'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Penjamin'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Kontak Darurat'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Kontak Darurat'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Keluarga'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Keluarga'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Bank'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Bank'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Kredensial'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Sistem'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()
