import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.org.apache.bcel.internal.generic.LSTORE

'Prepare data list to check the checkboxes'
List<String> lstCheckbox = ["Anemia","Cancer","Ulcer Disease","Thyroid Problems","Emphysema"]

'Navigate to URL'
WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

'Maximize browser'
WebUI.maximizeWindow()

'Check checkboxes by name'
for(String item in lstCheckbox) {
	WebUI.check(findTestObject('Object Repository/Topic11/Practice2/chkbox_AllByName',['text':item]))
}

'Delay 2s'
WebUI.delay(2)

'Close browser'
WebUI.closeBrowser()