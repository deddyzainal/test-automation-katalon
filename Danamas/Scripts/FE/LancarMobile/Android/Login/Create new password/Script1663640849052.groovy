import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - MASUK (Home)'), 10)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Input - No Telepon'), 5)

Mobile.setText(findTestObject('FE/LancarMobile/Android/Login/Input - No Telepon'), GlobalVariable.datetime, 2)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Button - MASUK (Login)'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Link - Lupa Kata Sandi'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Input - No Telepon (Bottomsheet)'), 2)

Mobile.setText(findTestObject('FE/LancarMobile/Android/Login/Input - No Telepon (Bottomsheet)'), GlobalVariable.datetime, 2)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Button - KIRIM (Bottomsheet)'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Input - OTP'), 5)

Mobile.setText(findTestObject('FE/LancarMobile/Android/Register/Input - OTP'), GlobalVariable.datetime.substring(8), 2)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Register/Button - Submit OTP'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Input - Kata Sandi (Bottomsheet)'), 3)

Mobile.setText(findTestObject('FE/LancarMobile/Android/Login/Input - Kata Sandi (Bottomsheet)'), newPassword, 3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Input - Konfirmasi Kata Sandi (Bottomsheet)'), 3)

Mobile.setText(findTestObject('FE/LancarMobile/Android/Login/Input - Konfirmasi Kata Sandi (Bottomsheet)'), newPassword, 
    3)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Button - BUAT KATA SANDI (Bottomsheet)'), 3)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Login/Text - Success Reset Password'), 5)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Link - Redirect to Login'), 3)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Home/Button - Profile'), 5)
