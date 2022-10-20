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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Click tab Assessment Tempat Usaha
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Assessment Tempat Usaha'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Assessment Tempat Usaha'))

WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Label - Modul Assessment Tempat Usaha'), 5, FailureHandling.STOP_ON_FAILURE)

//Click button Edit
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Button - Edit'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Button - Edit'))

//Select Model Assessment
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Select - Model Assessment'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Select - Model Assessment'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Option - Model Assessment', [('model_assessment') : model_assessment]))

//Select Bidang Usaha
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Select - Bidang Usaha'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Option - Bidang Usaha', [('bidang_usaha') : bidang_usaha]))

//Input Tanggal Assessment
//Select Month
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Input - Tanggal Assessment'))
WebUI.selectOptionByLabel(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Select - Bulan'), bulan, false)
//Select Year
WebUI.selectOptionByLabel(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Select - Tahun'), tahun, false)
//Select Date
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Select - Tanggal', [('tanggal') : tanggal]))

//Input Waktu Assessment
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Input - Waktu Assessment'), waktu_assessment)

//Input Alamat Tempat Usaha
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Input - Alamat Tempat Usaha'), alamat_tempat_usaha)

//Input answers question
//Q1
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q1', ('answer') : answer_q1]), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q1', ('answer') : answer_q1]))
//Q2
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q2', ('answer') : answer_q2]), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q2', ('answer') : answer_q2]))
//Q3
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q3', ('answer') : answer_q3]), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q3', ('answer') : answer_q3]))
//Q4
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q4', ('answer') : answer_q4]), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q4', ('answer') : answer_q4]))
//Q5
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q5', ('answer') : answer_q5]), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q5', ('answer') : answer_q5]))
//Q6
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q6', ('answer') : answer_q6]), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q6', ('answer') : answer_q6]))
//Q7
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q7', ('answer') : answer_q7]), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q7', ('answer') : answer_q7]))
//Q8
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q8', ('answer') : answer_q8]), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q8', ('answer') : answer_q8]))
//Q9
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q9', ('answer') : answer_q9]), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q9', ('answer') : answer_q9]))
//Q10
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q10', ('answer') : answer_q10]), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Radio - Answer', [('question') : 'Q10', ('answer') : answer_q10]))

//Input Catatan untuk kunjungan
WebUI.setText(findTestObject('Object Repository/FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Input - Catatan'), catatan_kunjungan)

//Click button Save
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Button - Save'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Button - Save'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Assessment Tempat Usaha/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)