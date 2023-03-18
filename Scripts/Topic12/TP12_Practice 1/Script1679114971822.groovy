import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


'Navigate to URL'
WebUI.openBrowser('https://demos.telerik.com/kendo-ui/dropdownlist/index')

'Maximize browser'
WebUI.maximizeWindow()

'Click on dropdownlist Categories'
WebUI.click(findTestObject('Topic12/Practice1/ddl_category'))

'Select category item by name "Seafood"'
WebUI.check(findTestObject('Topic12/Practice1/ddl_categoryitem',['categoryname':'Seafood']))

'Delay 2s'
WebUI.delay(2)

'Close browser'
WebUI.closeBrowser()