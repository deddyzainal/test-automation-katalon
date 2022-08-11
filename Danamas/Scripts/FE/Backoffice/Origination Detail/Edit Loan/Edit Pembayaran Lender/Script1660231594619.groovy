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

WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Label - Pembayaran Lender'), 3)

//Click dropdown Jadwal Pembayaran Lender
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Select - Jadwal Pembayaran Lender'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Select - Jadwal Pembayaran Lender'))

//Select option Jadwal Pembayaran Lender
WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Option - Jadwal Pembayaran Lender', [('jadwal_pembayaran_lender'):jadwal_pembayaran_lender]), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Option - Jadwal Pembayaran Lender', [('jadwal_pembayaran_lender'):jadwal_pembayaran_lender]))

//Click dropdown Cakupan Masa Tenggang Pembayaran Lender
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Select - Cakupan Masa Tenggang'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Select - Cakupan Masa Tenggang'))

//Select option Cakupan Masa Tenggang Pembayaran Lender
WebUI.scrollToElement(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Option - Cakupan Masa Tenggang', [('cakupan_masa_tenggang'):cakupan_masa_tenggang]), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Option - Cakupan Masa Tenggang', [('cakupan_masa_tenggang'):cakupan_masa_tenggang]))

//Input Masa Tenggang Pembayaran Lender
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Masa Tenggang Pembayaran Lender'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Origination Detail/Edit Loan/Input - Masa Tenggang Pembayaran Lender'), masa_tenggang)



