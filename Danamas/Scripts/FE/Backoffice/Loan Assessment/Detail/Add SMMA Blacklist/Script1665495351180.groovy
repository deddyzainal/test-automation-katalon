import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open tab Cek SMMA Blacklist
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Tab - Cek SMMA Blacklist'))

WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/Label - SMMA Blacklist'), 5, FailureHandling.STOP_ON_FAILURE)

//Count data table before adding new data
WebDriver driver = DriverFactory.getWebDriver()
int prev_data = driver.findElements(By.xpath('//app-table-smma-blacklist//tbody/tr')).size()

//Click button Tambah Data
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/Button - Tambah Data'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/Button - Tambah Data'))

//Input Nama
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/Input - Nama'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/Input - Nama'), nama)

//Input NIK
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/Input - NIK'), nik)

//Input Nomor HP
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/Input - Nomor HP'), nomor_hp)

//Select Hubungan dengan debitur
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/Select - Hubungan'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/Option - Hubungan', [('hubungan') : hubungan]))

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/Button - Simpan'))

//Verify success snackbar is shown
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Sukses !', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/TextValue - Nama'), 3)

//Count data table after adding new data
int current_data = driver.findElements(By.xpath('//app-table-smma-blacklist//tbody/tr')).size()

//Verify data is added on the list
WebUI.verifyEqual(current_data, prev_data + 1, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/TextValue - Nama'), nama, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/TextValue - NIK'), nik, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/TextValue - Nomor HP'), '0' + nomor_hp, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Cek SMMA Blacklist/TextValue - Hubungan'), hubungan, FailureHandling.STOP_ON_FAILURE)