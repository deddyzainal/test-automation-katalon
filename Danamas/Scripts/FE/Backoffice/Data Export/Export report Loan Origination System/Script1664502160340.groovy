import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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
WebUI.click(findTestObject('FE/Backoffice/Data Export/Button - Export'))

WebUI.delay(5)

String fileName = ''

if(tipe_dokumen == 'User Management') {
	fileName = 'User_Management_Report_V1_'
}
else if(tipe_dokumen == 'Loan Origination System') {
	fileName = 'LOS_Report_V1_'
}
else if(tipe_dokumen == 'Loan Assessment System') {
	fileName = 'LAS_REPORT_V1_'
}
else if(tipe_dokumen == 'Sales') {
	fileName = 'Sales_'
}
else if(tipe_dokumen == 'DanaExpress') {
	fileName = 'DE_Report_'
}
else if(tipe_dokumen == 'Telesales') {
	fileName = 'Telesales_Report_'
}
else if(tipe_dokumen == 'Loan Origination - Submitted') {
	fileName = 'LOS_Submitted_Report_'
}

//Replace month with number
String from_mm = CustomKeywords.'backoffice.common.replaceMonth'(from_month)
String to_mm = CustomKeywords.'backoffice.common.replaceMonth'(to_month)

//Verify file downloaded
CustomKeywords.'backoffice.common.isFileDownloaded'(fileName + from_date+'_'+from_mm+'_'+from_year+'_'+to_date+'_'+to_mm+'_'+to_year+'.xlsx')
