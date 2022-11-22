import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button Menu Lainnya
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Button - Menu Lainnya'))

//Click menu Manual Upload Dokumen
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Menu - Manual Upload Dokumen'))
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Manual Upload/Button - Upload'), 2, FailureHandling.STOP_ON_FAILURE)

//Upload file
String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice/'

WebUI.waitForElementClickable(findTestObject('FE/Backoffice/Loan Assessment/Detail/Manual Upload/Input - File'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.uploadFile(findTestObject('FE/Backoffice/Loan Assessment/Detail/Manual Upload/Input - File'), filePath + doc_name, FailureHandling.STOP_ON_FAILURE)
	
WebUI.delay(3)

//Click button Upload
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Manual Upload/Button - Upload'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)

//Verify uploaded document is shown in folder Dokumen Tambahan
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Open folder Dokumen Tambahan'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Dokumen Tambahan/TextValue - Nama Dokumen'), 'Additional - ' + doc_name, FailureHandling.STOP_ON_FAILURE)