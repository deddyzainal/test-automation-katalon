import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

if (tujuan.toLowerCase() == "pribadi") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/RadioBtn - Tujuan Pribadi'), 10)
}
else if (tujuan.toLowerCase() == "bisnis") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/RadioBtn - Tujuan Bisnis'), 10)
}

if(agunan.toLowerCase() == "ya") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/RadioBtn - Agunan Ya'), 2)
}
else if (agunan.toLowerCase() == "tidak") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/RadioBtn - Agunan Tidak'), 2)
}

Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Checkbox - Kepemilikan Properti'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - Edit Nama Sertifikat'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Input - Nama Sertifikat'), 2)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Input - Nama Sertifikat'), pemilikSertifikat, 2)
Mobile.hideKeyboard()

// First tap to remove focus from Nama Pemilik Sertifikat input field
Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - LANJUT'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - LANJUT'), 2)

Mobile.scrollToText('SAYA SIAP MENDAPATKAN TAWARAN')
if (pekerjaan.toLowerCase() == "bisnis") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Text - Profil Bisnis'), 2)
}
else if (pekerjaan.toLowerCase() == "profesional") {
	CustomKeywords.'mobileHelper.CommonActions.swipeLeft'()
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Text - Profil Profesional'), 2)
}
else if (pekerjaan.toLowerCase() == "pegawai") {
	CustomKeywords.'mobileHelper.CommonActions.swipeLeft'()
	CustomKeywords.'mobileHelper.CommonActions.swipeLeft'()
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Text - Profil Pegawai'), 2)
}

Mobile.scrollToText('SAYA SIAP MENDAPATKAN TAWARAN')

Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - Edit Pendapatan'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Input - Pendapatan Bulanan'), 2)
Mobile.sendKeys(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Input - Pendapatan Bulanan'), pendapatan)
Mobile.hideKeyboard()

// First tap to remove focus from Pendapatan Bulanan input field
Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - Edit Pengalaman'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - Edit Pengalaman'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Input - Pengalaman'), 2)
Mobile.clearText(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Input - Pengalaman'), 2)
Mobile.sendKeys(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Input - Pengalaman'), pengalaman)
Mobile.hideKeyboard()

// First tap to remove focus from Pengalaman input field
Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - SAYA SIAP MENDAPATKAN TAWARAN'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - SAYA SIAP MENDAPATKAN TAWARAN'), 2)