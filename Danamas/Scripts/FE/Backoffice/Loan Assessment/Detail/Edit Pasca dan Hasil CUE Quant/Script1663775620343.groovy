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

//Click tab Pasca & Hasil CUE Quant
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Pasca dan Hasil CUE Quant'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Pasca dan Hasil CUE Quant'))

WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Label - Kriteria Kredit Pasca CUE'), 5, FailureHandling.STOP_ON_FAILURE)

//Click button Edit
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Button - Edit'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Button - Edit'))

//Select Bidang Usaha
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Select - Bidang Usaha'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Option - Bidang Usaha', [('bidang_usaha') : bidang_usaha]))

//Select Level Resiko
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Select - Level Risiko'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Option - Level Risiko', [('level_risiko') : level_risiko]))

//Input Tindakan
//Q1
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q1, ('no') : '1']), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q1, ('no') : '1']))
//Q2
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q2, ('no') : '2']), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q2, ('no') : '2']))
//Q3
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q3, ('no') : '3']), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q3, ('no') : '3']))
//Q4
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q4, ('no') : '4']), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q4, ('no') : '4']))
//Q5
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q5, ('no') : '5']), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q5, ('no') : '5']))
//Q6
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q6, ('no') : '6']), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q6, ('no') : '6']))
//Q7
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q7, ('no') : '7']), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q7, ('no') : '7']))
//Q8
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q8, ('no') : '8']), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q8, ('no') : '8']))
//Q9
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q9, ('no') : '9']), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q9, ('no') : '9']))
//Q10
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q10, ('no') : '10']), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Radio - Tindakan', [('tindakan') : tindakan_q10, ('no') : '10']))

//Input Catatan Tambahan
WebUI.setText(findTestObject('Object Repository/FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Input - Catatan Tambahan'), catatan_tambahan)

//Click button Save
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Button - Save'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Button - Save'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

//Click button Get Score
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Button - Get Score'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Button - Get Score'))

WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Snackbar - Heading'), 5)

if(WebUI.getText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Snackbar - Heading')) == 'Gagal' ) {
	WebUI.delay(5)	
	//Click Get Score again if failed
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Button - Get Score'))
	WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Snackbar - Heading'), 5)
}

//Verify success snackbar is shown
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)

//Verify Peringkat Kredit values are displayed
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/TextValue - Rating'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Pasca dan Hasil CUE/TextValue - Probability of Default'), FailureHandling.STOP_ON_FAILURE)