import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


'Navigate to URL'
WebUI.openBrowser('http://the-internet.herokuapp.com/javascript_alerts')

'Maximize browser'
WebUI.maximizeWindow()

'Click button JS Prompt'
WebUI.click(findTestObject('Object Repository/Topic13/Practice1/btn_JSPrompt'))

'Wait for alert'
WebUI.waitForAlert(5)

'Verify alert text'
WebUI.verifyEqual(WebUI.getAlertText(), "I am a JS prompt")

'Set alert text'
WebUI.setAlertText("abc")

'Accept Alert'
WebUI.acceptAlert()

'Verify result text'
WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/Topic13/Practice1/txt_Result')), "You entered: abc")

'Click button JS Prompt'
WebUI.click(findTestObject('Object Repository/Topic13/Practice1/btn_JSPrompt'))

'Dismiss Alert'
WebUI.dismissAlert()

WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/Topic13/Practice1/txt_Result')), "You entered: null")

'Close browser'
WebUI.closeBrowser()