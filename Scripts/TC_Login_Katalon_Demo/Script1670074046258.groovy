import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open Browser'
WebUI.openBrowser('')

'Navigate to URL'
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

'Input Username'
WebUI.setText(findTestObject('Object Repository/katalon_demo/txt_username'), 'John Doe')

'Input Password'
WebUI.setText(findTestObject('Object Repository/katalon_demo/txt_password'), 'ThisIsNotAPassword')

'Click Login button'
WebUI.click(findTestObject('Object Repository/katalon_demo/btn_login'))

'Verify the text is displayed'
WebUI.verifyTextPresent('Book Appointment', false)

'Take Screenshot'
WebUI.takeScreenshot()

WebUI.closeBrowser()

