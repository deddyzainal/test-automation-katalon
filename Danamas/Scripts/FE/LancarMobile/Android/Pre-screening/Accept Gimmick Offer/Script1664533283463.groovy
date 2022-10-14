import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

//Mobile.startExistingApplication(GlobalVariable.packageId)

// Verify pre-screening loading screen is displayed
Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Pre-screening/Text - Pre-screening Loading'), 10)

// Tap YA button on NPS rating screen
Mobile.tap(findTestObject('FE/LancarMobile/Android/Pre-screening/Button - YA (Rating)'), 60, FailureHandling.STOP_ON_FAILURE)

// Tap AMBIL PENAWARAN button
Mobile.tap(findTestObject('FE/LancarMobile/Android/Pre-screening/Button - AMBIL PENAWARAN'), 5)