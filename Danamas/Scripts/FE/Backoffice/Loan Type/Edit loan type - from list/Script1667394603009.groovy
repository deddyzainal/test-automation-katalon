import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button edit on the list
WebUI.click(findTestObject('FE/Backoffice/Loan Type/List/Button - Edit', [('jenis_pinjaman') : jenis_pinjaman]))

//Input Jenis Pinjaman
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Type/Form/Input - Jenis Pinjaman'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Jenis Pinjaman'), jenis_pinjaman)

//Select Kategori Produk
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Kategori Produk'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Kategori Produk', [('option') : kategori]))

//Select Tipe Produk
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Tipe Produk'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Tipe Produk', [('option') : tipe_produk]))

//Select Tipe Agunan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Tipe Agunan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Tipe Agunan', [('option') : tipe_agunan]))

//Select Tujuan Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Tujuan Pinjaman'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Tujuan Pinjaman', [('option') : tujuan_pinjaman]))

//Input Kode Pinjaman
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Kode Pinjaman'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Kode Pinjaman'), kode_pinjaman)

//Select Status
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Status'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Status', [('option') : status]))

//Input Jumlah Pokok Pinjaman Minimum
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Jumlah Pokok Pinjaman Minimum'), jumlah_pokok_pinjaman_min)

//Input Jumlah Pokok Pinjaman Default
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Jumlah Pokok Pinjaman Default'), jumlah_pokok_pinjaman_default)

//Input Jumlah Pokok Pinjaman Maksimum
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Jumlah Pokok Pinjaman Maksimum'), jumlah_pokok_pinjaman_max)

//Select Nilai
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Nilai'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Nilai', [('option') : nilai]))

//Input Jumlah Pendanaan Minimum
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Jumlah Pendanaan Minimum'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Jumlah Pendanaan Minimum'), jumlah_pendanaan_min)

//Input Jumlah Pendanaan Default
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Jumlah Pendanaan Default'), jumlah_pendanaan_default)

//Input Jumlah Pendanaan Maksimum
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Jumlah Pendanaan Maksimum'), jumlah_pendanaan_max)

WebUI.delay(2)

//Select Metode Bunga Pinjaman
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Select - Metode Bunga Pinjaman'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Metode Bunga Pinjaman'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Metode Bunga Pinjaman', [('option') : metode_bunga_pinjaman]))

//Select Periode Bunga Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Periode Bunga Pinjaman'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Periode Bunga Pinjaman', [('option') : periode_bunga_pinjaman]))

//Input Mininum Bunga Peminjam
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Bunga Peminjam'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Bunga Peminjam'), bunga_peminjam_min)

//Input Default Bunga Peminjam
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Bunga Peminjam'), bunga_peminjam_default)

//Input Maksimum Bunga Peminjam
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Bunga Peminjam'), bunga_peminjam_max)

//Select Bagaimna Bunga Peminjam Dibebankan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Bunga Peminjam Dibebankan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Bunga Peminjam Dibebankan', [('option') : bunga_peminjam_dibebankan]))

//Input Mininum Bunga Pendana
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Bunga Pendana'), bunga_pendana_min)

//Input Default Bunga Pendana
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Bunga Pendana'), bunga_pendana_default)

//Input Maksimum Bunga Pendana
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Bunga Pendana'), bunga_pendana_max)

//Select Periode Durasi Pinjaman
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Select - Periode Durasi Pinjaman'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Periode Durasi Pinjaman'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Periode Durasi Pinjaman', [('option') : periode_durasi_pinjaman]))

//Input Mininum Durasi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Durasi Pinjaman'), durasi_pinjaman_min)

//Input Default Durasi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Durasi Pinjaman'), durasi_pinjaman_default)

//Input Maksimum Durasi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Durasi Pinjaman'), durasi_pinjaman_max)

//Select Jadwal Pencairan
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Select - Jadwal Pencairan'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Jadwal Pencairan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Jadwal Pencairan', [('option') : jadwal_pencairan]))

//Input Mininum Durasi Pencairan
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Durasi Pencairan'), durasi_pencairan_min)

//Input Default Durasi Pencairan
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Durasi Pencairan'), durasi_pencairan_default)

//Input Maksimum Durasi Pencairan
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Durasi Pencairan'), durasi_pencairan_max)

//Select Jadwal Pembayaran
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Jadwal Pembayaran'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Jadwal Pembayaran', [('option') : jadwal_pembayaran]))

//Input Mininum Pembayaran Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Pembayaran Pinjaman'), pembayaran_pinjaman_min)

//Input Default Pembayaran Pinjaman
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Pembayaran Pinjaman'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Pembayaran Pinjaman'), pembayaran_pinjaman_default)

//Input Maksimum Pembayaran Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Pembayaran Pinjaman'), pembayaran_pinjaman_max)

