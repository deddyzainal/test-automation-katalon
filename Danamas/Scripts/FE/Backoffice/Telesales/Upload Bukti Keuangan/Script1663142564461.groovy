import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice/'

//Upload Foto Rekening Koran Operasional
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Rekening Koran Operasional'
        , ('file') : filePath + 'rek_koran_operasional.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Bukti Transaksi Usaha
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Bukti Transaksi Usaha'
        , ('file') : filePath + 'bukti_transaksi_usaha.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Izin Usaha
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Izin Usaha'
        , ('file') : filePath + 'izin_usaha.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Foto Tempat Usaha
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Tempat Usaha'
        , ('file') : filePath + 'tempat_usaha.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Foto Selfie dengan Tempat Usaha
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Selfie dengan Tempat Usaha'
        , ('file') : filePath + 'selfie_tempat_usaha.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Slip Gaji
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Slip Gaji'
        , ('file') : filePath + 'slip_gaji.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Rekening Koran Payroll
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Rekening Koran Payroll'
        , ('file') : filePath + 'rek_koran_payroll.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Foto Selfie ditempat Kerja
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Foto Selfie ditempat Kerja'
        , ('file') : filePath + 'selfie.jpeg'], FailureHandling.STOP_ON_FAILURE)

//Upload Surat Keterangan Kerja
WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Upload file'), [('object') : 'FE/Backoffice/Telesales/Edit/Bukti Keuangan/Input - Surat Keterangan Kerja'
        , ('file') : filePath + 'surat_keterangan_kerja.jpeg'], FailureHandling.STOP_ON_FAILURE)
