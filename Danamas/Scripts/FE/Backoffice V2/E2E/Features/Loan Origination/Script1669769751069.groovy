import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Login and navigate to menu Loan Origination
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Login/Login with valid credential'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Side Menu/Click menu Loan Origination'), null, FailureHandling.STOP_ON_FAILURE)

//Filter list by Nama
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Filter list by Nama'), null, FailureHandling.STOP_ON_FAILURE)

//Clear input field Nama
WebUI.sendKeys(findTestObject('FE/Backoffice V2/Loan Origination/List/Input - Nama'), Keys.chord(Keys.SHIFT, Keys.ARROW_UP))
WebUI.sendKeys(findTestObject('FE/Backoffice V2/Loan Origination/List/Input - Nama'), Keys.chord(Keys.BACK_SPACE))
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

//Filter list by No Pinjaman
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Filter list by No Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

//Clear input field No Pinjaman
WebUI.sendKeys(findTestObject('FE/Backoffice V2/Loan Origination/List/Input - No Pinjaman'), Keys.chord(Keys.SHIFT, Keys.ARROW_UP))
WebUI.sendKeys(findTestObject('FE/Backoffice V2/Loan Origination/List/Input - No Pinjaman'), Keys.chord(Keys.BACK_SPACE))
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

//Filter list by Tipe Pinjaman
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Filter list by Tipe Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

//Filter list by Status
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Filter list by Status Pinjaman'), null, FailureHandling.STOP_ON_FAILURE)

//Add new loan
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Add new loan'), null, FailureHandling.STOP_ON_FAILURE)

//Open loan detail
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/View loan detail'), null, FailureHandling.STOP_ON_FAILURE)

//Edit loan
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Edit loan'), null, FailureHandling.STOP_ON_FAILURE)

//Approve and Publish loan
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Approve loan'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Publish loan'), null, FailureHandling.STOP_ON_FAILURE)

//Cancel Loan
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Side Menu/Click menu Loan Origination'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Add new loan'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Cancel loan'), null, FailureHandling.STOP_ON_FAILURE)

//Reject Loan
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Side Menu/Click menu Loan Origination'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Add new loan'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Reject loan'), null, FailureHandling.STOP_ON_FAILURE)