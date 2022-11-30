import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice/'

//Upload Foto KTP
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Dokumen User/Input - Foto KTP'
        , ('file') : filePath + 'pbb.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Foto Akses Jalan Masuk ke Agunan
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Akses Jalan Masuk ke Agunan'
        , ('file') : filePath + 'akses_jalan_masuk.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Foto Sertifikat Kepemilikan
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Sertifikat Kepemilikan'
        , ('file') : filePath + 'sertifikat_kepemilikan.jpg'], FailureHandling.STOP_ON_FAILURE)

//Upload Foto IMB
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto IMB'
        , ('file') : filePath + 'imb.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Foto Agunan Tampak Dalam
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Agunan Tampak Dalam'
        , ('file') : filePath + 'tampak_dalam.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Foto Agunan Tampak Depan
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Dokumen Agunan/Input - Foto Agunan Tampak Depan'
        , ('file') : filePath + 'tampak_depan.jpeg'], FailureHandling.STOP_ON_FAILURE)
