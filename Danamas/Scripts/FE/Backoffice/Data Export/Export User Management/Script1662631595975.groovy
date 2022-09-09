import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.stream.Collectors

////Select Tipe Dokumen
//WebUI.click(findTestObject('FE/Backoffice/Data Export/Select - Tipe Dokumen'))
//WebUI.click(findTestObject('FE/Backoffice/Data Export/Option - Tipe Dokumen', [('tipe_dokumen') : type]))
//
////Open calendar From Date
//WebUI.click(findTestObject('FE/Backoffice/Data Export/Input - From Date'))
//
////Select Month
//WebUI.selectOptionByLabel(findTestObject('FE/Backoffice/Data Export/Select - Month From'), from_month, false)
//
////Select Year
//WebUI.selectOptionByLabel(findTestObject('FE/Backoffice/Data Export/Select - Year From'), from_year, false)
//
////Select Date
//WebUI.click(findTestObject('FE/Backoffice/Data Export/Date - From', [('tanggal') : from_date]))
//
////Open calendar To Date
//WebUI.click(findTestObject('FE/Backoffice/Data Export/Input - To Date'))
//
////Select Month
//WebUI.selectOptionByLabel(findTestObject('FE/Backoffice/Data Export/Select - Month To'), to_month, false)
//
////Select Year
//WebUI.selectOptionByLabel(findTestObject('FE/Backoffice/Data Export/Select - Year To'), to_year, false)
//
////Select Date
//WebUI.click(findTestObject('FE/Backoffice/Data Export/Date - To', [('tanggal') : to_date]))
//
////Click button Export
//WebUI.click(findTestObject('FE/Backoffice/Data Export/Button - Export'))
//
//WebUI.delay(5)

Path userHome = Paths.get(System.getProperty("user.home"))
Path downloads = userHome.resolve('Downloads')
//println(downloads.toString())


// insert an anonymous file   (equivalent to downloading a file from web)
Path newFile = downloads.resolve("myFile4.txt")
newFile.toFile().text = "Hello, world!"
// get the set of files contained in the Downloads directory now (after insertion)
Set<Path> currentFileSet = Files.list(downloads).collect(Collectors.toSet())
println(currentFileSet)

Path lastFile = currentFileSet.toList().first()
String fileName = lastFile.getFileName().toString()

println(fileName)

