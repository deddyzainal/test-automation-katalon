import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Button - LANJUTKAN PROSES'), 5)

Mobile.scrollToText('HUBUNGI TIM LANCAR')

Mobile.tap(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Button - AMBIL PINJAMAN'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Input - OTP'), 5)

String otp = GlobalVariable.datetime.drop(8)

Mobile.setText(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Input - OTP'), otp, 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Button - Submit OTP'), 3)

//Mobile.verifyElementExist(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Button - TAMBAH REKENING BANK'), 15)

Mobile.delay(3)

Mobile.scrollToText('*Pencairan hanya bisa dilakukan melalui Bank Sinarmas')

Mobile.tap(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Button - TAMBAH REKENING BANK'), 3)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Input - Nomor Rekening'), 5)

Mobile.setText(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Input - Nomor Rekening'), noRekening, 3)

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/TextValue - Pemegang Akun (Bottomsheet)'), 10, FailureHandling.STOP_ON_FAILURE)

a = 0
while(Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Button - KONFIRMASI DETAIL'), 2, FailureHandling.OPTIONAL) && a<10) {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/Button - KONFIRMASI DETAIL'), 2, FailureHandling.OPTIONAL)
}

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/TextValue - Submitted Account Number'), 10)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Pencairan Pinjaman/TextValue - Submitted Account Holder'), 10)