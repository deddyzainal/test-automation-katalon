package webHelper
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory


class WindowHandler {

	@Keyword
	def fullScreenMode() {
		WebDriver driver = DriverFactory.getWebDriver()
		driver.manage().window().fullscreen()
	}
}