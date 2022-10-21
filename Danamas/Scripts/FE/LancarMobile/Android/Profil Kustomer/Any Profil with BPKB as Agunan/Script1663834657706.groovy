import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

if (tujuan.toLowerCase() == "pribadi") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/RadioBtn - Tujuan Pribadi'), 2)
}
else if (tujuan.toLowerCase() == "bisnis") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/RadioBtn - Tujuan Bisnis'), 2)
}

if(agunan.toLowerCase() == "ya") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/RadioBtn - Agunan Ya'), 2)
}
else if (agunan.toLowerCase() == "tidak") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/RadioBtn - Agunan Tidak'), 2)
}

Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Checkbox - BPKB Mobil'), 2)
Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Checkbox - BPKB Motor'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - LANJUT'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - UBAH AGUNAN'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - LANJUT'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - IZINKAN LANJUT'), 2)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Profil Kustomer/Button - KEMBALI KE BERANDA'), 4)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Home/Button - COBA SEKARANG 1'), 3)