import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click tab Detail Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Detail Pinjaman'))
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Label - Detail Pinjaman'), 3, FailureHandling.STOP_ON_FAILURE)

//Click button Edit
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Button - Edit'), 2)
WebUI.delay(3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Button - Edit'))

//Add data pinjaman take over
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Add Pinjaman Take Over'), null, FailureHandling.STOP_ON_FAILURE)

//Add kewajiban hutang
WebUI.callTestCase(findTestCase('Test Cases/FE/Backoffice/Loan Assessment/Detail/Add Kewajiban Hutang Bulanan'), null, FailureHandling.STOP_ON_FAILURE)

//Click button Save
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Button - Save'), 3)
WebUI.delay(3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Button - Save'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Snackbar - Heading'), 'Sukses!', FailureHandling.STOP_ON_FAILURE)