import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

// Select Tujuan Pinjaman, accepts: "pribadi", "bisnis"
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Tujuan Pribadi'), 5)
if(tujuan.toLowerCase() == "pribadi") {
	WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Tujuan Pribadi'))
} else if(tujuan.toLowerCase() == "bisnis") {
	WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Tujuan Bisnis'))
}

// Select Sertifikat Agunan, accepts: "ya", "tidak"
if(agunan.toLowerCase() == "ya") {
	WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Agunan Ya'))
} else if (agunan.toLowerCase() == "tidak") {
	WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Agunan Tidak'))
}

// Select SHM as Jenis Sertifikat
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Checkbox - Sertifikat Kepemilikan'))

// Input Nama Pemilik Sertifikat
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Nama Pemilik Sertifikat'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Nama Pemilik Sertifikat'), pemilikSertifikat)

// Lanjut
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Button - Lanjut'))

// Select Pekerjaan, accepts: "bisnis", "profesional", "pegawai"
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Profil Kustomer/Text - Saya memiliki bisnis'), 5)
if(pekerjaan.toLowerCase() == "bisnis") {
	WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Text - Saya memiliki bisnis'))
} else if(pekerjaan.toLowerCase() == "profesional") {
	WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Text - Saya pekerja profesional'))
} else if(pekerjaan.toLowerCase() == "pegawai") {
	WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Text - Saya pegawai tetap'))
}

// Input Pendapatan Bulanan
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Button - Edit Pendapatan Bulanan'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Pendapatan Bulanan'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Pendapatan Bulanan'))
WebUI.clearText(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Pendapatan Bulanan'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Pendapatan Bulanan'), pendapatanBulanan)

// Input lama pengalaman
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Button - Edit Pengalaman'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Pengalaman'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Pengalaman'))
WebUI.clearText(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Pengalaman'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Pengalaman'), pengalaman)

// Saya siap mendapatkan tawaran
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Button - SAYA SIAP MENDAPATKAN TAWARAN'))

// Verify leaving Profil Kustomer page
WebUI.verifyElementNotPresent(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Tujuan Pribadi'), 5)
