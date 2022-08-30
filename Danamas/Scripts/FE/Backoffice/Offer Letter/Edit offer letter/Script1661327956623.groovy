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

//Click button Edit in Offer Detail page
WebUI.scrollToElement(findTestObject('FE/Backoffice/Offer Letter/Detail/Button - Edit'), 3)
WebUI.click(findTestObject('FE/Backoffice/Offer Letter/Detail/Button - Edit'))

WebUI.waitForPageLoad(3)

//Verify label Buat Surat Penawaran Pinjaman in detail page is present
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Label - Buat Surat Penawaran Pinjaman'))

//Input Borrower's Name
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Borrower Name'), borrower_name)

//Input Loan Amount
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Loan Amount'), loan_amount)

//Input Tenure
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Tenure'), tenure)

//Input Interest
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Interest'), interest)

//Select Collateral Type
WebUI.selectOptionByValue(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Select - Collateral Type'), collateral_type, false)

//Input Collateral Address
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Collateral Address'), collateral_address)

//Input Certificate Number
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Certificate Number'), certificate_number)

//Input Land Size and Building Size
if (collateral_type == 'Rumah') {
	WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Land Size'), land_size)

	WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Building Size'), building_size)
}
else if (collateral_type == 'Tanah Produktif') {
	WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Land Size'), land_size)
}
else if (collateral_type == 'Apartemen' || collateral_type == 'Ruko') {
	WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Building Size'), building_size)
}

//Input Provision
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Provision'), provision)

//Input Provision Fee
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Provision Fee'), provision_fee)

//Input Administration
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Administration'), administration)

//Input Life Insurance Fee
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Life Insurance Fee'), life_insurance_fee)

//Input Fire Insurance Fee
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Fire Insurance Fee'), fire_insurance_fee)

//Input Notary Fee
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Notary Fee'), notary_fee)

//Input Advance Penalty Fee
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Advance Penalty Fee'), advance_penalty_fee)

//Input Late Penalty Fee
WebUI.setText(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Input - Late Penalty Fee'), late_penalty_fee)

//Click button Continue
WebUI.click(findTestObject('FE/Backoffice/Offer Letter/Detail/Offer Letter Edit/Button - Continue'))

//Verify label Ringkasan is present
WebUI.verifyElementVisible(findTestObject('FE/Backoffice/Offer Letter/Detail/Ringkasan/Label - Ringkasan'))
