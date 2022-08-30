import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.LancarWeb)

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Link - Daftar sekarang'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Home/Link - Daftar sekarang'))

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Register/Input - Nama'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Nama'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Nama'), 'Bu')

WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'))
WebUI.verifyElementVisible(findTestObject('FE/LancarWeb/Register/Text - Invalid Name Error'))