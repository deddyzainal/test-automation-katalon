import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

//WebUI.openBrowser(GlobalVariable.LancarBOMS)

// Navigate to BOMS
WebUI.navigateToUrl(GlobalVariable.LancarBOMS)
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Login as Operations
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Input - Email'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Input - Email'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Input - Email'), GlobalVariable.backofficeEmail)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Input - Password'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Input - Password'), GlobalVariable.backofficePassword)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Button - Login'))

// Open Loan Assessment menu
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Menu - Loan Assessment'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Menu - Loan Assessment'))

// Open details of latest submitted loan
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Text - Latest SUBMITTED loan'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Text - Latest SUBMITTED loan'))

// Approve the loan
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Button - Lihat Detail'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/TextValue - No Pinjaman'), 10)
GlobalVariable.loanNumber = WebUI.getText(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/TextValue - No Pinjaman'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Button - Approve'), 30)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Button - Approve'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Button - Yes (Approve)'), 3)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Button - Yes (Approve)'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Text - Approved (Loan Detail)'), 10)

// Open Offer Letter menu
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Menu - Operation'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Menu - Offer Letter'), 3)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Menu - Offer Letter'))

// Login to Backoffice
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Email (Backoffice)'), 10)
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Email (Backoffice)'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Email (Backoffice)'), GlobalVariable.backofficeEmail)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Password (Backoffice)'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Password (Backoffice)'), GlobalVariable.backofficePassword)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Button - Masuk'))

// Open Offer Letter of recently approved loan
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Menu - Operation'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Menu - Operation'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Menu - Offer Letter'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Loan Assessment/Menu - Offer Letter'))
String loan = String.format('//table//*[contains(text(), "%s")]', GlobalVariable.loanNumber)
WebUI.click(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', loan))

// Edit Offer Letter
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Button - Edit (Offer Letter)'), 10)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Button - Edit (Offer Letter)'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Collateral Address'), 5)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Collateral Address'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Collateral Address'), collateralAddr)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Collateral Certificate Number'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Collateral Certificate Number'), collateralCertNo)
WebUI.clearText(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Provision Fee Rate'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Provision Fee Rate'), provisionRate)
WebUI.clearText(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Provision Fee Amount'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Provision Fee Amount'), provisionAmount)
WebUI.clearText(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Life Insurance Fee'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Life Insurance Fee'), lifeInsuranceFee)
WebUI.clearText(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Fire Insurance Fee'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Fire Insurance Fee'), fireInsuranceFee)
WebUI.clearText(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Notary Fee Amount'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Notary Fee Amount'), notaryFee)
WebUI.clearText(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Advance Penalty Rate'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Advance Penalty Rate'), advancePenalty)
WebUI.clearText(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Late Penalty Rate'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Input - Late Penalty Rate'), latePenalty)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Button - Continue (Offer Letter)'))

// Send Offer Letter document
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Button - Send Document (Offer Letter)'), 5)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Button - Send Document (Offer Letter)'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Button - Ya, kirim sekarang (Offer Letter)'), 3)
WebUI.click(findTestObject('FE/LancarWeb/BOMS/Offer Letter/Button - Ya, kirim sekarang (Offer Letter)'))

// Verify the loan ID no longer found in Offer Letter menu
WebUI.verifyElementNotPresent(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', loan), 5)