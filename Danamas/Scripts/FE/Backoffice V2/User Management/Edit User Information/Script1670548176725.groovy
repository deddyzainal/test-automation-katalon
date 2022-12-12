import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice V2/'

//Cick data on the list
WebUI.click(findTestObject('FE/Backoffice V2/User Management/List/DataTable - Row 1'), FailureHandling.STOP_ON_FAILURE)

//Cick button Edit
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/User Management/Detail/Button - Edit'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Button - Edit'), FailureHandling.STOP_ON_FAILURE)

//Input Name
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Name'), name, FailureHandling.STOP_ON_FAILURE)

//Select Gender
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Gender'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : gender]), FailureHandling.STOP_ON_FAILURE)

//Input Place Of Birth
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Place Of Birth'), pob, FailureHandling.STOP_ON_FAILURE)

//Input Date Of Birth
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Date Of Birth'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Button - Month Year'), FailureHandling.STOP_ON_FAILURE)
//Select Year
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Year', [('year') : dob_year]), FailureHandling.STOP_ON_FAILURE)
//Select Month
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Month', [('month') : dob_month]), FailureHandling.STOP_ON_FAILURE)
//Select Date
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Date', [('date') : dob_date]), FailureHandling.STOP_ON_FAILURE)

//Select Marriage Status
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Marriage Status'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : marriage_status]), FailureHandling.STOP_ON_FAILURE)

//Select Religion
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Religion'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : religion]), FailureHandling.STOP_ON_FAILURE)

//Select Nationality
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Nationality'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : nationality]), FailureHandling.STOP_ON_FAILURE)

//Input Mother Name
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Mother Name'), mother_name, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Mother Name'), 2, FailureHandling.STOP_ON_FAILURE)

//Input Phone Number
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Phone Number'), phone_number, FailureHandling.STOP_ON_FAILURE)

//Input Email
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Email'), email, FailureHandling.STOP_ON_FAILURE)

//Select Email Status
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Email Status'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : email_status]), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Email Status'), 2, FailureHandling.STOP_ON_FAILURE)

if(type == 'Institutional') {
	//Company Information
	//Select Tipe Perusahaan
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Select - Tipe Perusahaan'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : tipe_perusahaan]), FailureHandling.STOP_ON_FAILURE)
	
	//Input Nama Perusahaan
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Input - Nama Perusahaan'), nama_perusahaan, FailureHandling.STOP_ON_FAILURE)
	
	//Select Pendapatan Perusahaan
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Select - Pendapatan Perusahaan'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : pendapatan_perusahaan]), FailureHandling.STOP_ON_FAILURE)
	
	//Input Telpon Perusahaan
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Input - Telpon Perusahaan'), telpon_perusahaan, FailureHandling.STOP_ON_FAILURE)
	
	//Select Bidang Usaha Perusahaan
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Select - Bidang Usaha Perusahaan'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : bidang_usaha_perusahaan]), FailureHandling.STOP_ON_FAILURE)
	
	//Input Alamat
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Input - Alamat'), alamat, FailureHandling.STOP_ON_FAILURE)
	
	//Select Provinsi
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Select - Provinsi'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : provinsi]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Kota
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Select - Kota'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : kota]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Kecamatan
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Select - Kecamatan'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : kecamatan]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Kelurahan
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Select - Kelurahan'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : kelurahan]), FailureHandling.STOP_ON_FAILURE)
	
	//Input NPWP Perusahaan
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Input - NPWP Perusahaan'), npwp_perusahaan, FailureHandling.STOP_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Information/Input - NPWP Perusahaan'), 2, FailureHandling.STOP_ON_FAILURE)
	
	
	//Company Director Information
	//Input Nama
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Input - Nama'), director_name, FailureHandling.STOP_ON_FAILURE)
	
	//Input Email
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Input - Email'), director_email, FailureHandling.STOP_ON_FAILURE)
	
	//Input Kota Kelahiran
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Input - Kota Kelahiran'), director_pob, FailureHandling.STOP_ON_FAILURE)
	
	//Input Date Of Birth
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Input - Tanggal Kelahiran'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Button - Month Year'), FailureHandling.STOP_ON_FAILURE)
	//Select Year
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Year', [('year') : director_dob_year]), FailureHandling.STOP_ON_FAILURE)
	//Select Month
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Month', [('month') : director_dob_month]), FailureHandling.STOP_ON_FAILURE)
	//Select Date
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Date', [('date') : director_dob_date]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Gender
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Select - Gender'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : director_gender]), FailureHandling.STOP_ON_FAILURE)
	
	//Input Detail Alamat
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Input - Detail Alamat'), director_alamat, FailureHandling.STOP_ON_FAILURE)
	
	//Select Provinsi
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Select - Provinsi'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : director_provinsi]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Kota
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Select - Kota'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : director_kota]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Kecamatan
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Select - Kecamatan'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : director_kecamatan]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Kelurahan
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Select - Kelurahan'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : director_kelurahan]), FailureHandling.STOP_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Company Director/Select - Kelurahan'), 2, FailureHandling.STOP_ON_FAILURE)
}

