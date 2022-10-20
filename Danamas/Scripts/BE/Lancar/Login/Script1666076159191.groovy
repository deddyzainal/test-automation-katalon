import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable

//Send request
def response = WS.sendRequest(findTestObject('BE/Lancar/Login', [('recipient') : datetime, ('password') : 'Password1']))

//Verify status code 200
WS.verifyResponseStatusCode(response, 200)

def slurper = new JsonSlurper()
def responseBody = slurper.parseText(response.getResponseBodyContent())

String token = responseBody.data.token.toString()
String userId = responseBody.data.userId.toString()

GlobalVariable.token = token
GlobalVariable.userId = userId