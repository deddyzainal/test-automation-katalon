import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Input borrower name in Nama field
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Origination List/Input - Nama'), 3)
WebUI.click(findTestObject('FE/Backoffice/Origination List/Input - Nama'))
WebUI.setText(findTestObject('FE/Backoffice/Origination List/Input - Nama'), nama_peminjam)

//Verify name in the list contains inputted text
WebUI.waitForPageLoad(5)
WebUI.verifyMatch(WebUI.getText(findTestObject('FE/Backoffice/Origination List/TextValue - Nama')).toUpperCase(), ".*$nama_peminjam.*".toUpperCase(), true)

