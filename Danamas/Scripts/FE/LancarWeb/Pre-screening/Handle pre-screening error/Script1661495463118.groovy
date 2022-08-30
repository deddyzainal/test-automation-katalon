import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.verifyElementPresent(findTestObject('FE/LancarWeb/Pre-screening/Text - Pre-screening error'), 40)
WebUI.click(findTestObject('FE/LancarWeb/Pre-screening/Button - PROSES'))

WebUI.scrollToElement(findTestObject('FE/LancarWeb/Home/Button - Lanjutkan Pengajuan'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Home/Button - Lanjutkan Pengajuan'))