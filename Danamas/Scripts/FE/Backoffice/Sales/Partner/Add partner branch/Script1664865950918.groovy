import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button Tambah Cabang Partner
WebUI.click(findTestObject('FE/Backoffice/Sales/Partner/Detail/Button - Tambah Cabang Partner'))

//Input Nama Cabang Partner
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Input - Nama Cabang Partner'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject(''), null)
