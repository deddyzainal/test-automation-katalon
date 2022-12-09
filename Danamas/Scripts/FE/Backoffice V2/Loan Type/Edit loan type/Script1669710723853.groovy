import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//WebUI.callTestCase(findTestCase('FE/Backoffice V2/Login/Login with valid credential'), null, FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase('FE/Backoffice V2/Side Menu/Click menu Loan Type'), null, FailureHandling.STOP_ON_FAILURE)

//Click button Ubah
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/List/Button - Ubah', [('loan_name') : nama_jenis_pinjaman]), FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Nama Jenis Pinjaman'), 3, FailureHandling.STOP_ON_FAILURE)

//Input Nama Jenis Pinjaman
//WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Nama Jenis Pinjaman'), nama_jenis_pinjaman, FailureHandling.STOP_ON_FAILURE)

//Select Status
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Status'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : status]), FailureHandling.STOP_ON_FAILURE)

////Input Kode Pinjaman 
//WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Kode Pinjaman'), kode_pinjaman, FailureHandling.STOP_ON_FAILURE)

//Input Jumlah Pokok Pinjaman Minimum
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Jumlah Pokok Pinjaman Minimum'), jumlah_pinjaman_minimum, FailureHandling.STOP_ON_FAILURE)

//Input Jumlah Pokok Pinjaman Default
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Jumlah Pokok Pinjaman Default'), jumlah_pinjaman_default, FailureHandling.STOP_ON_FAILURE)

//Input Jumlah Pokok Pinjaman Maksimum
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Jumlah Pokok Pinjaman Maksimum'), jumlah_pinjaman_maksimum, FailureHandling.STOP_ON_FAILURE)

//Select Nilai
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Nilai'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : nilai]), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Nilai'), 3, FailureHandling.STOP_ON_FAILURE)

//Input Jumlah Pendanaan Minimum
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Jumlah Pendanaan Minimum'), jumlah_pendanaan_minimum, FailureHandling.STOP_ON_FAILURE)

//Input Jumlah Pendanaan Default
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Jumlah Pendanaan Default'), jumlah_pendanaan_default, FailureHandling.STOP_ON_FAILURE)

//Input Jumlah Pendanaan Maksimum
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Jumlah Pendanaan Maksimum'), jumlah_pendanaan_maksimum, FailureHandling.STOP_ON_FAILURE)

//Select Metode Bunga Pinjaman
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Metode Bunga Pinjaman'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : metode_bunga_pinjaman]), FailureHandling.STOP_ON_FAILURE)

//Select Periode Bunga Pinjaman
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Periode Bunga Pinjaman'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : periode_bunga_pinjaman]), FailureHandling.STOP_ON_FAILURE)

//Input Minimum Bunga Peminjam
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Minimum Bunga Peminjam'), bunga_peminjam_minimum, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Minimum Bunga Peminjam'), 3, FailureHandling.STOP_ON_FAILURE)

//Input Default Bunga Peminjam
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Default Bunga Peminjam'), bunga_peminjam_default, FailureHandling.STOP_ON_FAILURE)

//Input Maksimum Bunga Peminjam
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Bunga Peminjam'), bunga_peminjam_maksimum, FailureHandling.STOP_ON_FAILURE)

//Select Bagaimana Bunga Peminjam Harus Dibebankan
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Bunga Peminjam Dibebankan'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : bunga_peminjam_dibebankan]), FailureHandling.STOP_ON_FAILURE)

//Input Minimum Bunga Pemberi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Minimum Bunga Pemberi Pinjaman'), bunga_lender_minimum, FailureHandling.STOP_ON_FAILURE)

//Input Default Bunga Pemberi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Default Bunga Pemberi Pinjaman'), bunga_lender_default, FailureHandling.STOP_ON_FAILURE)

//Input Maksimum Bunga Pemberi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Bunga Pemberi Pinjaman'), bunga_lender_maksimum, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Bunga Pemberi Pinjaman'), 3, FailureHandling.STOP_ON_FAILURE)

//Select Periode Durasi Pinjaman
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Periode Durasi Pinjaman'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : periode_durasi_pinjaman]), FailureHandling.STOP_ON_FAILURE)

//Input Minimum Durasi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Minimum Durasi Pinjaman'), durasi_pinjaman_minimum, FailureHandling.STOP_ON_FAILURE)

//Input Default Durasi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Default Durasi Pinjaman'), durasi_pinjaman_default, FailureHandling.STOP_ON_FAILURE)

//Input Maksimum Durasi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Durasi Pinjaman'), durasi_pinjaman_maksimum, FailureHandling.STOP_ON_FAILURE)

//Select Jadwal Pencairan
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Jadwal Pencairan'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : jadwal_pencairan]), FailureHandling.STOP_ON_FAILURE)

