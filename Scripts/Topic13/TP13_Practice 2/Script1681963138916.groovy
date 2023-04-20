import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Navigate to URL'
WebUI.openBrowser('http://the-internet.herokuapp.com/basic_auth')

'Maximize browser'
WebUI.maximizeWindow()

'Authenticate'
WebUI.authenticate('http://the-internet.herokuapp.com/basic_auth', 'admin', 'admin', 12)

'Verify text is present'
WebUI.verifyTextPresent('Congratulations! You must have the proper credentials.', false)

'Close browser'
WebUI.closeBrowser()