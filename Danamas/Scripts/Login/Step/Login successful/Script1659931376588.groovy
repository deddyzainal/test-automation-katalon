import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


WebUI.openBrowser(GlobalVariable.LancarWeb)

CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Button - Masuk'), 10)

WebUI.click(findTestObject('FE/LancarWeb/Home/Button - Masuk'))

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Input - Nomor Telepon'), 5)

WebUI.sendKeys(findTestObject('FE/LancarWeb/Login/Input - Nomor Telepon'), NomorTelepon)

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'), 3)

WebUI.click(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'))

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Input - Password'), 3)

WebUI.sendKeys(findTestObject('FE/LancarWeb/Login/Input - Password'), "Password1")

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'), 3)

WebUI.click(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'))

WebUI.closeBrowser()