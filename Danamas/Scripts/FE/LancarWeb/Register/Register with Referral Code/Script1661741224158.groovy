import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

String timestamp = new Date().format('yyyyMMddHHmmss')

// Open Lancar web
WebUI.openBrowser(GlobalVariable.LancarWeb)
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Open Register page
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Link - Daftar sekarang'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Home/Link - Daftar sekarang'))
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Input name
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Register/Input - Nama'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Nama'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Nama'), name)

// Input phone number
WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Nomor Telepon'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Nomor Telepon'), timestamp)

// Input email
WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Alamat Email'), timestamp + "@mailinator.com")

// Input Referral Code
WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Kode Referral'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Kode Referral'), referralCode)

// Input password
WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Kata Sandi (masked)'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Kata Sandi (masked)'), password)

// Input password confirmation
WebUI.click(findTestObject('FE/LancarWeb/Register/Input - Konfirmasi Kata Sandi (masked)'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Register/Input - Konfirmasi Kata Sandi (masked)'), password)

// Submit registration
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Register/Button - DAFTAR (enabled)'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Register/Button - DAFTAR (enabled)'))

// Verify OTP pop-up is displayed
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Input - OTP'), 3)