import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Login
//WebUI.callTestCase(findTestCase('FE/Backoffice V2/Login/Login with valid credential'), null, FailureHandling.STOP_ON_FAILURE)

//Click menu Loan Type
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Side Menu/Click menu Loan Type'), null, FailureHandling.STOP_ON_FAILURE)

//Generate random string for Loan Type Code and set loan name
def generator = { String alphabet, int n ->
	new Random().with {
	  (1..n).collect { alphabet[ nextInt( alphabet.length() ) ] }.join()
	}
  }
String code = generator( (('A'..'Z')).join(), 3 )
String loan_name = 'LoanType ' + new Date().format('yyMMddHHmm')

//Add new loan type
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Type/Add loan type'), [('kode_pinjaman') : code, ('nama_jenis_pinjaman') : loan_name], FailureHandling.STOP_ON_FAILURE)

//Edit loan type
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Type/Edit loan type'), [('nama_jenis_pinjaman') : loan_name], FailureHandling.STOP_ON_FAILURE)

//Delete loan type
WebUI.callTestCase(findTestCase('FE/Backoffice V2/Loan Type/Delete loan type'), [('nama_pinjaman') : loan_name], FailureHandling.STOP_ON_FAILURE)


 