import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Select Tipe Dokumen
WebUI.click(findTestObject('FE/Backoffice/Data Export/Select - Tipe Dokumen'))
WebUI.click(findTestObject('FE/Backoffice/Data Export/Option - Tipe Dokumen', [('tipe_dokumen') : tipe_dokumen]))

//Input From Date
WebUI.click(findTestObject('FE/Backoffice/Data Export/Input - From Date'))
WebUI.selectOptionByLabel(findTestObject('FE/Backoffice/Data Export/Select - Month From'), from_month, false)
WebUI.selectOptionByLabel(findTestObject('FE/Backoffice/Data Export/Select - Year From'), from_year, false)
WebUI.click(findTestObject('FE/Backoffice/Data Export/Date - From', [('tanggal') : from_date]))

//Input To Date
WebUI.click(findTestObject('FE/Backoffice/Data Export/Input - To Date'))
WebUI.selectOptionByLabel(findTestObject('FE/Backoffice/Data Export/Select - Month To'), to_month, false)
WebUI.selectOptionByLabel(findTestObject('FE/Backoffice/Data Export/Select - Year To'), to_year, false)
WebUI.click(findTestObject('FE/Backoffice/Data Export/Date - To', [('tanggal') : to_date]))

//Click button Export
WebUI.click(findTestObject('FE/Backoffice/Data Export/Button - Ekspor Data'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Subheading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Subheading'), 'Data Berhasil diekspor', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

//Replace month with number
String from_mm = CustomKeywords.'backoffice.common.replaceMonth'(from_month)
String to_mm = CustomKeywords.'backoffice.common.replaceMonth'(to_month)

//Verify file downloaded
CustomKeywords.'backoffice.common.isFileDownloaded'(file_name + from_date+'_'+from_mm+'_'+from_year+'_'+to_date+'_'+to_mm+'_'+to_year+'.xlsx')
