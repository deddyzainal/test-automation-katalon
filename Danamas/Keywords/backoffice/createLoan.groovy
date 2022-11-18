package backoffice

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.json.JsonSlurper
import internal.GlobalVariable

public class createLoan {

	@Keyword
	def loanPassed() {
		def slurper = new JsonSlurper()

		//Register account
		WebUI.callTestCase(findTestCase('Test Cases/BE/Register account'), null, FailureHandling.STOP_ON_FAILURE)

		//Send request (Login API) and verify response
		def responseLogin = WS.sendRequest(findTestObject('BE/Borrower/Login'))
		WS.verifyResponseStatusCode(responseLogin, 200)
		def responseBodyLogin = slurper.parseText(responseLogin.getResponseBodyContent())
		GlobalVariable.token = responseBodyLogin.data.token.toString()
		GlobalVariable.userId = responseBodyLogin.data.userId.toString()

		//Send request (Occupation API) and verify response
		def responseOccupation = WS.sendRequest(findTestObject('BE/Borrower/Occupation'))
		WS.verifyResponseStatusCode(responseOccupation, 200)

		//Send request (Survery API) and verify response
		def responseSurvey = WS.sendRequest(findTestObject('BE/Borrower/Survey'))
		WS.verifyResponseStatusCode(responseSurvey, 200)

		//Send request (User API) and verify response
		def responseUser = WS.sendRequest(findTestObject('BE/Borrower/Update user'))
		WS.verifyResponseStatusCode(responseUser, 200)

		//Send request (Loan API) and verify response
		def responseLoan = WS.sendRequest(findTestObject('BE/Borrower/Submit loan'))
		WS.verifyResponseStatusCode(responseLoan, 200)
		def responseBodyLoan = slurper.parseText(responseLoan.getResponseBodyContent())
		GlobalVariable.loanNumber = responseBodyLoan.data.loanNumber.toString()
		GlobalVariable.loanId  = responseBodyLoan.data.loanId.toString()

		sleep(30000)
		//Send request (Save document API) and verify response
		//KTP
		def responseKTP = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 1, ('displayName') : '', ('docName') : '', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_KTP3-1666197918289.png']))
		WS.verifyResponseStatusCode(responseKTP, 200)
		//Selfie KTP
		def responseSelfieKTP = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 3, ('displayName') : 'Selfie_KTP1.png', ('docName') : 'Selfie_KTP1.png', ('docUrl') : 'hhttp://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_Selfie_KTP1-1666061966637.png']))
		WS.verifyResponseStatusCode(responseSelfieKTP, 200)
		//Rekening Koran 1
		def responseBank1 = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 57, ('displayName') : 'MutasiBank_Bulan_1', ('docName') : 'MutasiBank_Bulan_1', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_MutasiBank_Bulan_1-1666198196921.png']))
		WS.verifyResponseStatusCode(responseBank1, 200)
		//Rekening Koran 2
		def responseBank2 = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 58, ('displayName') : 'MutasiBank_Bulan_2', ('docName') : 'MutasiBank_Bulan_2', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_MutasiBank_Bulan_2-1666353633268.png']))
		WS.verifyResponseStatusCode(responseBank2, 200)
		//Rekening Koran 3
		def responseBank3 = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 59, ('displayName') : 'MutasiBank_Bulan_3', ('docName') : 'MutasiBank_Bulan_3', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_MutasiBank_Bulan_3-1666353764085.png']))
		WS.verifyResponseStatusCode(responseBank3, 200)
		//Slip Gaji
		def responseSlipGaji = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 14, ('displayName') : 'Slip Gaji', ('docName') : 'Slip Gaji', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_document-1666353867121.png']))
		WS.verifyResponseStatusCode(responseSlipGaji, 200)
		//PBB
		def responsePBB = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 31, ('displayName') : 'PBB Terbaru', ('docName') : 'PBB Terbaru', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_document-1666356654209.png']))
		WS.verifyResponseStatusCode(responsePBB, 200)
		//IMB
		def responseIMB = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 39, ('displayName') : 'IMB (Izin Mendirikan Bangunan)', ('docName') : 'IMB (Izin Mendirikan Bangunan)', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_document-1666357806550.png']))
		WS.verifyResponseStatusCode(responseIMB, 200)
		//Sertifikat Kepemilikan
		def responseSertifikat = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 38, ('displayName') : 'Sertifikat Kepemilikan (SHM/SHGB/SHMSRS)', ('docName') : 'Sertifikat Kepemilikan (SHM/SHGB/SHMSRS)', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_document-1666357880918.png']))
		WS.verifyResponseStatusCode(responseSertifikat, 200)
		//Agunan Tampak Dalam
		def responseAgunanDalam = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 66, ('displayName') : 'Foto Agunan Tampak Dalam', ('docName') : 'Foto Agunan Tampak Dalam', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_document-1666357942614.png']))
		WS.verifyResponseStatusCode(responseAgunanDalam, 200)
		//Agunan Tampak Depan
		def responseAgunanDepan = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 67, ('displayName') : 'Foto Agunan Tampak Depan', ('docName') : 'Foto Agunan Tampak Depan', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_document-1666358073659.png']))
		WS.verifyResponseStatusCode(responseAgunanDepan, 200)
		//Akses Jalan Masuk Agunan
		def responseAksesAgunan = WS.sendRequest(findTestObject('BE/Borrower/Save document', [('docType') : 68, ('displayName') : 'Foto Akses Jalan Masuk ke Agunan', ('docName') : 'Foto Akses Jalan Masuk ke Agunan', ('docUrl') : 'http://sandbox-lancar.oss-ap-southeast-5.aliyuncs.com/doc_document-1666358147154.pngg']))
		WS.verifyResponseStatusCode(responseAksesAgunan, 200)
	}

	@Keyword
	def loanSubmitted() {

		loanPassed()

		//Send request (API verification-schedule) and verify response
		def response = WS.sendRequest(findTestObject('BE/Borrower/Verification-schedule'))
		WS.verifyResponseStatusCode(response, 200)
	}
}
