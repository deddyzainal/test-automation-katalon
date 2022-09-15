import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//WebUI.callTestCase(findTestCase('FE/Backoffice/Login/Login with valid credential'), [:])
//WebUI.callTestCase(findTestCase('FE/Backoffice/Side Menu/Click menu Task List'), [:])
//WebUI.callTestCase(findTestCase('FE/Backoffice/Side Menu/Click menu Telesales'), [:])
//WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Filter list by ID Pinjaman'), [('id_pinjaman') : 'KC-KFO-0922-13-0004'])
//WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Open detail'), [:])
//WebUI.callTestCase(findTestCase('FE/Backoffice/Telesales/Click Edit Data'), [:])

WebDriver driver = DriverFactory.getWebDriver()
int count_data = driver.findElements(By.xpath('//h1[text()=" Dokumen tambahan "]/following-sibling::div/div/div/label')).size()

for (int i = 0; i < count_data; i++) {
    String doc_name = WebUI.getText(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Tambahan/Label - Nama Dokumen', 
            [('i') : i + 1]), FailureHandling.STOP_ON_FAILURE)

    //Upload Dokumen Tambahan
    WebUI.scrollToElement(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Tambahan/Input - Dokumen Tambahan', [('nama_dokumen') : doc_name]), 3)
    WebUI.uploadFileWithDragAndDrop(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Tambahan/Input - Dokumen Tambahan', [('nama_dokumen') : doc_name]), dokumen_tambahan)
    WebUI.waitForElementNotVisible(findTestObject('FE/Backoffice/Telesales/Edit/Dokumen Tambahan/Input - Dokumen Tambahan', [('nama_dokumen') : doc_name]), 8, FailureHandling.STOP_ON_FAILURE)
    	
}

