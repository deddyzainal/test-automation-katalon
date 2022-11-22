import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Loan Type'), null, FailureHandling.STOP_ON_FAILURE)

String datetime = new Date().format('yyMMddHHmmss')
String kode = datetime.drop(9)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Type/Add new loan type'), [('jenis_pinjaman') : 'Loan Type ' + datetime, ('kode_pinjaman') : kode], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Type/Edit loan type - from list'), [('jenis_pinjaman') : 'Loan Type ' + datetime, ('kode_pinjaman') : kode], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Type/Open loan type detail'), [('jenis_pinjaman') : 'Loan Type ' + datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Type/Edit loan type - from detail'), [('jenis_pinjaman') : 'Loan Type ' + datetime, ('kode_pinjaman') : kode], FailureHandling.STOP_ON_FAILURE)
