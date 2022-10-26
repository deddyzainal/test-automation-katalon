import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

if (GlobalVariable.datetime == '') {
    WebUI.callTestCase(findTestCase('BE/Register account'), null, FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('FE/Backoffice/Navigation/Click menu Customer Management'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Search list by Nama'), [('nama') : 'Katalon ' + 
        GlobalVariable.datetime], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Search list by No Telepon'), [('no_telepon') : GlobalVariable.datetime], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Search list by Digi Sign Status'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Search list by Email'), [('email') : GlobalVariable.datetime + 
        '@gmail.com'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/List/Open customer detail'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Peminjam'), [('nama') : 'Katalon ' + GlobalVariable.datetime, ('nomor_handphone') : GlobalVariable.datetime, ('email') : GlobalVariable.datetime + '@gmail.com'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Alamat'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Alamat'), null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Pekerjaan'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Pekerjaan'), null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Penjamin'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Penjamin'), null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Kontak Darurat'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Kontak Darurat'), null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Keluarga'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Keluarga'), null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Bank'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Edit Informasi Bank'), null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Kredensial'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FE/Backoffice/Customer Management/Detail/Open tab Informasi Sistem'), null, FailureHandling.STOP_ON_FAILURE)

