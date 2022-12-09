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

//Login and navigate to menu User Management
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Login/Login with valid credential'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Side Menu/Click menu User Management'), null, FailureHandling.STOP_ON_FAILURE)

//Filter list by Nama
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Filter list by Nama'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('FE/Backoffice V2/User Management/List/Input - Nama'), Keys.chord(Keys.SHIFT, Keys.ARROW_UP))
WebUI.sendKeys(findTestObject('FE/Backoffice V2/User Management/List/Input - Nama'), Keys.chord(Keys.BACK_SPACE))
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

//Filter list by Email
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Filter list by Email'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('FE/Backoffice V2/User Management/List/Input - Email'), Keys.chord(Keys.SHIFT, Keys.ARROW_UP))
WebUI.sendKeys(findTestObject('FE/Backoffice V2/User Management/List/Input - Email'), Keys.chord(Keys.BACK_SPACE))
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

//Filter list by Phone
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Filter list by Phone'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.sendKeys(findTestObject('FE/Backoffice V2/User Management/List/Input - Phone No'), Keys.chord(Keys.SHIFT, Keys.ARROW_UP))
WebUI.sendKeys(findTestObject('FE/Backoffice V2/User Management/List/Input - Phone No'), Keys.chord(Keys.BACK_SPACE))
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

//Filter list by Tipe User
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Filter list by Tipe User'), null, FailureHandling.STOP_ON_FAILURE)

//Filter list by Digital Signature
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Filter list by Digital Signature'), null, FailureHandling.STOP_ON_FAILURE)

//Filter list by NPWP Status
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Filter list by NPWP Status'), null, FailureHandling.STOP_ON_FAILURE)

//Filter list by KTP Status
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Filter list by KTP Status'), null, FailureHandling.STOP_ON_FAILURE)

//Add new user BORROWER INDIVIDUAL
String phone_no = '8' + new Date().format('yyMMddHHmmss')
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Add new user'), [('phone_no') : phone_no, ('name') : 'Borrower Ind', ('user_type') : 'Borrower', ('borrower_lender_type') : 'Individual'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit User Information'), [('phone_number') : phone_no, ('name') : 'Borrower Ind', ('user') : 'Borrower', ('type') : 'Individual'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit Informasi Credential'), [('type') : 'Individual'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit Informasi Tambahan'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Save data completion'), null, FailureHandling.STOP_ON_FAILURE)

//Add new user BORROWER INSTITUTIONAL
phone_no = '8' + new Date().format('yyMMddHHmmss')
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Side Menu/Click menu User Management'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Add new user'), [('phone_no') : phone_no, ('name') : 'Borrower Ins', ('user_type') : 'Borrower', ('borrower_lender_type') : 'Institutional'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit User Information'), [('phone_number') : phone_no, ('name') : 'Borrower Ins', ('nama_perusahaan') : 'PT Borrower Ins', ('user') : 'Borrower', ('type') : 'Institutional'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit Informasi Credential'), [('type') : 'Institutional'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit Informasi Tambahan'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Save data completion'), null, FailureHandling.STOP_ON_FAILURE)

//Add new user LENDER INDIVIDUAL
phone_no = '8' + new Date().format('yyMMddHHmmss')
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Side Menu/Click menu User Management'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Add new user'), [('phone_no') : phone_no, ('name') : 'Lender Ind', ('user_type') : 'Lender', ('borrower_lender_type') : 'Individual'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit User Information'), [('phone_number') : phone_no, ('name') : 'Lender Ind', ('user') : 'Lender', ('type') : 'Individual'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit Informasi Credential'), [('type') : 'Individual'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit Informasi Tambahan'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Save data completion'), null, FailureHandling.STOP_ON_FAILURE)

//Add new user LENDER INSTITUTIONAL
phone_no = '8' + new Date().format('yyMMddHHmmss')
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Side Menu/Click menu User Management'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Add new user'), [('phone_no') : phone_no, ('name') : 'Lender Ins', ('user_type') : 'Lender', ('borrower_lender_type') : 'Institutional'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit User Information'), [('phone_number') : phone_no, ('name') : 'Lender Ins', ('nama_perusahaan') : 'PT Lender Ins', ('user') : 'Lender', ('type') : 'Institutional'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit Informasi Credential'), [('type') : 'Institutional'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Edit Informasi Tambahan'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/User Management/Save data completion'), null, FailureHandling.STOP_ON_FAILURE)