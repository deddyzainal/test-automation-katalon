import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Click Profile icon
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Logout/icon_akun'), 3)

WebUI.click(findTestObject('FE/PARTNER/Logout/icon_akun'))

// Click KELUAR button
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Logout/agent_profil'), 3)

WebUI.click(findTestObject('FE/PARTNER/Logout/button_Keluar'))

WebUI.click(findTestObject('FE/PARTNER/Logout/button_Keluar2'))

// Verify that MASUK button is visible
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/Selamat datang di Partner App'), 5)

