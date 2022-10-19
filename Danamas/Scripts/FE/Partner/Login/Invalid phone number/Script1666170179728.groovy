import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.PartnerWeb)

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/Selamat datang di Partner App'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/button_Masuk'))

WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/input_Nomor HP'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/input_Nomor HP'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Login/input_Nomor HP'), '085687833911')

// Click MASUK button
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/input_Kata Sandi'), 3)

WebUI.click(findTestObject('FE/PARTNER/Login/input_Kata Sandi'))

WebUI.setEncryptedText(findTestObject('FE/PARTNER/Login/input_Kata Sandi'), GlobalVariable.password)

// Click MASUK button
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/button_MasukLogin'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/button_MasukLogin'))

// Verify wrong password error message is displayed
WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Login/Anda gagal masuk ke akun'), 0)

WebUI.verifyTextPresent('Anda gagal masuk ke akun', false)

WebUI.click(findTestObject('FE/PARTNER/Login/button_Coba lagi'))

WebUI.closeBrowser()

