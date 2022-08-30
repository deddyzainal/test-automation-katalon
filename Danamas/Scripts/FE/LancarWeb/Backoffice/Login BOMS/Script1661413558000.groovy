import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Login with BOMS credentials
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Input - Email'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Input - Email'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Input - Email'), emailBOMS)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Input - Password'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Input - Password'), passwordBOMS)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Button - Login'))