package backoffice

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class common {

	@Keyword
	def fillLoginForm(String email, String password) {
		WebUI.openBrowser(GlobalVariable.url)
		WebUI.maximizeWindow()
		WebUI.setText(findTestObject('FE/Backoffice/Login/Input - Email'), email)
		WebUI.setEncryptedText(findTestObject('FE/Backoffice/Login/Input - Password'), password)
		WebUI.click(findTestObject('FE/Backoffice/Login/Button - Masuk'))
		WebUI.waitForPageLoad(5)
	}

	@Keyword
	def setTextWithDelay(TestObject to, String text) {
		for (int i = 0; i < text.length(); i++) {
			String text_char = text.charAt(i)
			WebUI.sendKeys(to, text_char)
			Thread.sleep(10)
		}
	}

	@Keyword
	public boolean isFileDownloaded(String fileName) {
		String home = System.getProperty('user.home')
		String downloadPath = new File(home + '/Downloads/')
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();
		String lastAttempt = '';
		if (dirContents.length > 0) {
			for (int i = 0; i < dirContents.length; i++) {
				if (dirContents[i].getName().equals(fileName)) {
					// File has been found, it can now be deleted:
					dirContents[i].delete();
					KeywordUtil.markPassed(fileName + ' exist in ' + downloadPath + ' and was deleted')
					return true;
				}
				lastAttempt = dirContents[i].getName().equals(fileName);
			}
			if (lastAttempt != fileName) {
				KeywordUtil.markFailed(fileName + ' does not exist in ' + downloadPath)
				return false;
			}
		}
		return false;
	}

	@Keyword
	def replaceMonth(String month) {
		switch (month) {
			case 'Januari':
				month = "01"
				break

			case 'Februari':
				month = "02"
				break

			case 'Maret':
				month = "03"
				break

			case 'April':
				month = "04"
				break

			case 'Mei':
				month = "05"
				break

			case 'Juni':
				month = "06";
				break

			case 'Juli':
				month = "07";
				break

			case 'Agustus':
				month = "08"
				break

			case 'September':
				month = "09"
				break

			case 'Oktober':
				month = "10";
				break

			case 'November':
				month = "11";
				break

			case 'December':
				month = "12";
				break
		}
		return month
	}
}
