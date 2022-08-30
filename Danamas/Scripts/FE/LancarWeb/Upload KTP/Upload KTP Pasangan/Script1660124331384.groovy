import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Click Upload KTP Pasangan
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Button - Upload KTP Pasangan'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Upload KTP/Button - Upload KTP Pasangan'))

// Upload file
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Video - Preview Ambil Gambar'), 10)
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Video - Preview Ambil Gambar'), 2)
WebUI.uploadFile(findTestObject('FE/LancarWeb/Upload KTP/Input - Image'), KTPpasanganFilepath)
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Button - Unggah Sekarang'), 10)
WebUI.click(findTestObject('FE/LancarWeb/Upload KTP/Button - Unggah Sekarang'))

// Input Nama Pasangan
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Nama sesuai KTP'), 3)
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Nama pasangan'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - Nama pasangan'), namaPasangan)

// Input NIK Pasangan
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - NIK'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Lengkapi KTP/Input - NIK'), NIKpasangan)

// Input Tanggal Lahir Pasangan

// Open datepicker
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Button - Open Calendar'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Lengkapi KTP/Button - Choose month and year'), 3)
WebUI.enhancedClick(findTestObject('FE/LancarWeb/Lengkapi KTP/Button - Choose month and year'))

// Select year
String yearXpath = String.format('//mat-calendar//td[contains(@aria-label, "%s")]/div[1]', dobYearPasangan)
WebUI.enhancedClick(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'("xpath", yearXpath))

// Select month
String monthXpath = String.format('//mat-calendar//td[contains(@aria-label, "%s")]/div[1]', dobMonthPasangan)
WebUI.enhancedClick(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'("xpath", monthXpath))

// Select date
String dateXpath = String.format('//mat-calendar//td/div[text()=" %s "]', dobDatePasangan)
WebUI.enhancedClick(CustomKeywords.'commonHelper.LocatorBuilder.buildTestObject'("xpath", dateXpath))

// Click KIRIM button
CustomKeywords.'webHelper.WindowHandler.fullScreenMode'()
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Lengkapi KTP/Button - KIRIM (enabled)'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Lengkapi KTP/Button - KIRIM (enabled)'))

// Verify KTP Pasangan uploaded
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Upload KTP/Icon - KTP Pasangan Uploaded'), 3)