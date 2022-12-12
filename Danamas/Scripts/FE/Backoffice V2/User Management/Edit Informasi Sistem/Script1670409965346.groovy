import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Cick tab Informasi Sistem
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Tab - Informasi Sistem'), FailureHandling.STOP_ON_FAILURE)

//Input Created Date
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Sistem/Input - Created Date'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Sistem/Input - Created Date'), created_date, FailureHandling.STOP_ON_FAILURE)

//Input Created By
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Sistem/Input - Created Bye'), created_by, FailureHandling.STOP_ON_FAILURE)

//Input Last Update
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Sistem/Input - Last Update'), last_update, FailureHandling.STOP_ON_FAILURE)

//Input Last Update By
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Sistem/Input - Last Update By'), last_update_by, FailureHandling.STOP_ON_FAILURE)\

//Input Digi Sign Verified Date
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Informasi Sistem/Input - Digi Sign Verified Date'), digi_sign_verified_date, FailureHandling.STOP_ON_FAILURE)