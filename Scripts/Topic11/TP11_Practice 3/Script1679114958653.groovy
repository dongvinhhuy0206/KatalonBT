import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import common.Utilities

'Navigate to URL'
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

'Maximize browser'
WebUI.maximizeWindow()

'Get total number of checkbox'
int total = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Topic11/Practice3/chkbox_All')
, 30).size()

'Get some unique random numbers'
List<String> lstRandom = Utilities.getRandom(total, 10)

'Check all checkboxes using WebUI.check'
for(String index in lstRandom) {
	WebUI.check(findTestObject('Object Repository/Topic11/Practice3/chkbox_AllByIndexes',['index':index]))
}

'Close browser'
WebUI.closeBrowser()