//Select Status
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Status'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : status]), FailureHandling.STOP_ON_FAILURE)

if(type == 'Institutional') {
	//Input Nomor Surat Kuasa
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Nomor Surat Kuasa'), nomor_surat_kuasa, FailureHandling.STOP_ON_FAILURE)
	
	//Input Tanggal Surat Kuasa
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Tanggal Surat Kuasa'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Button - Month Year'), FailureHandling.STOP_ON_FAILURE)
	//Select Year
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Year', [('year') : sk_year]), FailureHandling.STOP_ON_FAILURE)
	//Select Month
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Month', [('month') : sk_month]), FailureHandling.STOP_ON_FAILURE)
	//Select Date
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Date', [('date') : sk_date]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Surat Kuasa Status
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Surat Kuasa Status'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : status_surat_kuasa]), FailureHandling.STOP_ON_FAILURE)
	
	//Upload File Foto Surat Kuasa
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - File Foto Surat Kuasa'), filePath + 'surat_kuasa.jpeg', FailureHandling.STOP_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - File Foto Surat Kuasa'), 2, FailureHandling.STOP_ON_FAILURE)
}

if(user == 'Borrower' && type == 'Individual') {
	//Input Nomor Surat Persetujuan Pasangan
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Nomor Surat Persetujuan Pasangan'), nomor_surat_persetujuan_pasangan, FailureHandling.STOP_ON_FAILURE)
	
	//Input Tanggal Surat Persetujuan Pasangan
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Tanggal Surat Persetujuan Pasangan'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Button - Month Year'), FailureHandling.STOP_ON_FAILURE)
	//Select Year
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Year', [('year') : spp_year]), FailureHandling.STOP_ON_FAILURE)
	//Select Month
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Month', [('month') : spp_month]), FailureHandling.STOP_ON_FAILURE)
	//Select Date
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Date', [('date') : spp_date]), FailureHandling.STOP_ON_FAILURE)
	
	//Input Company Name
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Company Name'), company_name, FailureHandling.STOP_ON_FAILURE)
	
	//Select Length Of Work
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Length Of Work'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : length_of_work]), FailureHandling.STOP_ON_FAILURE)
	
	//Input Estimated Income
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Estimated Income'), estimated_income, FailureHandling.STOP_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Estimated Income'), 2, FailureHandling.STOP_ON_FAILURE)
	
	//Input Guarantor Name
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Guarantor Name'), guarantor_name, FailureHandling.STOP_ON_FAILURE)
	
	//Input Guarantor Phone Number
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Guarantor Phone Number'), guarantor_phone_number, FailureHandling.STOP_ON_FAILURE)
	
	//Select Relationship Information
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Relationship Information'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : relationship_information]), FailureHandling.STOP_ON_FAILURE)
}

