import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable as GlobalVariable

//Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

// Input Nama sesuai KTP
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - Nama sesuai KTP'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - Nama sesuai KTP'), namaKTP, 3)
Mobile.hideKeyboard()

// Input NIK
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - NIK No'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - NIK No'), nik, 3)
Mobile.hideKeyboard()

// Input Nama Ibu Kandung
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - Nama Ibu Kandung'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - Nama Ibu Kandung'), namaIbuKandung, 3)
Mobile.hideKeyboard()

// Select Jenis Kelamin
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Select - Jenis Kelamin'), 3)
if (jenisKelamin.toLowerCase() == 'laki-laki') {
    Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Laki-laki'), 3)
	if (Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Laki-laki'), 3, FailureHandling.OPTIONAL)) {
		Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Laki-laki'), 3)
	}
} else if (jenisKelamin.toLowerCase() == 'perempuan') {
    Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Perempuan'), 3)
	if (Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Perempuan'), 3, FailureHandling.OPTIONAL)) {
		Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Perempuan'), 3)
	}
}

// Select Status Perkawinan
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Select - Status Perkawinan'), 3)
if (statusPerkawinan.toLowerCase() == 'belum kawin') {
    Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Belum Kawin'), 3)
} else if (statusPerkawinan.toLowerCase() == 'kawin') {
    Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Kawin'), 3)
} else if (statusPerkawinan.toLowerCase() == 'cerai hidup') {
    Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Cerai Hidup'), 3)
} else if (statusPerkawinan.toLowerCase() == 'cerai mati') {
    Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Cerai Mati'), 3)
}

// Select Tanggal Lahir
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - Open Datepicker'), 3)
CustomKeywords.'mobileHelper.CommonActions.pickDate'(dobTanggal, dobBulan, dobTahun)

// Input Tempat Lahir
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - Tempat Lahir'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - Tempat Lahir'), tempatLahir, 2)
Mobile.hideKeyboard()

// Select Pendidikan Terakhir
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Select - Pendidikan Terakhir'), 3)
if (pendidikan.toLowerCase() == "sd") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - SD'), 3)
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - SD'), 3, FailureHandling.OPTIONAL)
} else if (pendidikan.toLowerCase() == "smp") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - SMP'), 3)
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - SMP'), 3, FailureHandling.OPTIONAL)
} else if (pendidikan.toLowerCase() == "sma") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - SMA'), 3)
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - SMA'), 3, FailureHandling.OPTIONAL)
} else if (pendidikan.toLowerCase() == "diploma") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Diploma'), 3)
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Diploma'), 3, FailureHandling.OPTIONAL)
} else if (pendidikan.toLowerCase() == "sarjana") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Sarjana'), 3)
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Sarjana'), 3, FailureHandling.OPTIONAL)
} else if (pendidikan.toLowerCase() == "magister" || "master") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Magister master'), 3)
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Magister master'), 3, FailureHandling.OPTIONAL)
} else if (pendidikan.toLowerCase() == "doktor") {
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Doktor'), 3)
	Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Option - Doktor'), 3, FailureHandling.OPTIONAL)
}

// Input Alamat sesuai KTP
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - Alamat sesuai KTP'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - Alamat sesuai KTP'), alamatKTP, 3)
Mobile.hideKeyboard()

// Input RT
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - RT'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - RT'), rt, 3)
Mobile.hideKeyboard()

// Input RW
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - RW'), 3)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Upload KTP/Input - RW'), rw, 3)
Mobile.hideKeyboard()

Mobile.scrollToText('Alamat domisili berbeda dengan alamat yang terdapat di KTP')

// Select Provinsi
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Select - Provinsi'), 3)
Mobile.scrollToText(provinsi)
String provinceLoc = String.format('//hierarchy//*[@class = "android.widget.TextView" and contains(@text, "%s")]', provinsi)
Mobile.tap(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', provinceLoc), 3)
Mobile.tap(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', provinceLoc), 3, FailureHandling.OPTIONAL)
Mobile.waitForElementPresent(findTestObject('FE/LancarMobile/Android/Upload KTP/Select - Kota Kabupaten'), 10, FailureHandling.STOP_ON_FAILURE)

// Select Kabupaten
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Select - Kota Kabupaten'), 3)
Mobile.scrollToText(kotaKabupaten)
String kotaKabupatenLoc = String.format('//hierarchy//*[@class = "android.widget.TextView" and contains(@text, "%s")]', kotaKabupaten)
Mobile.tap(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kotaKabupatenLoc), 3)
Mobile.tap(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kotaKabupatenLoc), 3, FailureHandling.OPTIONAL)
Mobile.waitForElementPresent(findTestObject('FE/LancarMobile/Android/Upload KTP/Select - Kota Kabupaten'), 10, FailureHandling.STOP_ON_FAILURE)

// Select Kecamatan
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Select - Kecamatan'), 3)
Mobile.scrollToText(kecamatan)
String kecamatanLoc = String.format('//hierarchy//*[@class = "android.widget.TextView" and contains(@text, "%s")]', kecamatan)
Mobile.tap(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kecamatanLoc), 3)
Mobile.tap(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kecamatanLoc), 3, FailureHandling.OPTIONAL)
Mobile.waitForElementPresent(findTestObject('FE/LancarMobile/Android/Upload KTP/Select - Kecamatan'), 10, FailureHandling.STOP_ON_FAILURE)

// Select Kelurahan
Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Select - Kelurahan'), 3)
Mobile.scrollToText(kelurahan)
String kelurahanLoc = String.format('//hierarchy//*[@class = "android.widget.TextView" and contains(@text, "%s")]', kelurahan)
Mobile.tap(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kelurahanLoc), 3)
Mobile.tap(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', kelurahanLoc), 3, FailureHandling.OPTIONAL)
Mobile.delay(1)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - DAFTAR'), 3)

String nikTemplate = "//*[@class = 'android.widget.TextView' and @text = 'No. NIK : %s']"
String nikLoc = String.format(nikTemplate, nik)
Mobile.verifyElementVisible(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'('xpath', nikLoc), 10)