import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Click tab Dokumen Finansial
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Tab - Dokumen Finansial'))

// Click button Unggah Slip Gaji
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Slip Gaji'))

// Upload first Slip Gaji file
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah (popup)'), 3)
WebUI.uploadFile(findTestObject('FE/LancarWeb/Unggah Dokumen/Input - Upload file (popup)'), slipGajiFilepath)

// Verify first file is uploaded
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)'), 5)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)')), "Slip Gaji", false)

// Upload second Slip Gaji file
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah (popup)'), 3)
WebUI.uploadFile(findTestObject('FE/LancarWeb/Unggah Dokumen/Input - Upload file (popup)'), slipGajiFilepath)

// Verify second file is uploaded
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Second file name (popup)'), 5)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Second file name (popup)')), "Slip Gaji", false)

// Upload third Slip Gaji file
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah (popup)'), 3)
WebUI.uploadFile(findTestObject('FE/LancarWeb/Unggah Dokumen/Input - Upload file (popup)'), slipGajiFilepath)

// Verify third file is uploaded
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Third file name (popup)'), 5)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Third file name (popup)')), "Slip Gaji", false)

// Proceed with uploaded file
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - SIMPAN (popup)'))

// Verify file is uploaded successfully
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Slip Gaji'), 3)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Slip Gaji')), "3 dokumen telah diunggah", false)