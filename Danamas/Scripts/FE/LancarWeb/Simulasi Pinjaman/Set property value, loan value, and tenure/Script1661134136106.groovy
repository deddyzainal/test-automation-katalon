import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Handle tooltip
Integer i = 0
while (i<=1) {
	if(WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - Tooltip OK'), 5)) {
		WebUI.click(findTestObject('FE/LancarWeb/Kalkulator Properti/Button - Tooltip OK'))
	}
	i++
}

// Edit Nilai Properti value to maximum
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Button - Edit Nilai Minimum Properti'), 5)
WebUI.click(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Button - Edit Nilai Minimum Properti'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Nilai Minimum Properti'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Nilai Minimum Properti'))
WebUI.clearText(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Nilai Minimum Properti'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Nilai Minimum Properti'), nilaiProperti)

// Edit Nilai Pinjaman value to be acceptable
WebUI.click(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Button - Edit Nilai Pinjaman'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Nilai Pinjaman'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Nilai Pinjaman'))
WebUI.clearText(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Nilai Pinjaman'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Nilai Pinjaman'), nilaiPinjaman)

// Get value of Pembayaran Bulanan
String pembayaranAwal = WebUI.getText(findTestObject('FE/LancarWeb/Simulasi Pinjaman/TextValue - Pembayaran Bulanan'))

// Edit Tenor to maximum value
WebUI.click(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Button - Edit Tenor'))
WebUI.waitForElementVisible(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Tenor'), 2)
WebUI.click(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Tenor'))
WebUI.clearText(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Tenor'))
WebUI.sendKeys(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Input - Tenor'), tenor)

// Compare value of Pembayaran Bulanan after Tenor set to maximum
String pembayaranBaru = WebUI.getText(findTestObject('FE/LancarWeb/Simulasi Pinjaman/TextValue - Pembayaran Bulanan'))
WebUI.verifyNotMatch(pembayaranAwal, pembayaranBaru, false)

// Click button SETUJU, SELANJUTNYA
WebUI.click(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Button - SETUJU, SELANJUTNYA'))

// Verify leaving Simulasi Pinjaman page
WebUI.verifyElementNotPresent(findTestObject('FE/LancarWeb/Simulasi Pinjaman/Button - SETUJU, SELANJUTNYA'), 10)