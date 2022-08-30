import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



// Click Profile icon
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Icon - Profile'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Home/Icon - Profile'))

// Click KELUAR button
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Button - KELUAR'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Home/Button - KELUAR'))

// Verify that MASUK button is visible
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Button - Masuk'), 5)