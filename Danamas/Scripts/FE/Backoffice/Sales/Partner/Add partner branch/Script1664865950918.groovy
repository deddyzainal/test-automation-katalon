import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button Tambah Cabang Partner
WebUI.click(findTestObject('FE/Backoffice/Sales/Partner/Detail/Button - Tambah Cabang Partner'))

//Input Nama Cabang Partner
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Input - Nama Cabang Partner'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Input - Nama Cabang Partner'), nama_cabang)

//Input Alamat
WebUI.setText(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Input - Alamat'), alamat)

//Input PIC
WebUI.setText(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Input - Principal'), principal)

//Input No HP
WebUI.setText(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Input - No Handphone'), no_handphone)

//Input Branch Email
WebUI.setText(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Input - Branch Email'), branch_email)

//Click button Tambah
WebUI.scrollToElement(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Button - Tambah Partner Baru'), 3)
WebUI.click(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Button - Tambah Partner Baru'))

//Click button Confirm
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Button - Confirm'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Sales/Partner/Detail/Form Partner Branch/Button - Confirm'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Subheading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Subheading'), 'Berhasil membuat cabang partner baru!', FailureHandling.STOP_ON_FAILURE)