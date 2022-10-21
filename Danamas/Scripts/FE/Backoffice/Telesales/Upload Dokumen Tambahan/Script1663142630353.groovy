import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String filePath = RunConfiguration.getProjectDir() + '/Data Files/Backoffice/'

WebDriver driver = DriverFactory.getWebDriver()

int count_data = driver.findElements(By.xpath('//h1[text()=" Dokumen tambahan "]/following-sibling::div/div/div/label')).size()

for (int i = 0; i < count_data; i++) {
    String doc_name = WebUI.getText(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Tambahan/Label - Nama Dokumen', 
            [('i') : i + 1]), FailureHandling.STOP_ON_FAILURE)
	
    //Upload file Dokumen Tambahan
    WebUI.scrollToElement(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Tambahan/Input - Dokumen Tambahan', [('nama_dokumen') : doc_name]), 3)
	WebUI.waitForElementClickable(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Tambahan/Input - Dokumen Tambahan', [('nama_dokumen') : doc_name]), 5, FailureHandling.STOP_ON_FAILURE)
	WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Tambahan/Input - Dokumen Tambahan', 
            [('nama_dokumen') : doc_name]), filePath + 'dokumen_tambahan.jpeg')
    WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Tambahan/Input - Dokumen Tambahan', 
            [('nama_dokumen') : doc_name]), 8, FailureHandling.STOP_ON_FAILURE)
}

