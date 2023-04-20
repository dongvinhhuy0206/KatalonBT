import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Navigate to URL'
WebUI.openBrowser('https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html')

'Maximize browser'
WebUI.maximizeWindow()

'Prepare data'
List<String> lstMonth = ["January","February","July","October","December"]

'Click dropdownlist multiselect'
WebUI.click(findTestObject('Object Repository/Topic12/Practice2/ddl_multiselect'))

'Multi select items'
for(String month in lstMonth) {
	WebUI.click(findTestObject('Object Repository/Topic12/Practice2/ddl_multiselect_item',['month':month]))
}

'Delay 2s'
WebUI.delay(2)

'Close browser'
WebUI.closeBrowser()