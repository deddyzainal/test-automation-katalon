import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice/'

//Upload Foto KTP
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Dokumen User/Input - Foto KTP'
        , ('file') : filePath + 'ktp.jpeg'], FailureHandling.STOP_ON_FAILURE)
