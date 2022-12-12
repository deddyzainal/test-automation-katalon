import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button Buat Pinjaman Baru
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/List/Button - Buat Pinjaman Baru'), FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Tipe Pinjaman'), 3, FailureHandling.STOP_ON_FAILURE)

//Select Tipe Pinjaman
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Tipe Pinjaman'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Option', [('option') : tipe_pinjaman]), FailureHandling.STOP_ON_FAILURE)

//Input Nama Peminjam and select from the list
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Nama Peminjam'), nama_peminjam, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Option', [('option') : nama_peminjam]), FailureHandling.STOP_ON_FAILURE)

//Input Jumlah Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Jumlah Pinjaman'), jumlah_pinjaman, FailureHandling.STOP_ON_FAILURE)

//Input Tanggal Terakhir Didanai
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Datepicker - Tanggal Terakhir Didanai'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Date - Today'), FailureHandling.STOP_ON_FAILURE)

//Input Tanggal Pencairan Didanai
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Datepicker - Tanggal Pencairan Didanai'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Date - Today'), FailureHandling.STOP_ON_FAILURE)

//Input Jumlah Pendanaan Minimal
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Jumlah Pendanaan Minimal'), jumlah_pendanaan_minimal, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Jumlah Pendanaan Minimal'), 3, FailureHandling.STOP_ON_FAILURE)

//Input Bunga Peminjam
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Bunga Peminjam'), bunga_peminjam, FailureHandling.STOP_ON_FAILURE)

//Input Bunga Lender
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Bunga Lender'), bunga_lender, FailureHandling.STOP_ON_FAILURE)

//Input Tenor Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Tenor Pinjaman'), tenor_pinjaman, FailureHandling.STOP_ON_FAILURE)

//Input Jumlah Pencairan
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Jumlah Pencairan'), jumlah_pencairan, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Jumlah Pencairan'), 3, FailureHandling.STOP_ON_FAILURE)

//Select Jadwal Pembayaran
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Jadwal Pembayaran'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Option', [('option') : jadwal_pembayaran]), FailureHandling.STOP_ON_FAILURE)

//Select Cakupan Masa Tenggang
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Cakupan Masa Tenggang'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Option', [('option') : cakupan_masa_tenggang]), FailureHandling.STOP_ON_FAILURE)

//Input Masa Tenggang Pembayaran
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Masa Tenggang Pembayaran'), masa_tenggang_pembayaran, FailureHandling.STOP_ON_FAILURE)

//Input Biaya Admin
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Biaya Admin'), biaya_admin, FailureHandling.STOP_ON_FAILURE)

//Input Biaya Provision
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Biaya Provision'), biaya_provision, FailureHandling.STOP_ON_FAILURE)

//Input Biaya Asuransi
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Biaya Asuransi'), biaya_asuransi, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Biaya Asuransi'), 3, FailureHandling.STOP_ON_FAILURE)

//Select Perusahaan Penjamin
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Perusahaan Penjamin'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Option', [('option') : perusahaan_penjamin]), FailureHandling.STOP_ON_FAILURE)

//Select Dibayar Oleh
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Dibayar Oleh'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Option', [('option') : dibayar_oleh]), FailureHandling.STOP_ON_FAILURE)

//Input Denda Lender
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Denda Lender'), denda_lender, FailureHandling.STOP_ON_FAILURE)

//Input Masa Tenggang Penalti Lender
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Masa Tenggang Penalti Lender'), masa_tenggang_penalti_lender, FailureHandling.STOP_ON_FAILURE)

//Input Denda Peminjam
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Denda Peminjam'), denda_peminjam, FailureHandling.STOP_ON_FAILURE)

//Input Masa Tenggang Pinalti Borrower
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Masa Tenggang Pinalti Borrower'), masa_tenggang_penalti_borrower, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Masa Tenggang Pinalti Borrower'), 3, FailureHandling.STOP_ON_FAILURE)

//Input Keamanan Pembayaran
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Keamanan Pembayaran'), keamanan_pembayaran, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Button - Add'), FailureHandling.STOP_ON_FAILURE)

//Select Tipe Pengajuan
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Tipe Pengajuan'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Select - Option', [('option') : tipe_pengajuan]), FailureHandling.STOP_ON_FAILURE)

String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice V2/'

//Upload Factsheet Lender
WebUI.uploadFile(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Factsheet Lender'), filePath + 'factsheet_lender.jpeg', FailureHandling.STOP_ON_FAILURE)

//Upload Factsheet Borrower
WebUI.uploadFile(findTestObject('FE/Backoffice V2/Loan Origination/Form/Input - Factsheet Borrower'), filePath + 'factsheet_borrower.jpeg', FailureHandling.STOP_ON_FAILURE)

//Click button Submit
WebUI.click(findTestObject('FE/Backoffice V2/Loan Origination/Form/Button - Submit'), FailureHandling.STOP_ON_FAILURE)

//Verify data added to the list
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/Loan Origination/List/TextValue - Nama User'), nama_peminjam, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/Loan Origination/List/TextValue - Tipe Pinjaman'), tipe_pinjaman, FailureHandling.STOP_ON_FAILURE)

