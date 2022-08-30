import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

// Open Lancar Web
WebUI.navigateToUrl(GlobalVariable.LancarWeb)
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Open received offer letter
WebUI.scrollToElement(findTestObject('FE/LancarWeb/Home/Button - Lanjutkan Pengajuan'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Home/Button - Lanjutkan Pengajuan'))

// Reject offer letter
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pencairan/Text - HUBUNGI TIM LANCAR'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Pencairan/Text - HUBUNGI TIM LANCAR'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pencairan/Button - YA, AJUKAN PERUBAHAN'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Pencairan/Button - YA, AJUKAN PERUBAHAN'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pencairan/Text - Rejection sent message'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Pencairan/Button - MENGERTI'))