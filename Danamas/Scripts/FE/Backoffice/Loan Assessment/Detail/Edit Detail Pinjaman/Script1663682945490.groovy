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
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Add Pinjaman Take Over'), [('nama_bank') : 'Bank Jago'
        , ('jenis_fasilitas') : 'Trade Receipt', ('original_plafon') : '1000000', ('secure_type') : 'Secured', ('outstanding_pinjaman') : '2000000'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Add Pinjaman Take Over'), [('nama_bank') : 'Bank Sinarmas'
        , ('jenis_fasilitas') : 'Trade Receipt', ('original_plafon') : '3000000', ('secure_type') : 'Unsecured', ('outstanding_pinjaman') : '4000000'], 
    FailureHandling.STOP_ON_FAILURE)

//Add kewajiban hutang
WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Add Kewajiban Hutang Bulanan'), [('nama_lembaga_keuangan') : 'Bank Xxx'
        , ('cicilan_perbulan') : '100000', ('original_plafon') : '2000000', ('secure_type') : 'Secured', ('outstanding_pinjaman') : '30000'
        , ('jenis_fasilitas') : 'Trade Receipt', ('tenor_pinjaman') : '40'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Loan Assessment/Detail/Add Kewajiban Hutang Bulanan'), [('nama_lembaga_keuangan') : 'Bank Yyy'
        , ('cicilan_perbulan') : '500000', ('original_plafon') : '6000000', ('secure_type') : 'Unsecured', ('outstanding_pinjaman') : '70000'
        , ('jenis_fasilitas') : 'Trade Receipt', ('tenor_pinjaman') : '80'], FailureHandling.STOP_ON_FAILURE)

//Click button Save
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Button - Save'), 3)
WebUI.delay(3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Button - Save'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)