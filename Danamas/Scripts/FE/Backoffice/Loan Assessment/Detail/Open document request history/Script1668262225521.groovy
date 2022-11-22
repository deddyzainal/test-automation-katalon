import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button Menu Lainnya
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Button - Menu Lainnya'))

//Click menu Manual Upload Dokumen
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Menu - Riwayat Request Dokumen'))

WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Riwayat Request Dokumen/Label - Riwayat Request Dokumen'), 3, FailureHandling.STOP_ON_FAILURE)

//Click button Close
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Riwayat Request Dokumen/Button - Close'))


