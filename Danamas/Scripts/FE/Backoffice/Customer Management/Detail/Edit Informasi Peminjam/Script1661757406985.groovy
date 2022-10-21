import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button Edit Data
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Button - Edit Data'))

WebUI.waitForPageLoad(3)

//Input Nama Sesuai KTP
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Nama'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Nama'), nama)

//Input NIK
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - NIK'), nik)

//Select Jenis Kelamin
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Jenis Kelamin'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Option - Jenis Kelamin', [('jenis_kelamin'):jenis_kelamin]))

//Input Nama Ibu Kandung
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Nama Ibu Kandung'), nama_ibu_kandung)

//Input Tempat Lahir
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Tempat Lahir'), tempat_lahir)

//Input Tanggal Lahir
//WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Tanggal Lahir'), tanggal_lahir)

//Input Nomor Handphone
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Nomor Handphone'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Nomor Handphone'), nomor_handphone)

//Input Email
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Email'), email)

//Select Status Pernikahan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Status Pernikahan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Option - Status Pernikahan', [('status_pernikahan'):status_pernikahan]))

//Select Pendidikan Terakhir
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Pendidikan Terakhir'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Option - Pendidikan Terakhir', [('pendidikan_terakhir'):pendidikan_terakhir]))

//Select Agama
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Agama'), 2)
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Agama'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Option - Agama', [('agama'):agama]))

//Select Kewarganegaraan
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Kewarganegaraan'), 2)
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Select - Kewarganegaraan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Option - Kewarganegaraan', [('kewarganegaraan'):kewarganegaraan]))

String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice/'

//Upload Foto KK
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto KK'), 2)
//WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto KK'))
WebUI.uploadFile(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto KK'), filePath + 'kk.jpeg')

//Upload Foto NPWP
WebUI.uploadFile(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto NPWP'), filePath + 'npwp.png')

//Upload Foto KTP
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto KTP'), 2)
WebUI.uploadFile(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto KTP'), filePath + 'ktp.png')

//Upload Foto Selfie dengan KTP
WebUI.uploadFile(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Input - Foto Selfie dengan KTP'), filePath + 'selfie_ktp.jpeg')

//Upload Foto KTP Pasangan

//Upload Foto Buku Nikah

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Peminjam/Button - Simpan'))

//Click button Confirm on onfirmation modal
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Button - Confirm'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Common/Button - Confirm'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Sukses Mengubah Data', FailureHandling.STOP_ON_FAILURE)


