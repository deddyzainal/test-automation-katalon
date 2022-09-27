package mobileHelper

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

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
		int startY = devHeight * 0.2
		int endY = devHeight * 0.8

		Mobile.swipe(startX, startY, endX, endY)
	}

	@Keyword
	def swipeDown() {
		int startX = devWidth * 0.5
		int endX = startX
		int startY = devHeight * 0.8
		int endY = devHeight * 0.2

		Mobile.swipe(startX, startY, endX, endY)
	}
}