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

// Select BPKB Mobil and Motor as Jenis Sertifikat
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Checkbox - BPKB Mobil'))
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Checkbox - BPKB Motor'))

// Lanjut
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Button - Lanjut'))

// Verify Popup Proses dengan BPKB and proceed
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Profil Kustomer/Popup - Proses dengan BPKB'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Button - UBAH AGUNAN'))
WebUI.waitForElementNotVisible(findTestObject('FE/LancarWeb/Profil Kustomer/Popup - Proses dengan BPKB'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Button - Lanjut'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Profil Kustomer/Popup - Proses dengan BPKB'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Button - KIRIM LANJUT'))

// Verify Popup Agunan terkirim
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Profil Kustomer/Popup - Agunan terkirim'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Profil Kustomer/Button - KEMBALI KE BERANDA'))

// Verify leaving Profil Kustomer page
WebUI.verifyElementNotPresent(findTestObject('FE/LancarWeb/Profil Kustomer/RadioBtn - Tujuan Pribadi'), 5)
