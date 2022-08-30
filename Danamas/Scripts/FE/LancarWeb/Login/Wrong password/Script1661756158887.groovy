import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.LancarWeb)

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Open Login page
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Button - Masuk'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Home/Button - Masuk'))

// Input Nomor Telepon
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Input - Nomor Telepon'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Login/Input - Nomor Telepon'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Login/Input - Nomor Telepon'), '20220829090010')

// Click MASUK button
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'))

//Input Password
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Input - Password'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Login/Input - Password'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Login/Input - Password'), 'Qwerty123')

// Click MASUK button
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'))

// Verify wrong password error message is displayed
WebUI.waitForElementNotPresent(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'), 10)
WebUI.verifyTextPresent("Kata sandi yang Anda masukkan salah", false)