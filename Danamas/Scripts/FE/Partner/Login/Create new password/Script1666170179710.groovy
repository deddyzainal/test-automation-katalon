import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Click Masuk button
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/button_Masuk'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/button_Masuk'))

// Click Lupa Kata Sandi link
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/a_Lupa kata sandi Anda'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/a_Lupa kata sandi Anda'))

// Input Nomor Telepon
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/input_Nomor HP'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/input_Nomor HP'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Login/input_Nomor HP'), nomorhp)

// Click MASUK button
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Login/button_Meminta Kode Rahasia'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/button_Meminta Kode Rahasia'))

WebUI.delay(20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FE/PARTNER/Register/input_OTP_1'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Register/input_OTP_1'), 
    nomorhp.substring(8))

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('FE/PARTNER/Login/input_otp'))
//WebUI.sendKeys(findTestObject('FE/PARTNER/Login/input_otp'), nomorhp.substring(6))
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Register/button_Lanjut (1)'), 5)

WebUI.click(findTestObject('FE/PARTNER/Register/button_Lanjut (1)'))

// Input new password
WebUI.waitForElementVisible(findTestObject('FE/PARTNER/Profil/input_Kata Sandi Baru'), 5)

WebUI.click(findTestObject('FE/PARTNER/Profil/input_Kata Sandi Baru'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_Kata Sandi Baru'), newPassword)

// Input confirmation of new password
WebUI.click(findTestObject('FE/PARTNER/Profil/input_Ketik Ulang Kata Sandi Baru'))

WebUI.sendKeys(findTestObject('FE/PARTNER/Profil/input_Ketik Ulang Kata Sandi Baru'), newPassword)

// Submit new password
WebUI.click(findTestObject('FE/PARTNER/Login/button_Perbarui Kata Sandi'))

// Verify new password success popup
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Login/Text - Kata sandi Anda berhasil dibuat'), 5)

WebUI.click(findTestObject('FE/PARTNER/Login/button_Kembali ke Halaman Utama'), FailureHandling.STOP_ON_FAILURE)