//Input Bank Name
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Bank Name'), bank_name, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Select - Option', [('option') : bank_name]), FailureHandling.STOP_ON_FAILURE)

//Input Bank Account Number
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Bank Account Number'), bank_account_number, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Bank Name'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Bank Account Number'), 2, FailureHandling.STOP_ON_FAILURE)

if(user == 'Lender' && type == 'Individual') {
	//Upload Family Card Attachment
	WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - File Family Card Attachment'), 2, FailureHandling.STOP_ON_FAILURE)
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - File Family Card Attachment'), filePath + 'kk.jpeg', FailureHandling.STOP_ON_FAILURE)
	
}

if(type == 'Institutional') {
	//Upload KTP dan NPWP Direktur
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - KTP dan NPWP Direktur'), filePath + 'ktp.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - KTP dan NPWP Direktur'), 2, FailureHandling.STOP_ON_FAILURE)
	
	//Upload Akta Pendirian
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - Akta Pendirian'), filePath + 'akta_pendirian.png', FailureHandling.STOP_ON_FAILURE)
	
	//Upload SIUP
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - SIUP'), filePath + 'siup.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - SIUP'), 2, FailureHandling.STOP_ON_FAILURE)
	
	//Upload TDP
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - TDP'), filePath + 'tdp.jpeg', FailureHandling.STOP_ON_FAILURE)
	
	//Upload KTP dan NPWP Pemegang Saham
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - KTP dan NPWP Pemegang Saham'), filePath + 'npwp.png', FailureHandling.STOP_ON_FAILURE)
	
	//Upload Akta Perubahan
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - Akta Perubahan'), filePath + 'akta_perubahan.jpeg', FailureHandling.STOP_ON_FAILURE)
	
	//Upload SK Kemenkumham masing - masing
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - SK Kemenkumham'), filePath + 'sk_kemenkumham.png', FailureHandling.STOP_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - SK Kemenkumham'), 2, FailureHandling.STOP_ON_FAILURE)
	
	//Upload SK Pemegang Saham
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - SK Pemegang Saham'), filePath + 'sk_pemegang_saham.jpeg', FailureHandling.STOP_ON_FAILURE)
	
	//Upload Laporan Keuangan 2 Tahun Terakhir
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - Laporan Keuangan 2 Tahun Terakhir'), filePath + 'laporan_keuangan.jpeg', FailureHandling.STOP_ON_FAILURE)
	
	//Upload Rekening Koran 3 Bulan Terakhir
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - Rekening Koran 3 Bulan Terakhir'), filePath + 'rekening_koran.jpeg', FailureHandling.STOP_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - Rekening Koran 3 Bulan Terakhir'), 2, FailureHandling.STOP_ON_FAILURE)
	
	//Upload NPWP Perusahaan
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - NPWP Perusahaan'), filePath + 'npwp.png', FailureHandling.STOP_ON_FAILURE)
	
	//Upload List Asset dan Bouwheer
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - List Asset dan Bouwheer'), filePath + 'list_asset.jpeg', FailureHandling.STOP_ON_FAILURE)
	
	//Upload Surat Keterangan Domisili Usaha
	WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - Surat Keterangan Domisili Usaha'), filePath + 'sk_domisili_usaha.jpeg', FailureHandling.STOP_ON_FAILURE)
	WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Document Information/Input - Surat Keterangan Domisili Usaha'), 2, FailureHandling.STOP_ON_FAILURE)
}

//Click button Add Lampiran Lainnya
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Button - Add'), FailureHandling.STOP_ON_FAILURE)

//Input Lampiran Lainnya
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - Lampiran Lainnya'), lampiran_lainnya, FailureHandling.STOP_ON_FAILURE)

//Upload File Lampiran
WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/User Information/Input - File Lampiran'), filePath + 'lampiran_lainnya.png', FailureHandling.STOP_ON_FAILURE)
