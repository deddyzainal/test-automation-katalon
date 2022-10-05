import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Click button Edit Data
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Button - Edit Data'))

WebUI.waitForPageLoad(3)

WebDriver driver = DriverFactory.getWebDriver()
int count_data = driver.findElements(By.xpath('//app-quick-access/div/div')).size() - 1

if (count_data > 0) {
	//Input Nama
	WebUI.scrollToElement(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Input - Nama', [('no') : count_data]), 2)
	WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Input - Nama', [('no') : count_data]), nama)
	
	//Input NIK
	WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Input - NIK', [('no') : count_data]), nik)
	
	//Select Status Pernikahan
	WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Select - Status Pernikahan', [('no') : count_data]))
	WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Option - Status Pernikahan', [('no') : count_data, ('status_pernikahan'):status_pernikahan]))
	
	//Select Hubungan
	WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Select - Hubungan', [('no') : count_data]))
	WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Option - Hubungan', [('no') : count_data, ('hubungan'):hubungan]))
	
	//Input Tanggal Lahir
	//WebUI.setText(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Input - Tanggal Lahir', [('no') : count_data]), tanggal_lahir)
	
	//Click button Simpan
	WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Button - Simpan'))
	
	//Verify success snackbar is shown
	WebUI.waitForElementVisible(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 5)
	//WebUI.verifyElementText(findTestObject('FE/Backoffice/Common/Snackbar - Heading'), 'Sukses Mengubah Informasi Keluarga', FailureHandling.STOP_ON_FAILURE)
	
}




