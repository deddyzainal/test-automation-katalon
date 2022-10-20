import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button Edit Informasi
WebUI.scrollToElement(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Button - Edit Informasi'), 2)
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Button - Edit Informasi'))

WebUI.waitForPageLoad(5)

//Input Nama Lengkap
WebUI.scrollToElement(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Nama Lengkap'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Nama Lengkap'), nama_lengkap)

//Input NIK
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - NIK'), nik)

//Input Tempat Lahir
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Tempat Lahir'), tempat_lahir)

//Input Tanggal Lahir
//WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Tanggal Lahir'), tanggal_lahir)

//Select Jenis Kelamin
WebUI.scrollToElement(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Jenis Kelamin'), 2)
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Jenis Kelamin'))
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Option - Jenis Kelamin', [('jenis_kelamin') : jenis_kelamin]))

//Input Nama Ibu Kandung
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Nama Ibu Kandung'), nama_ibu_kandung)

//Select Agama
WebUI.scrollToElement(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Agama'), 2)
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Agama'))
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Option - Agama', [('agama') : agama]))

//Select Status Pernikahan
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Status Pernikahan'))
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Option - Status Pernikahan', [('status_pernikahan') : status_pernikahan]))

//Input Email
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Email'), email)

//Input NPWP
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - NPWP'), npwp)

//Input Alamat KTP
WebUI.scrollToElement(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Alamat KTP'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Alamat KTP'), alamat_ktp)

//Input RT KTP
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - RT KTP'), rt_ktp)

//Input RW KTP
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - RW KTP'), rw_ktp)

//Input Kode Pos KTP
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Kode Pos KTP'), kode_pos_ktp)

//Input Alamat Domisili
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Alamat Domisili'), alamat_domisili)

//Input RT KTP
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - RT Domisili'), rt_domisili)

//Input RW KTP
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - RW Domisili'), rw_domisili)

//Input Kode Pos KTP
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Kode Pos Domisili'), kode_pos_domisili)

String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice/'

//Upload file KTP
WebUI.scrollToElement(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Foto KTP'), 2)
WebUI.uploadFile(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Foto KTP'), filePath + 'ktp.png')

//Upload file Selfie KTP
WebUI.uploadFile(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Foto Selfie KTP'), filePath + 'selfie_ktp.jpeg')

//Upload file NPWP
WebUI.scrollToElement(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Foto NPWP'), 2)
WebUI.uploadFile(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Foto NPWP'), filePath + 'npwp.png')

//CLick button Lanjut
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Button - Lanjut'))

//Select Nama Bank
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Nama Bank'))
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Option - Nama Bank', [('nama_bank') : nama_bank]))

//Input Nama Cabang Bank
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - Nama Cabang Bank'), nama_cabang_bank)

//Input No Rekening
WebUI.setText(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Input - No Rekening'), no_rekening)

//CLick button Lanjut
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Button - Lanjut'))

//Select Kategory Agen
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Kategori Agen'))
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Option - Kategori Agen', [('kategori_agen') : kategori_agen]))

if(kategori_agen == 'Partner') {
	//Select Nama Partner
	WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Nama Partner'))
	WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Option - Nama Partner', [('nama_partner') : nama_partner]))
}
else if(kategori_agen == 'Branch') {
	//Select Kota Agen
	WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Kota Agen'))
	WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Option - Kota Agen', [('kota_agen') : kota_agen]))
	
	//Select Nama Cabang
	WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Nama Cabang'))
	WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Option - Nama Cabang', [('nama_cabang') : nama_cabang]))
	
	//Select Posisi
	WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Posisi'))
	WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Option - Posisi', [('posisi') : posisi]))
}

//Select Status Agen
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Select - Status Agen'))
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Option - Status Agen', [('status_agen') : status_agen]))

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Sales/Sales Team/Detail/Edit Agent/Button - Simpan'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Success', FailureHandling.STOP_ON_FAILURE)

