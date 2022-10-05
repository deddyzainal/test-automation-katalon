import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Input Nama Telesales
//WebUI.setText(findTestObject('FE/Backoffice/Loan Origination/List/Input - Nama'), nama_peminjam)
CustomKeywords.'backoffice.common.setTextWithDelay'(findTestObject('FE/Backoffice/Loan Origination/List/Input - Nama Telesales'), nama_telesales)

//Verify Nama Telesales value in the list match inputted text
WebUI.delay(3)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Origination/List/TextValue - Nama Telesales'), nama_telesales, FailureHandling.STOP_ON_FAILURE)

