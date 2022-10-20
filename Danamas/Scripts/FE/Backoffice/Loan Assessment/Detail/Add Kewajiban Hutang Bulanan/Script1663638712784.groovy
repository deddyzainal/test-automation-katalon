import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Count data table before adding new data
WebDriver driver = DriverFactory.getWebDriver()
int prev_data = driver.findElements(By.xpath('//app-detail-pinjaman-tab/div/div/div[1]/div/div[3]/div/div/div/app-table-kewajiban-hutang-bulanan//tbody/tr')).size()

//Click button Tambah Data
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Button - Tambah Data Kewajiban Hutang'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Button - Tambah Data Kewajiban Hutang'))

//Input Nama Lembaga Keuangan
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Input - Nama Lembaga Keuangan'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Input - Nama Lembaga Keuangan'), nama_lembaga_keuangan)

//Input Cicilan Perbulan
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Input - Cicilan Perbulan'), cicilan_perbulan)

//Input Original Plafon
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Input - Original Plafon'), original_plafon)

//Select Secured/Unsecured
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Select - Secured Unsecured'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Option - Secured Unsecured', [('secure_type') : secure_type]))

//Input Outstanding Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Input - Outstanding Pinjaman'), outstanding_pinjaman)

//Select Jenis Fasilitas
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Select - Jenis Fasilitas'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Option - Jenis Fasilitas', [('jenis_fasilitas') : jenis_fasilitas]))

//Input Tenor Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Input - Tenor Pinjaman'), tenor_pinjaman)

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/Button - Simpan'))

//Count data table after adding new data
int current_data = driver.findElements(By.xpath('//app-detail-pinjaman-tab/div/div/div[1]/div/div[3]/div/div/div/app-table-kewajiban-hutang-bulanan//tbody/tr')).size()

//Verify new data is added  and verify some values on the table
WebUI.verifyEqual(current_data, prev_data + 1, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/TextValue - Nama Lembaga Keuangan'), nama_lembaga_keuangan, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/TextValue - Jenis Fasilitas'), jenis_fasilitas, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/TextValue - Tenor Pinjaman'), tenor_pinjaman, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Kewajiban Hutang/TextValue - Secured Unsecured'), secure_type, FailureHandling.STOP_ON_FAILURE)