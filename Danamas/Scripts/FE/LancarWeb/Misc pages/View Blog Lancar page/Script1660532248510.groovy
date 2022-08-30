import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Click link Blog in header
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Link - Blog (Header)'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Home/Link - Blog (Header)'))

// Verify Blog Lancar page is opened
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Misc pages/Text - Artikel Menarik title'), 10)

// Return to Home, then click link Blog Lancar in footer
WebUI.back()
WebUI.scrollToElement(findTestObject('FE/LancarWeb/Home/Link - Blog Lancar (Footer)'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Home/Link - Blog Lancar (Footer)'))

// Verify Blog Lancar page is opened
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Misc pages/Text - Artikel Menarik title'), 10)