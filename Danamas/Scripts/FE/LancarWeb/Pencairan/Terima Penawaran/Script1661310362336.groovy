import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

// Open Lancar Web
WebUI.navigateToUrl(GlobalVariable.LancarWeb)
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()

// Open received offer letter
WebUI.scrollToElement(findTestObject('FE/LancarWeb/Home/Button - Lanjutkan Pengajuan'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Home/Button - Lanjutkan Pengajuan'))

// Accept the offer letter
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Pencairan/Button - AMBIL PINJAMAN'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Pencairan/Button - AMBIL PINJAMAN'))

// Send OTP to confirm acceptance
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Input - OTP'), 5)
String mobileNumber = WebUI.getText(findTestObject('FE/LancarWeb/Login/TextValue - Mobile Number OTP'))
String otp = mobileNumber.substring(11)
WebUI.sendKeys(findTestObject('FE/LancarWeb/Login/Input - OTP'), otp)
WebUI.click(findTestObject('FE/LancarWeb/Login/Button - KIRIM OTP (enabled)'))