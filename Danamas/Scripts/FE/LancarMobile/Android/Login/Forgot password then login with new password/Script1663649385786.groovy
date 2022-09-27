import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('BE/Register account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Login/Create new password'), [('newPassword') : newPassword], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/LancarMobile/Android/Login/Login with credential'), [('phoneNumber') : GlobalVariable.datetime
        , ('password') : newPassword], FailureHandling.STOP_ON_FAILURE)