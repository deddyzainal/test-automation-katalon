import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Input Nomor Rekening
WebUI.scrollToElement(findTestObject('FE/LancarWeb/Pencairan/Button - TAMBAH REKENING'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Pencairan/Button - TAMBAH REKENING'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pencairan/Input - Nomor Rekening'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Pencairan/Input - Nomor Rekening'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Pencairan/Input - Nomor Rekening'), noRekening)

// Wait for the Pemegang Akun is validated
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pencairan/Input - Pemegang Akun'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)

// Confirm the account
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pencairan/Button - KONFIRMASI DETAIL (enabled)'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Pencairan/Button - KONFIRMASI DETAIL (enabled)'))

// Verify account confirmed successfully
WebUI.verifyTextPresent(noRekening, false)
WebUI.verifyTextPresent(pemegangAkun, false)