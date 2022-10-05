import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Input borrower name in Nama field
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Origination/List/Input - Nama'), 3)
//WebUI.setText(findTestObject('FE/Backoffice/Loan Origination/List/Input - Nama'), nama_peminjam)
CustomKeywords.'backoffice.common.setTextWithDelay'(findTestObject('FE/Backoffice/Loan Origination/List/Input - Nama'), nama_peminjam)

//Verify name in the list contains inputted text
WebUI.delay(3)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Origination/List/TextValue - Nama Peminjam'), nama_peminjam, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyMatch(WebUI.getText(findTestObject('FE/Backoffice/Loan Origination/List/TextValue - Nama Peminjam')).toUpperCase(), ".*$nama_peminjam.*".toUpperCase(), true)

