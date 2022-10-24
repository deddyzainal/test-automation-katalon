import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.PartnerWeb)

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Open Login page
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/Selamat datang di Partner App'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/button_Masuk'))

// Input Nomor Telepon
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/input_Nomor HP'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/input_Nomor HP'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Login/input_Nomor HP'), nomorhp)

// Click MASUK button
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/input_Kata Sandi'), 3)

WebUI.click(findTestObject('FE/PARTNER/Login/input_Kata Sandi'))

WebUI.setEncryptedText(findTestObject('FE/PARTNER/Login/input_Kata Sandi'), katasandi)

// Click MASUK button
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/button_MasukLogin'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/button_MasukLogin'))

//WebUI.verifyElementPresent(findTestObject('FE/PARTNER/Login/Hi, nama'), 2)

