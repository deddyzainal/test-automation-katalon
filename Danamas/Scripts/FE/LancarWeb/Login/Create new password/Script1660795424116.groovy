import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


// Click Masuk button
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Button - Masuk'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Home/Button - Masuk'))

// Input Nomor Telepon
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Input - Nomor Telepon'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Login/Input - Nomor Telepon'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Login/Input - Nomor Telepon'), nomorTelepon)

// Click MASUK button
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Login/Button - MASUK (enabled)'))

// Click Lupa Kata Sandi link
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Link - Lupa Kata Sandi'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Login/Link - Lupa Kata Sandi'))

// Input OTP
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Input - OTP'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Login/Input - OTP'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Login/Input - OTP'), nomorTelepon.substring(8))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Button - KIRIM OTP (enabled)'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Login/Button - KIRIM OTP (enabled)'))

// Input new password
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Input - New Password'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Login/Input - New Password'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Login/Input - New Password'), newPassword)

// Input confirmation of new password
WebUI.click(findTestObject('FE/LancarWeb/Login/Input - Confirm New Password'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Login/Input - Confirm New Password'), newPassword)

// Submit new password
WebUI.click(findTestObject('FE/LancarWeb/Login/Button - BUAT KATA SANDI'))

// Verify new password success popup
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Text - Kata sandi Anda berhasil dibuat'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Login/Button - Close Password Popup'))

// Verify leaving Login page
WebUI.verifyElementNotPresent(findTestObject('FE/LancarWeb/Login/Input - Nomor Telepon'), 5)

//Handle Kalkulator Properti tooltip
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - Tooltip OK'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - Tooltip OK'))

// Navigate to Home page
WebUI.click(findTestObject('FE/LancarWeb/Home/Image - Logo Lancar'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Home/Icon - Profile'), 5)