//Select Masa Tenggang Pembayaran
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Masa Tenggang Pembayaran'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Masa Tenggang Pembayaran', [('option') : masa_tenggang_pembayaran]))

//Select Cakupan Masa Tenggang Pembayaran
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Cakupan Masa Tenggang Pembayaran'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Cakupan Masa Tenggang Pembayaran', [('option') : cakupan_masa_tenggang_pembayaran]))

//Input Mininum Masa Tenggang Pembayaran
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Masa Tenggang Pembayaran'), masa_tenggang_pembayaran_min)

//Input Default Masa Tenggang Pembayaran
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Masa Tenggang Pembayaran'), masa_tenggang_pembayaran_default)

//Input Maksimum Masa Tenggang Pembayaran
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Masa Tenggang Pembayaran'), masa_tenggang_pembayaran_max)

//Select tipe Biaya Admin
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Biaya Admin', [('tipe') : tipe_biaya_admin]))

//Input Minimum Biaya Admin
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Admin'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Admin'), biaya_admin_min)

//Input Default Biaya Admin
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Biaya Admin'), biaya_admin_default)

//Input Maksimum Biaya Admin
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Biaya Admin'), biaya_admin_max)

//Select Bagaimana Biaya Admin Dibebankan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Biaya Admin Dibebankan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Biaya Admin Dibebankan', [('option') : biaya_admin_dibebankan]))

//Select tipe Biaya Proteksi
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Biaya Proteksi', [('tipe') : tipe_biaya_proteksi]))

//Input Minimum Biaya Proteksi
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Proteksi'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Proteksi'), biaya_proteksi_min)

//Input Default Biaya Proteksi
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Biaya Proteksi'), biaya_proteksi_default)

//Input Maksimum Biaya Proteksi
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Biaya Proteksi'), biaya_proteksi_max)

//Select Bagaimana Biaya Proteksi Dibebankan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Biaya Proteksi Dibebankan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Biaya Proteksi Dibebankan', [('option') : biaya_proteksi_dibebankan]))

//Select tipe Biaya Notaris
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Biaya Notaris', [('tipe') : tipe_biaya_notaris]))

//Input Minimum Biaya Notaris
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Notaris'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Notaris'), biaya_notaris_min)

//Input Default Biaya Notaris
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Biaya Notaris'), biaya_notaris_default)

//Input Maksimum Biaya Notaris
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Biaya Notaris'), biaya_notaris_max)

//Select Bagaimana Biaya Notaris Dibebankan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Biaya Notaris Dibebankan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Biaya Notaris Dibebankan', [('option') : biaya_notaris_dibebankan]))

//Select tipe Biaya Appraisal
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Biaya Appraisal', [('tipe') : tipe_biaya_appraisal]))

//Input Minimum Biaya Appraisal
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Appraisal'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Appraisal'), biaya_appraisal_min)

//Input Default Biaya Appraisal
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Biaya Appraisal'), biaya_appraisal_default)

//Input Maksimum Biaya Appraisal
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Biaya Appraisal'), biaya_appraisal_max)

//Select Bagaimana Biaya Appraisal Dibebankan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Biaya Appraisal Dibebankan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Biaya Appraisal Dibebankan', [('option') : biaya_appraisal_dibebankan]))

//Select tipe Biaya Asuransi Jiwa
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Biaya Asuransi Jiwa', [('tipe') : tipe_biaya_asuransi_jiwa]))

//Input Minimum Biaya Asuransi Jiwa
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Asuransi Jiwa'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Asuransi Jiwa'), biaya_asuransi_jiwa_min)

//Input Default Biaya Asuransi Jiwa
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Biaya Asuransi Jiwa'), biaya_asuransi_jiwa_default)

//Input Maksimum Biaya Asuransi Jiwa
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Biaya Asuransi Jiwa'), biaya_asuransi_jiwa_max)

//Select Bagaimana Biaya Asuransi Jiwa Dibebankan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Asuransi Jiwa Dibebankan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Asuransi Jiwa Dibebankan', [('option') : biaya_asuransi_jiwa_dibebankan]))

//Select tipe Biaya Asuransi Kebakaran
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Biaya Asuransi Kebakaran', [('tipe') : tipe_biaya_asuransi_kebakaran]))

//Input Minimum Biaya Asuransi Kebakaran
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Asuransi Kebakaran'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Asuransi Kebakaran'), biaya_asuransi_kebakaran_min)

//Input Default Biaya Asuransi Kebakaran
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Biaya Asuransi Kebakaran'), biaya_asuransi_kebakaran_default)

//Input Maksimum Biaya Asuransi Kebakaran
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Biaya Asuransi Kebakaran'), biaya_asuransi_kebakaran_max)

//Select Bagaimana Biaya Asuransi Kebakaran Dibebankan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Asuransi Kebakaran Dibebankan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Asuransi Kebakaran Dibebankan', [('option') : biaya_asuransi_kebakaran_dibebankan]))

