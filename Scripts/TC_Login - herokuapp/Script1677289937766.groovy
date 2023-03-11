import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open Browser'
WebUI.openBrowser('')

'Navigate to URL'
WebUI.navigateToUrl('https://the-internet.herokuapp.com/login')

'Input username'
WebUI.setText(findTestObject('herokuapp/txt_username'), 'tomsmith')

'Input password'
WebUI.setText(findTestObject('herokuapp/txt_password'), 'SuperSecretPassword!')

'Click login button'
WebUI.click(findTestObject('herokuapp/btn_login'))

'Verify the text is displayed'
WebUI.verifyTextPresent('Welcome to the Secure Area. When you are done click logout below.', false)

'Take Screenshot'
WebUI.takeScreenshot()

WebUI.closeBrowser()

