import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil


import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable

//Get new date
String datetime = new Date().format('yyyyMMddHHmmss')

//Get time
String time = datetime.drop(8)

//Set request body
String requestBody = '{"firstname": "Katalon '+datetime+'", "mobile": "+62'+datetime+'", "email": "'+datetime+'@gmail.com", "userType": 1, "adId": null, "password": "Password1", "otpToken": "'+time+'", "referralCode":""}'

//Generate hmac
String hmac = CustomKeywords.'generateHmac.hmac_sha256'('ksdafkjdsahfuaehfsuhuuuauhfakshdkapqwoe', requestBody)

//Send request
def response = WS.sendRequest(findTestObject('BE/Register', [('hmac'):hmac, ('datetime'):datetime, ('requestBody'):requestBody]))

//Verify status code 200
WS.verifyResponseStatusCode(response, 200)

//Set datetime in global variable (if you want to use it in other test case, dont forget to add variable 'datetime' in your Profiles)
GlobalVariable.datetime = datetime