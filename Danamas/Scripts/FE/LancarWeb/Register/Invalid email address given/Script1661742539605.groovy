import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.LancarWeb)

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Link - Daftar sekarang'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Home/Link - Daftar sekarang'))

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'), 'qwerty.1234')

WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Kode Referral'))
WebUI.verifyElementVisible(findTestObject('FE/LancarWeb/Register/Text - Invalid Email Error'))

WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'))
WebUI.clearText(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'), 'qwerty.1234@')

WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Kode Referral'))
WebUI.verifyElementVisible(findTestObject('FE/LancarWeb/Register/Text - Invalid Email Error'))

WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'))
WebUI.clearText(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'), 'qwerty.1234@asd.')

WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Kode Referral'))
WebUI.verifyElementVisible(findTestObject('FE/LancarWeb/Register/Text - Invalid Email Error'))

WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'))
WebUI.clearText(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'), ' qwerty.1234@asd.com')

WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Kode Referral'))
WebUI.verifyElementVisible(findTestObject('FE/LancarWeb/Register/Text - Invalid Email Error'))