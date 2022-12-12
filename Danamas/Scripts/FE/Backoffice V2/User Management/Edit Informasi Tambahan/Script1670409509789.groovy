import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Cick tab Informasi Tambahan
WebUI.scrollToPosition(0, 30, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Tab - Informasi Tambahan'), FailureHandling.STOP_ON_FAILURE)

//Select Position
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Position'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Position'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Option', [('option') : position]), FailureHandling.STOP_ON_FAILURE)

//Select Pendidikan Terakhir
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Pendidikan Terakhir'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Option', [('option') : pendidikan_terakhir]), FailureHandling.STOP_ON_FAILURE)

//Select Pekerjaan
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Pekerjaan'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Option', [('option') : pekerjaan]), FailureHandling.STOP_ON_FAILURE)

//Select Source Of Income
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Source Of Income'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Option', [('option') : source_of_income]), FailureHandling.STOP_ON_FAILURE)

//Select Monthly Income
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Monthly Income'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Tambahan/Select - Option', [('option') : monthly_income]), FailureHandling.STOP_ON_FAILURE)