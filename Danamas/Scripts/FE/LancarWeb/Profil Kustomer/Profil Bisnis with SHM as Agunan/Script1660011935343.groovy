import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Select Tujuan Bisnis
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Tujuan Bisnis'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Tujuan Bisnis'))

// Select Ya for Agunan
if(agunan.toLowerCase() == "ya") {
	WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Agunan Ya'))
} else if (agunan.toLowerCase() == "tidak") {
	WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Agunan Tidak'))
}
//WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Agunan Ya'))

// Select SHM as Jenis Sertifikat
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Checkbox - Sertifikat Kepemilikan'))

// Input Nama Pemilik Sertifikat
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Nama Pemilik Sertifikat'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Profil Kustomer/Input - Nama Pemilik Sertifikat'), pemilikSertifikat)

// Lanjut
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Button - Lanjut'))

// Select Profil Bisnis
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Profil Kustomer/Text - Saya memiliki bisnis'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Text - Saya memiliki bisnis'))

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
