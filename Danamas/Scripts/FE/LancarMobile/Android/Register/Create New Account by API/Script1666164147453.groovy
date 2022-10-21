import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable as GlobalVariable

String time = GlobalVariable.datetime.drop(8)

//Set request body
String requestBody = '{"firstname": "Katalon '+ GlobalVariable.datetime +'", "mobile": "+62'+ GlobalVariable.datetime +'", "email": "'+ GlobalVariable.datetime +'@gmail.com", "userType": 1, "adId": null, "password": "Password1", "otpToken": "'+ time +'", "referralCode":""}'

//Generate hmac
String hmac = CustomKeywords.'generateHmac.hmac_sha256'('ksdafkjdsahfuaehfsuhuuuauhfakshdkapqwoe', requestBody)

//Send request
def response = WS.sendRequest(findTestObject('BE/Borrower/Register', [('hmac') : hmac, ('datetime') : GlobalVariable.datetime, ('requestBody') : requestBody]))

//Verify status code 200
WS.verifyResponseStatusCode(response, 200)