//Select tipe Biaya Premi
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Biaya Premi', [('tipe') : tipe_biaya_premi]))

//Input Minimum Biaya Premi
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Premi'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Biaya Premi'), biaya_premi_min)

//Input Default Biaya Premi
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Biaya Premi'), biaya_premi_default)

//Input Maksimum Biaya Premi
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Biaya Premi'), biaya_premi_max)

//Select Bagaimana Biaya Premi Dibebankan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Biaya Premi Dibebankan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Biaya Premi Dibebankan', [('option') : biaya_premi_dibebankan]))

//Select tipe Biaya Dana Blokir
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Biaya Dana Blokir', [('tipe') : tipe_biaya_dana_blokir]))

//Input Minimum Dana Blokir
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Dana Blokir'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Minimum Dana Blokir'), dana_blokir_min)

//Input Default Dana Blokir
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Default Dana Blokir'), dana_blokir_default)

//Input Maksimum Dana Blokir
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Dana Blokir'), dana_blokir_max)

//Select Bagaimana Dana Blokir Dibebankan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Dana Blokir Dibebankan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Dana Blokir Dibebankan', [('option') : dana_blokir_dibebankan]))

//Input Maksimum LTV
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Maksimum Nilai LTV'), max_nilai_ltv)

//Input Presentase LTV
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Persentase LTV'), persentase_ltv)

//Select Perusahaan Penjamin
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Select - Perusahaan Penjamin'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Perusahaan Penjamin'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Perusahaan Penjamin', [('option') : perusahaan_penjamin]))

//Select Dibayar Oleh
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Dibayar Oleh'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Dibayar Oleh', [('option') : dibayar_oleh]))

//Select tipe Tipe Denda Pemberi Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Tipe Denda Pemberi Pinjaman', [('tipe') : tipe_denda_pemberi_pinjaman]))

//Select Perhitungan Bunga Denda Pemberi Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Perhitungan Bunga Denda Pemberi Pinjaman'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Perhitungan Bunga Denda Pemberi Pinjaman', [('option') : perhitungan_bunga_denda_lender]))

//Select Periode Bunga Denda Pemberi Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Periode Bunga Denda Pemberi Pinjaman'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Periode Bunga Denda Pemberi Pinjaman', [('option') : periode_bunga_denda_lender]))

//Input Suku Bunga Denda Pemberi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Suku Bunga Denda Pemberi Pinjaman'), bunga_denda_lender)

//Input Masa Tenggang Pemberi Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Masa Tenggang Pemberi Pinjaman'), masa_tenggang_lender_inp)

//Select Masa Tenggang Pemberi Pinjaman
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Masa Tenggang Pemberi Pinjaman'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Masa Tenggang Pemberi Pinjaman', [('option') : masa_tenggang_lender_slc]))

//Select tipe Tipe Denda Peminjam
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Tipe Denda Peminjam', [('tipe') : tipe_denda_peminjam]))

//Select Perhitungan Denda Peminjam
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Select - Perhitungan Denda Peminjam'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Perhitungan Denda Peminjam'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Perhitungan Denda Peminjam', [('option') : perhitungan_denda_peminjam]))

//Select Periode Bunga Denda Peminjam
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Periode Bunga Denda Peminjam'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Periode Bunga Denda Peminjam', [('option') : periode_bunga_denda_peminjam]))

//Input Suku Bunga Denda Peminjam
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Suku Bunga Denda Peminjam'), bunda_denda_peminjam)

//Input Masa Tenggang Peminjam
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Masa Tenggang Peminjam'), masa_tenggang_peminjam_inp)

//Select Masa Tenggang Peminjam
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Masa Tenggang Peminjam'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Masa Tenggang Peminjam', [('option') : masa_tenggang_peminjam_slc]))

//Select Bunga Floating
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Bunga Floating', [('tipe') : bunga_floating]))

//Input Nama Jaminan Pembayaran
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Type/Form/Input - Nama Jaminan Pembayaran'), 3)
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Nama Jaminan Pembayaran'), nama_jaminan_pembayaran)

//Input Nama Informasi Tambahan
WebUI.setText(findTestObject('FE/Backoffice/Loan Type/Form/Input - Nama Informasi Tambahan'), nama_informasi_tambahan)

//Select Status Informasi Tambahan
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Radio - Status', [('tipe') : status_info_tambahan]))

//Select Tipe
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Select - Tipe'))
WebUI.click(findTestObject('FE/Backoffice/Loan Type/Form/Option - Tipe', [('option') : tipe]))

//Click button Enter
WebUI.click(findTestObject('Object Repository/FE/Backoffice/Loan Type/Form/Button - Enter'))

//Click button Tambah Informasi
WebUI.click(findTestObject('Object Repository/FE/Backoffice/Loan Type/Form/Button - Tambah Informasi'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Success', FailureHandling.STOP_ON_FAILURE)
