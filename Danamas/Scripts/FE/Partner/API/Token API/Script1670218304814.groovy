import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

def response = WS.sendRequest(findTestObject('BE/Backoffice/Login Backoffice'))

WS.verifyResponseStatusCode(response, 200)

def slurper = new JsonSlurper()
def responseBodyLogin = slurper.parseText(response.getResponseBodyContent())
println(responseBodyLogin)
GlobalVariable.token = responseBodyLogin.data.session.toString()
println(GlobalVariable.token)