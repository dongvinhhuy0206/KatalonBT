import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open Browser'
WebUI.openBrowser('')

'Maximize browser'
WebUI.maximizeWindow()

'Navigate to URL'
WebUI.navigateToUrl('https://www.fahasa.com/customer/account/create')

'Click Dang Nhap tab'
WebUI.click(findTestObject('Object Repository/Fahasa/Tab_DangNhap'))

'Verify button “Đăng nhập” disabled'
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Fahasa/Btn_DangNhap'))

'Input so dien thoai'
WebUI.setText(findTestObject('Object Repository/Fahasa/txt_SoDienThoai'), '0909090909')

'Input mat khau'
WebUI.setText(findTestObject('Object Repository/Fahasa/txt_MatKhau'), 'ThisIsNotAPassword')

'Verify button “Đăng nhập” enabled'
WebUI.verifyElementClickable(findTestObject('Object Repository/Fahasa/Btn_DangNhap'))

'Click Dang Nhap button'
WebUI.click(findTestObject('Object Repository/Fahasa/Btn_DangNhap'))

'Verify the text is displayed'
WebUI.verifyElementText(findTestObject('Object Repository/Fahasa/lbl_errormessage'), 'Số điện thoại/Email hoặc Mật khẩu sai!')

'Take Screenshot'
WebUI.takeScreenshot()

'Close browser'
WebUI.closeBrowser()