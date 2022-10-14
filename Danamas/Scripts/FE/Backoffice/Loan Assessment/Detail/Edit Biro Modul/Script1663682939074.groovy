import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String aa = 'aaa'

//Click tab Biro Modul
//WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Biro Modul'))
//WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Label - Biro Modul'), 3, FailureHandling.STOP_ON_FAILURE)

//Click button Edit
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Edit'), 3)
WebUI.delay(4)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Edit'))

WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Label - Biro Modul'), 3)

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Generate Data Pefindo'), 3, FailureHandling.OPTIONAL)) {
	//Generate Data Pefindo
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Generate Data Pefindo'))
	WebUI.delay(5)
	WebUI.verifyElementNotPresent(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Generate Data Pefindo'), 5, FailureHandling.STOP_ON_FAILURE)
	
}


//Open Fasilitas Aktif (All)
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pemohon/Button - Fasilitas Aktif'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pemohon/Button - Fasilitas Aktif'))
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pemohon/Label - Fasilitas Aktif'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyTextPresent('Semua', false, FailureHandling.STOP_ON_FAILURE)

//Open Detail Fasilitas Aktif
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pemohon/DataTable - Fasilitas Aktif'))
WebUI.verifyTextPresent('Original Data', false, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyTextPresent('Perubahan Data', false, FailureHandling.STOP_ON_FAILURE)

//Close dialog Fasilitas Aktif
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pemohon/Button - Close'))

String status = WebUI.getText(findTestObject('FE/Backoffice/Loan Assessment/Detail/TextValue - Status'), FailureHandling.STOP_ON_FAILURE).drop(2)
println(status)

//Open Fasilitas Aktif Pasangan
if(status == 'Kawin') {
	println('K')
	WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pasangan/Button - Fasilitas Aktif'), 2)
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pasangan/Button - Fasilitas Aktif'))
	WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pasangan/Label - Fasilitas Aktif'), 0, FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyTextPresent('Semua', false, FailureHandling.STOP_ON_FAILURE)
	
	//Open Detail Fasilitas Aktif
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pasangan/DataTable - Fasilitas Aktif'))
	WebUI.verifyTextPresent('Original Data', false, FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyTextPresent('Perubahan Data', false, FailureHandling.STOP_ON_FAILURE)
	
	//Close dialog Fasilitas Aktif
	WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Pasangan/Button - Close'))
}

//Click button Save
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Save'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Button - Save'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Biro Modul/Snackbar - Heading'), 'Sukses', FailureHandling.STOP_ON_FAILURE)
