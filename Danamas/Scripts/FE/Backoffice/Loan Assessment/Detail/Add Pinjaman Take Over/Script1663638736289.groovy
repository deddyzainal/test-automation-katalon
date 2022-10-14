import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Count data table before adding new data
WebDriver driver = DriverFactory.getWebDriver()
int prev_data = driver.findElements(By.xpath('//app-detail-pinjaman-tab/div/div/div[1]/div/div[3]/div//app-table-pinjaman-take-over//tbody/tr')).size()

//Click button Tambah Data
WebUI.scrollToElement(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Button - Tambah Data Daftar Pinjaman'), 2)
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Button - Tambah Data Daftar Pinjaman'))

//Input Nama Bank
WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Input - Nama Bank'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Input - Nama Bank'), nama_bank)

//Select Jenis Fasilitas
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Select - Jenis Fasilitas'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Option - Jenis Fasilitas', [('jenis_fasilitas') : jenis_fasilitas]))

//Input Original Plafon
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Input - Original Plafon'), original_plafon)

//Select Secured/Unsecured
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Select - Secured Unsecured'))
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Option - Secured Unsecured', [('secure_type') : secure_type]))

//Input Outstanding Pinjaman
WebUI.setText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Input - Outstanding Pinjaman'), outstanding_pinjaman)

//Click button Simpan
WebUI.click(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/Button - Simpan'))

//Count data table after adding new data
int current_data = driver.findElements(By.xpath('//app-detail-pinjaman-tab/div/div/div[1]/div/div[3]/div//app-table-pinjaman-take-over//tbody/tr')).size()

//Verify new data is added  and verify some values on the table
WebUI.verifyEqual(current_data, prev_data + 1, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/TextValue - Nama Bank'), nama_bank, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/TextValue - Jenis Fasilitas'), jenis_fasilitas, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('FE/Backoffice/Loan Assessment/Detail/Detail Pinjaman/Pinjaman Take Over/TextValue - Secured Unsecured'), secure_type, FailureHandling.STOP_ON_FAILURE)