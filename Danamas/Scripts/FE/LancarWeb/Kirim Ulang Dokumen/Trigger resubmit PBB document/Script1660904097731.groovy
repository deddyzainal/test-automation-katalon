import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open Loan Assessment V2 menu
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Menu - Loan Assessment V2'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Menu - Loan Assessment V2'))

//Assign the loan to stg_ca
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Checkbox - Latest created Loan'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Checkbox - Latest created Loan'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Button - Tugaskan'), 2)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Button - Tugaskan'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Select - Assign Credit Analyst'), 2)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Select - Assign Credit Analyst'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Option - stg_ca'), 2)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Option - stg_ca'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Button - Tugaskan (popup) (enabled)'), 2)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Button - Tugaskan (popup) (enabled)'))

// Open the loan detail
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Text - Latest created Loan ID'), 20)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Text - Latest created Loan ID'))

// Request PBB document resubmission
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Text - Dokumen Agunan section'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Text - Dokumen Agunan section'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Button - PBB Resubmission'), 5)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Button - PBB Resubmission'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Select - Alasan Resubmission'), 3)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Select - Alasan Resubmission'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Option - Low quality'), 2)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Option - Low quality'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Button - Minta Kirim Ulang'), 2)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Button - Minta Kirim Ulang'))

// Verify resubmission request success message is displayed
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Text - Resubmission request success'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Button - Kembali'))
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()