import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


//Click button Tambah Data Keluarga
WebUI.click(findTestObject('FE/Backoffice/Customer Management/Detail/Informasi Keluarga/Button - Tambah Data Keluarga'))

WebDriver driver = DriverFactory.getWebDriver()
int count_data = driver.findElements(By.xpath('//app-quick-access/div/div')).size()





