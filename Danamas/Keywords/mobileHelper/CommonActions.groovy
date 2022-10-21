package mobileHelper

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.util.KeywordUtil

import io.appium.java_client.AppiumDriver

class CommonActions {

	AppiumDriver driver = MobileDriverFactory.getDriver()

	@Keyword
	def closeCurrentApp() {
		String currentPackage = driver.getCurrentPackage()
		driver.terminateApp(currentPackage)
	}

	int devHeight = Mobile.getDeviceHeight()
	int devWidth = Mobile.getDeviceWidth()

	@Keyword
	def swipeLeft() {
		int startX = devWidth * 0.8
		int endX = devWidth * 0.2
		int startY = devHeight * 0.5
		int endY = startY

		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeRight() {
		int startX = devWidth * 0.2
		int endX = devWidth * 0.8
		int startY = devHeight * 0.5
		int endY = startY

		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeUp() {
		int startX = devWidth * 0.5
		int endX = startX
		int startY = devHeight * 0.8
		int endY = devHeight * 0.2

		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeDown() {
		int startX = devWidth * 0.5
		int endX = startX
		int startY = devHeight * 0.2
		int endY = devHeight * 0.8

		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def pickDate(String dobDate, String dobMonth, String dobYear) {

		Integer dateSpinnerPosition = Mobile.getElementLeftPosition(findTestObject('FE/LancarMobile/Android/Upload KTP/Datepicker - Day'), 3)
		Integer monthSpinnerPosition = Mobile.getElementLeftPosition(findTestObject('FE/LancarMobile/Android/Upload KTP/Datepicker - Month'), 3)
		Integer yearSpinnerPosition = Mobile.getElementLeftPosition(findTestObject('FE/LancarMobile/Android/Upload KTP/Datepicker - Year'), 3)
		Integer midOverlayTop = Mobile.getElementTopPosition(findTestObject('FE/LancarMobile/Android/Upload KTP/Datepicker - Mid Overlay'), 3)
		Integer midOverlayHeight = Mobile.getElementHeight(findTestObject('FE/LancarMobile/Android/Upload KTP/Datepicker - Mid Overlay'), 3)

		KeywordUtil.logInfo(midOverlayTop.toString())
		KeywordUtil.logInfo(midOverlayHeight.toString())

		Integer startDate = 1
		while (startDate < dobDate.toInteger()) {
			Mobile.tapAtPosition(dateSpinnerPosition + 5, midOverlayTop + midOverlayHeight * 0.75)
			Mobile.delay(0.25)
			startDate++
		}

		Integer startMonth = 1
		while (startMonth < dobMonth.toInteger()) {
			Mobile.tapAtPosition(monthSpinnerPosition + 10, midOverlayTop + midOverlayHeight * 0.75)
			Mobile.delay(0.25)
			startMonth++
		}

		Integer startYear = 1970
		Integer i = 1
		Integer delta = dobYear.toInteger() - startYear
		while (i <= delta) {
			Mobile.tapAtPosition(yearSpinnerPosition +5, midOverlayTop + midOverlayHeight * 0.75)
			Mobile.delay(0.25)
			i++
		}

		Mobile.tap(findTestObject('FE/LancarMobile/Android/Upload KTP/Button - PILIH (Datepicker)'), 3)
	}
}