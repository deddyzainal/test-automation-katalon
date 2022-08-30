import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Click tab Dokumen Pribadi
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Tab - Dokumen Agunan'))

// Click button Unggah Buku Nikah
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Foto Agunan Depan'))

// Upload Buku Nikah file
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah (popup)'), 3)
WebUI.uploadFile(findTestObject('FE/LancarWeb/Unggah Dokumen/Input - Upload file (popup)'), agunanDepanFilepath)

// Verify file is uploaded
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)'), 5)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)')), "Foto Agunan Tampak Depan", false)

// Proceed with uploaded file
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - SIMPAN (popup)'))

// Verify file is uploaded successfully
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Foto Agunan Depan'), 3)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Foto Agunan Depan')), "1 dokumen telah diunggah", false)