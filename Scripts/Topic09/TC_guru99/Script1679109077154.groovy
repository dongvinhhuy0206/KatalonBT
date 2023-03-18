import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open Browser'
WebUI.openBrowser('')

'Maximize browser'
WebUI.maximizeWindow()

'Navigate to URL https://demo.guru99.com/V4/'
WebUI.navigateToUrl('https://demo.guru99.com/V4/')

'Click Here link'
WebUI.click(findTestObject('Topic09/guru99/link_Here'))

'Click advertisement'
try {
		WebUI.switchToFrame(findTestObject('Topic09/guru99/iframe_gg'), 5)
		WebUI.click(findTestObject('Topic09/guru99/btn_close_iframe'))
		WebUI.switchToDefaultContent()
	}
catch (Exception e){}

'Input Email'
WebUI.setText(findTestObject('Topic09/guru99/txt_Email'), 'test@gmail.com')

'Click Submit'
WebUI.click(findTestObject('Topic09/guru99/btn_Submit'))

'Get User ID'
String UserID = WebUI.getText(findTestObject('Topic09/guru99/lbl_UserID')).trim()

'Get Password'
String Password = WebUI.getText(findTestObject('Topic09/guru99/lbl_Password')).trim()

'Navigate to URL https://demo.guru99.com/V4/'
WebUI.navigateToUrl('https://demo.guru99.com/V4/')

'Input User ID'
WebUI.setText(findTestObject('Topic09/guru99/txt_UserID'), UserID)

'Input Password'
WebUI.setText(findTestObject('Topic09/guru99/txt_Password'), Password)

'Click Login button'
WebUI.click(findTestObject('Topic09/guru99/btn_Login'))

'Verify the text is displayed'
WebUI.verifyTextPresent("Welcome To Manager's Page of Guru99 Bank", false)

'Take Screenshot'
WebUI.takeScreenshot()

'Close browser'
WebUI.closeBrowser()