import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button Edit Data
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Button - Edit Data'))

WebUI.waitForPageLoad(3)

//Edit Alamat KTP
//Input Alamat
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Input - Alamat'), ktp_alamat)

//Input RT
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Input - RT'), ktp_rt)

//Input RW
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Input - RW'), ktp_rw)

//Select Provinsi
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Select - Provinsi'), 2)
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Select - Provinsi'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Option - Provinsi', [('provinsi'):ktp_provinsi]))

//Select Kota/Kabupaten
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Select - Kota Kabupaten'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Option - Kota Kabupaten', [('kota_kabupaten'):ktp_kota_kabupaten]))

//Select Kecamatan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Select - Kecamatan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Option - Kecamatan', [('kecamatan'):ktp_kecamatan]))

//Select Kelurahan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Select - Kelurahan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Option - Kelurahan', [('kelurahan'):ktp_kelurahan]))

//Input Kode Pos
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Input - Kode Pos'), ktp_kode_pos)

//Upload Foto Tempat Tinggal Saat Ini
String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice/'
WebUI.uploadFile(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/KTP/Input - Foto Tempat Tinggal'), filePath + 'tempat_tinggal.jpeg')

if(WebUI.verifyElementNotPresent(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Input - Alamat'), 3, FailureHandling.OPTIONAL)) {
	//Check Alamat domisili berbeda dengan di KTP
	WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Checkbox - Alamat Domisili'))
}

//Edit Alamat Domisili
//Input Alamat
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Input - Alamat'), 2)
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Input - Alamat'), domisili_alamat)

//Input RT
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Input - RT'), domisili_rt)

//Input RW
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Input - RW'), domisili_rw)

//Select Provinsi
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Select - Provinsi'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Option - Provinsi', [('provinsi'):domisili_provinsi]))

//Select Kota/Kabupaten
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Select - Kota Kabupaten'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Option - Kota Kabupaten', [('kota_kabupaten'):domisili_kota_kabupaten]))

//Select Kecamatan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Select - Kecamatan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Option - Kecamatan', [('kecamatan'):domisili_kecamatan]))

//Select Kelurahan
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Select - Kelurahan'))
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Option - Kelurahan', [('kelurahan'):domisili_kelurahan]))

//Input Kode Pos
WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Domisili/Input - Kode Pos'), domisili_kode_pos)

//Click button Simpan
WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Button - Simpan'), 2)
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Alamat/Button - Simpan'))

//Click button Confirm on onfirmation modal
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Button - Confirm'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice/Common/Button - Confirm'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Sukses Mengubah Data', FailureHandling.STOP_ON_FAILURE)


