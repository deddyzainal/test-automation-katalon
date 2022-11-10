import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click Nama Telesales dropdown
WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Select - Nama Telesales'))

for(int i = 0; i < nama_telesales.size; i++) {
	WebUI.setText(findTestObject('FE/Backoffice/Loan Origination/List/Input - Nama Telesales'), nama_telesales[i])
	WebUI.delay(2)
	WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Option - Nama Telesales', [('nama_telesales') : nama_telesales[i]]))
	WebUI.setText(findTestObject('FE/Backoffice/Loan Origination/List/Input - Nama Telesales'), '')
}

WebUI.click(findTestObject('FE/Backoffice/Loan Origination/List/Select - Nama Telesales'))
WebUI.delay(3)

