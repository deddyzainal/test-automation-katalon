import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pencairan/Button - TAMBAH REKENING'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Pencairan/Button - TAMBAH REKENING'))

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pencairan/Input - Nomor Rekening'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Pencairan/Input - Nomor Rekening'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Pencairan/Input - Nomor Rekening'), noRekening)

WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pencairan/Button - KONFIRMASI DETAIL (enabled)'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Pencairan/Button - KONFIRMASI DETAIL (enabled)'))

WebUI.verifyTextPresent(noRekening, false)
WebUI.verifyTextPresent(pemegangAkun, false)