//Input Minimum Pencairan Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Minimum Pencairan Pinjaman'), pencairan_pinjaman_minimum, FailureHandling.STOP_ON_FAILURE)

//Input Default Pencairan Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Default Pencairan Pinjaman'), pencairan_pinjaman_default, FailureHandling.STOP_ON_FAILURE)

//Input Maksimum Pencairan Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Pencairan Pinjaman'), pencairan_pinjaman_maksimum, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Pencairan Pinjaman'), 3, FailureHandling.STOP_ON_FAILURE)

//Select Jadwal Pembayaran
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Jadwal Pembayaran'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : jadwal_pembayaran]), FailureHandling.STOP_ON_FAILURE)

//Input Minimum Pembayaran Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Minimum Pembayaran Pinjaman'), pembayaran_pinjaman_minimum, FailureHandling.STOP_ON_FAILURE)

//Input Default Pembayaran Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Default Pembayaran Pinjaman'), pembayaran_pinjaman_default, FailureHandling.STOP_ON_FAILURE)

//Input Maksimum Pembayaran Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Pembayaran Pinjaman'), pembayaran_pinjaman_maksimum, FailureHandling.STOP_ON_FAILURE)

//Select Masa Tenggang Pembayaran
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Masa Tenggang Pembayaran'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : masa_tenggang_pembayaran]), FailureHandling.STOP_ON_FAILURE)

//Select Cakupan Masa Tenggang Pembayaran
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Cakupan Masa Tenggang Pembayaran'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : cakupan_masa_tenggang_pembayaran]), FailureHandling.STOP_ON_FAILURE)

//Input Minimum Masa Tenggang
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Minimum Masa Tenggang'), masa_tenggang_minimum, FailureHandling.STOP_ON_FAILURE)

//Input Default Masa Tenggang
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Default Masa Tenggang'), masa_tenggang_default, FailureHandling.STOP_ON_FAILURE)

//Input Maksimum Masa Tenggang
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Masa Tenggang'), masa_tenggang_maksimum, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Masa Tenggang'), 3, FailureHandling.STOP_ON_FAILURE)

//Select option Biaya Admin
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Radio - Biaya Admin', [('option') : biaya_admin]), FailureHandling.STOP_ON_FAILURE)

//Input Minimum Biaya Admin
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Minimum Biaya Admin'), biaya_admin_minimum, FailureHandling.STOP_ON_FAILURE)

//Input Default Biaya Admin
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Default Biaya Admin'), biaya_admin_default, FailureHandling.STOP_ON_FAILURE)

//Input Maksimum Biaya Admin
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Biaya Admin'), biaya_admin_maksimum, FailureHandling.STOP_ON_FAILURE)

//Select Bagaimana Biaya Admin Harus Dibebankan
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Biaya Admin Dibebankan'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : biaya_admin_dibebankan]), FailureHandling.STOP_ON_FAILURE)

//Select option Biaya Provision
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Radio - Biaya Provision', [('option') : biaya_provisi]), FailureHandling.STOP_ON_FAILURE)

//Input Minimum Biaya Provision
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Minimum Biaya Provision'), biaya_provisi_minimum, FailureHandling.STOP_ON_FAILURE)

//Input Default Biaya Provision
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Default Biaya Provision'), biaya_provisi_default, FailureHandling.STOP_ON_FAILURE)

//Input Maksimum Biaya Provision
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Biaya Provision'), biaya_provisi_maksimum, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Biaya Provision'), 3, FailureHandling.STOP_ON_FAILURE)

//Select Bagaimana Biaya Provision Harus Dibebankan
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Biaya Provisi Dibebankan'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : biaya_provisi_dibebankan]), FailureHandling.STOP_ON_FAILURE)

//Select option Biaya Asuransi
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Radio - Biaya Asuransi', [('option') : biaya_asuransi]), FailureHandling.STOP_ON_FAILURE)

//Input Minimum Biaya Asuransi
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Minimum Biaya Asuransi'), biaya_asuransi_minimum, FailureHandling.STOP_ON_FAILURE)

//Input Default Biaya Asuransi
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Default Biaya Asuransi'), biaya_asuransi_default, FailureHandling.STOP_ON_FAILURE)

//Input Maksimum Biaya Asuransi
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Maksimum Biaya Asuransi'), biaya_asuransi_maksimum, FailureHandling.STOP_ON_FAILURE)

//Select Bagaimana Biaya Asuransi Harus Dibebankan
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Biaya Asuransi Dibebankan'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : biaya_asuransi_dibebankan]), FailureHandling.STOP_ON_FAILURE)

//Select Perusahaan Penjamin
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Perusahaan Penjamin'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : perusahaan_penjamin]), FailureHandling.STOP_ON_FAILURE)

