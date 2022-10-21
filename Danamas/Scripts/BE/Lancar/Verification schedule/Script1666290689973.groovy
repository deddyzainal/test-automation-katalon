import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable

//Send request
def response = WS.sendRequest(findTestObject('BE/Lancar/Verification-schedule', [('token') : GlobalVariable.token, ('loanId') : GlobalVariable.loanId
            , ('datetime') : GlobalVariable.datetime]))

//Verify status code 200
WS.verifyResponseStatusCode(response, 200)

