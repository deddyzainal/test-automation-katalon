import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Click Upload Selfie dengan KTP
WebUI.waitForElementNotVisible(findTestObject('FE/LancarWeb/Upload KTP/Button - Upload Selfie dengan KTP'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Upload KTP/Button - Upload Selfie dengan KTP'))
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Upload file
WebUI.waitForElementNotVisible(findTestObject('FE/LancarWeb/Upload KTP/Button - Ambil Gambar'), 10)
WebUI.uploadFile(findTestObject('FE/LancarWeb/Upload KTP/Input - Image'), pictureFilepath)
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Button - Unggah Sekarang'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Upload KTP/Button - Unggah Sekarang'))

// Verify Selfie picture uploaded
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Icon - Selfie dengan KTP Uploaded'), 5)