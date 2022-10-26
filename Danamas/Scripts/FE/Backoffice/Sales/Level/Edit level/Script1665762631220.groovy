import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button Ubah Informasi
WebUI.click(findTestObject('FE/Backoffice/Sales/Level/Detail/Button - Ubah Informasi'))

//Input Nama Level
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Level/Form/Input - Nama Level'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice/Sales/Level/Form/Input - Nama Level'), nama_level)

////Input Jumlah Poin Minimal
//WebUI.setText(findTestObject('FE/Backoffice/Sales/Level/Form/Input - Poin Minimal'), min_point.toString())
//
////Input Jumlah Poin Maksimal
//WebUI.setText(findTestObject('FE/Backoffice/Sales/Level/Form/Input - Poin Maksimal'), max_point.toString())

//Upload file icon
String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice/'
WebUI.uploadFile(findTestObject('FE/Backoffice/Sales/Level/Form/Input - Badge Icon'), filePath + 'level.jpeg')

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Sales/Level/Form/Button - Simpan'))

//Click button Confirm on confirmation dialog
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Sales/Level/Form/Button - Confirm'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Sales/Level/Form/Button - Confirm'))

//Verify success dialog is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Informasi Level berhasil diubah', FailureHandling.STOP_ON_FAILURE)