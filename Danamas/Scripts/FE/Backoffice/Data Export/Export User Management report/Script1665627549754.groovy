import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Call test case Data Export with Tipe Dokumen = 'User Management' and file name = 'User_Management_Report_V1_'
WebUI.callTestCase(findTestCase('FE/Backoffice/Data Export/Data export'), [('tipe_dokumen') : 'User Management', ('file_name') : 'User_Management_Report_V1_'
        , ('from_month') : from_month, ('from_year') : from_year, ('from_date') : from_date, ('to_month') : to_month, ('to_year') : to_year
        , ('to_date') : to_date], FailureHandling.STOP_ON_FAILURE)

