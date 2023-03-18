import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Navigate to URL'
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

'Maximize browser'
WebUI.maximizeWindow()

'Get total number of checkbox'
int total = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Topic11/Practice1/chkbox_All'), 30).size()

'Check all checkboxes using WebUI.check'
for(int i = 1; i<=total; i++ ) {
	WebUI.check(findTestObject('Topic11/Practice1/chkbox_AllByIndexes',['index':i]))
}

'Delay 2s'
WebUI.delay(2)

'Uncheck all checkboxes using WebUI.uncheck'
for(int i = total; i>1; i-- ) {
	WebUI.uncheck(findTestObject('Topic11/Practice1/chkbox_AllByIndexes',['index':i]))
}

'Delay 2s'
WebUI.delay(2)

'Close browser'
WebUI.closeBrowser()