//Select Dibayar Oleh
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Dibayar Oleh'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : dibayar_oleh]), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Dibayar Oleh'), 3, FailureHandling.STOP_ON_FAILURE)

//Select option Tipe Denda Pemberi Pinjaman
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Radio - Tipe Denda Pemberi Pinjaman', [('option') : tipe_denda_lender]), FailureHandling.STOP_ON_FAILURE)

//Select Perhitungan Denda Pemberi Pinjaman
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Perhitungan Denda Lender'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : perhitungan_denda_lender]), FailureHandling.STOP_ON_FAILURE)

//Select Periode Bunga Denda Pemberi Pinjaman
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Periode Bunga Denda Lender'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : periode_bunga_denda_lender]), FailureHandling.STOP_ON_FAILURE)

//Input Suku Bunga Denda Pemberi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Suku Bunga Denda Pemberi Pinjaman'), suku_bunga_denda_lender, FailureHandling.STOP_ON_FAILURE)

//Input Masa Tenggang Denda Pemberi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Masa Tenggang Denda Pemberi Pinjaman'), masa_tenggang_denda_lender, FailureHandling.STOP_ON_FAILURE)

//Select Masa Tenggang Denda Pemberi Pinjaman
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Masa Tenggang Denda Lender'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : masa_tenggang_denda_lender_slc]), FailureHandling.STOP_ON_FAILURE)

//Select option Tipe Denda Peminjam
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Radio - Tipe Denda Peminjam', [('option') : tipe_denda_peminjam]), FailureHandling.STOP_ON_FAILURE)

//Select Perhitungan Denda Peminjam Pada
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Perhitungan Denda Peminjam'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : perhitungan_denda_peminjam]), FailureHandling.STOP_ON_FAILURE)

//Select Periode Bunga Denda Peminjam
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Periode Bunga Denda Peminjam'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : periode_bunga_denda_peminjam]), FailureHandling.STOP_ON_FAILURE)

//Input Suku Bunga Denda Peminjam
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Suku Bunga Denda Peminjam'), suku_bunga_denda_peminjam, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Suku Bunga Denda Peminjam'), 3, FailureHandling.STOP_ON_FAILURE)

//Input Masa Tenggang Denda Peminjam
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Masa Tenggang Denda Peminjam'), masa_tenggang_denda_peminjam, FailureHandling.STOP_ON_FAILURE)

//Select Masa Tenggang Denda Peminjam
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Masa Tenggang Denda Peminjam'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : masa_tenggang_denda_peminjam_slc]), FailureHandling.STOP_ON_FAILURE)

//Input Jaminan Pembayaran and click button Tambah
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Jaminan Pembayaran'), jaminan_pembayaran, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Button - Tambah Jaminan Pembayaran'), FailureHandling.STOP_ON_FAILURE)

//Input Warna Awal
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Slider - Warna Awal'), warna_awal, FailureHandling.STOP_ON_FAILURE)

//Input Warna Akhir
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Slider - Warna Akhir'), warna_akhir, FailureHandling.STOP_ON_FAILURE)

//Delete data informasi tambahan on the list
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Button - Hapus'), FailureHandling.STOP_ON_FAILURE)

//Input Nama
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Nama'), nama, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Nama'), 3, FailureHandling.STOP_ON_FAILURE)

//Select Tipe
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Tipe'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Select - Option', [('option') : tipe]), FailureHandling.STOP_ON_FAILURE)

//Select option Status
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Radio - Status', [('option') : status_informasi]), FailureHandling.STOP_ON_FAILURE)

//Input Prefix
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Prefix'), prefix, FailureHandling.STOP_ON_FAILURE)

//Input Suffix
WebUI.setText(findTestObject('FE/Backoffice V2/Loan Type/Form/Input - Suffix'), suffix, FailureHandling.STOP_ON_FAILURE)

//Click button Tambah Informasi
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Button - Tambah Informasi'), FailureHandling.STOP_ON_FAILURE)

//Verify data Informasi Tambahan is added to the list
//WebUI.verifyElementText(findTestObject('FE/Backoffice V2/Loan Type/Form/TextValue - Nama'), nama, FailureHandling.STOP_ON_FAILURE)

//Click button Kirim
WebUI.click(findTestObject('FE/Backoffice V2/Loan Type/Form/Button - Kirim'), FailureHandling.STOP_ON_FAILURE)

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/Loan Type/Form/Snackbar'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice V2/Loan Type/Form/Snackbar'), 'Success', FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementNotPresent(findTestObject('FE/Backoffice V2/Loan Type/Form/Snackbar'), 5, FailureHandling.STOP_ON_FAILURE)
