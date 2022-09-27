import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.packageId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Home/Button - MASUK (Home)'), 10)

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Input - No Telepon'), 5)
Mobile.setText(findTestObject('FE/LancarMobile/Android/Login/Input - No Telepon'), '1111111111', 2)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('FE/LancarMobile/Android/Login/Button - MASUK (Login)'), 2)

Mobile.verifyElementVisible(findTestObject('FE/LancarMobile/Android/Login/Error - Inexisting Phone Number'), 5)