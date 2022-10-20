import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable
import groovy.json.JsonSlurper

//Send request
def response = WS.sendRequest(findTestObject('BE/Lancar/Loan', [('token') : token, ('userId') : userId, ('datetime') : datetime]))

//Verify status code 200
WS.verifyResponseStatusCode(response, 200)

def slurper = new JsonSlurper()
def responseBody = slurper.parseText(response.getResponseBodyContent())

String loanNumber = responseBody.data.loanNumber.toString()

GlobalVariable.loanNumber = loanNumber