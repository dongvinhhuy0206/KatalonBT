import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import common.Utilities

'Open Browser'
WebUI.openBrowser('')

'Maximize browser'
WebUI.maximizeWindow()

'Navigate to URL https://atlassian.design/components/tooltip/examples'
WebUI.navigateToUrl('https://atlassian.design/components/tooltip/examples')

'Hover to button "Hover over me"'
WebUI.mouseOver(findTestObject('Object Repository/Atlassian/btn_HoverOverMe'))

'Get hover over background color of button'
String backgroundcolorRGB = WebUI.getCSSValue(findTestObject('Object Repository/Atlassian/btn_HoverOverMe'), 'background')

'Convert background color from RGB to Hex'
String backgroundcolorHex = Utilities.convertRGBAToHex(backgroundcolorRGB).toUpperCase()

'Verify background color'
WebUI.verifyEqual(backgroundcolorHex, '#0055CC')

'Take Screenshot'
WebUI.takeScreenshot()

'Close browser'
WebUI.closeBrowser()