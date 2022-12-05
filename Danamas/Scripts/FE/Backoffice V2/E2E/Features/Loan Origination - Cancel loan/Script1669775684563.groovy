import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Login and navigate to menu Loan Origination
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Login/Login with valid credential'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Side Menu/Click menu Loan Origination'), null, FailureHandling.STOP_ON_FAILURE)

//Add new loan
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Add new loan'), null, FailureHandling.STOP_ON_FAILURE)

//Cancel loan
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Origination/Cancel loan'), null, FailureHandling.STOP_ON_FAILURE)