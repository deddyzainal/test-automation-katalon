import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Click tab Dokumen Pribadi
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Tab - Dokumen Agunan'))

// Click button Unggah Buku Nikah
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Foto Akses Jalan'))

// Upload Buku Nikah file
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah (popup)'), 3)
WebUI.uploadFile(findTestObject('FE/LancarWeb/Unggah Dokumen/Input - Upload file (popup)'), aksesJalanFilepath)

// Verify file is uploaded
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)'), 5)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/TextValue - Top file name (popup)')), "Foto Akses Jalan Masuk ke Agunan", false)

// Proceed with uploaded file
WebUI.click(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - SIMPAN (popup)'))

// Verify file is uploaded successfully
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Foto Akses Jalan'), 3)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/LancarWeb/Unggah Dokumen/Button - Unggah Foto Akses Jalan')), "1 dokumen telah diunggah", false)