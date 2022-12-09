import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Cick tab Informasi Credential
WebUI.scrollToPosition(0, 30, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Tab - Informasi Credential'), FailureHandling.STOP_ON_FAILURE)

//Input No KTP
WebUI.waitForElementVisible(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - No KTP'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - No KTP'), no_ktp, FailureHandling.STOP_ON_FAILURE)

//Select Status KTP
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Status KTP'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Option', [('option') : status_ktp]), FailureHandling.STOP_ON_FAILURE)

//Upload Foto KTP
String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice V2/'
WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - File Foto KTP'), filePath + 'ktp.png', FailureHandling.STOP_ON_FAILURE)

//Upload Foto Selfie
WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - File Foto Selfie'), filePath + 'selfie.jpeg', FailureHandling.STOP_ON_FAILURE)

//Input No NPWP
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - No NPWP'), no_npwp, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - No NPWP'), 3, FailureHandling.STOP_ON_FAILURE)

//Select Status NPWP
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Status NPWP'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Option', [('option') : status_npwp]), FailureHandling.STOP_ON_FAILURE)

//Upload Foto NPWP
WebUI.uploadFile(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - Foto NPWP'), filePath + 'npwp.png', FailureHandling.STOP_ON_FAILURE)

//Input Alamat
WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - Alamat KTP'), alamat_ktp, FailureHandling.STOP_ON_FAILURE)

if(type == 'Individual') {
	//Input RT RW
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - RT RW KTP'), rt_rw_ktp, FailureHandling.STOP_ON_FAILURE)
}

//Select Provinsi
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Provinsi KTP'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Option', [('option') : provinsi_ktp]), FailureHandling.STOP_ON_FAILURE)

//Select Kota
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Kota KTP'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Option', [('option') : kota_ktp]), FailureHandling.STOP_ON_FAILURE)

//Select Kecamatan
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Kecamatan KTP'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Option', [('option') : kecamatan_ktp]), FailureHandling.STOP_ON_FAILURE)

//Select Kelurahan
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Kelurahan KTP'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Option', [('option') : kelurahan_ktp]), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Kelurahan KTP'), 3, FailureHandling.STOP_ON_FAILURE)

if(type == 'Individual') {
	//Check Alamat Tempat Tinggal Berbeda Dengan KTP
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Checkbox - Alamat Tempat Tinggal'), FailureHandling.STOP_ON_FAILURE)
	
	//Input Alamat
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - Alamat Domisili'), alamat_domisili, FailureHandling.STOP_ON_FAILURE)
	
	//Input RT RW
	WebUI.setText(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Input - RT RW Domisili'), rt_rw_domisili, FailureHandling.STOP_ON_FAILURE)
	
	//Select Provinsi
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Provinsi Domisili'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Option', [('option') : provinsi_domisili]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Kota
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Kota Domisili'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Option', [('option') : kota_domisili]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Kecamatan
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Kecamatan Domisili'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Option', [('option') : kecamatan_domisili]), FailureHandling.STOP_ON_FAILURE)
	
	//Select Kelurahan
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Kelurahan Domisili'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('FE/Backoffice V2/User Management/Detail/Credential Information/Select - Option', [('option') : kelurahan_domisili]), FailureHandling.STOP_ON_FAILURE)
}
