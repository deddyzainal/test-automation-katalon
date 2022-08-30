import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Click icon unggah KTP
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Button - Upload KTP'), 8)

WebUI.click(findTestObject('FE/LancarWeb/Upload KTP/Button - Upload KTP'))

// Upload KTP image already populated by Tongdun
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Video - Preview Ambil Gambar'), 10)

WebUI.uploadFile(findTestObject('FE/LancarWeb/Upload KTP/Input - Image'), populatedKTP)

// Handle if server error appears after submitting image
if (WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Button - Dismiss Upload Error Popup'), 3)) {
    WebUI.click(findTestObject('FE/LancarWeb/Upload KTP/Button - Dismiss Error Popup'))
}

// Verify KTP picture uploaded
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Icon - KTP Uploaded'), 5)
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()