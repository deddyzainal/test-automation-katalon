import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click tab Persetujuan Akhir
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Persetujuan Akhir'))
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Label - Persetujuan Akhir'), 3, FailureHandling.STOP_ON_FAILURE)

//Click button Edit
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Button - Edit'), 2)
WebUI.delay(3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Button - Edit'))

//Select Keputusan CA
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Keputusan CA'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Option - Keputusan CA', [('keputusan_ca') : keputusan_ca]))

if(keputusan_ca == 'FAIL') {
	//Select Alasan Penolakan 1
	WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Alasan Penolakan 1'), 2)
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Alasan Penolakan 1'))
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Option - Alasan Penolakan 1', [('alasan_penolakan_1') : alasan_penolakan_1]))
	
	//Select Alasan Penolakan 2
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Alasan Penolakan 2'))
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Option - Alasan Penolakan 2', [('alasan_penolakan_2') : alasan_penolakan_2]))
	
	//Select Alasan Penolakan 3
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Alasan Penolakan 3'))
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Option - Alasan Penolakan 3', [('alasan_penolakan_3') : alasan_penolakan_3]))
}

//Input Catatan CA
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Input - Catatan CA'), catatan_ca)

//Select Nama CA Kedua
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Nama CA Kedua'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Nama CA Kedua'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Option - Nama CA Kedua', [('nama_ca_kedua') : nama_ca_kedua]))

//Select Tanggal Keputusan CA Kedua, get today's date
String date = new Date().format('dd')
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Input - Tanggal Keputusan CA Kedua'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Option - Tanggal Keputusan CA Kedua', [('tanggal') : date]))

//Select Keputusan CA Kedua
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Keputusan CA Kedua'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Option - Keputusan CA Kedua', [('keputusan_ca_kedua') : keputusan_ca_kedua]))

if(keputusan_ca_kedua == 'FAIL') {
	//Select Alasan Penolakan 1 CA Kedua
	WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Alasan Penolakan 1 CA Kedua'), 2)
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Alasan Penolakan 1 CA Kedua'))
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Option - Alasan Penolakan 1 CA Kedua', [('alasan_penolakan_1_ca_kedua') : alasan_penolakan_1_ca_kedua]))
	
	//Select Alasan Penolakan 2 CA Kedua
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Alasan Penolakan 2 CA Kedua'))
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Option - Alasan Penolakan 2 CA Kedua', [('alasan_penolakan_2_ca_kedua') : alasan_penolakan_2_ca_kedua]))
	
	//Select Alasan Penolakan 3 CA Kedua
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Select - Alasan Penolakan 3 CA Kedua'))
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Option - Alasan Penolakan 3 CA Kedua', [('alasan_penolakan_3_ca_kedua') : alasan_penolakan_3_ca_kedua]))
}

//Input Catatan CA Kedua
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Input - Catatan CA Kedua'), catatan_ca_kedua)

//Click button Save
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Button - Save'), 3)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Button - Save'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Persetujuan Akhir/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)