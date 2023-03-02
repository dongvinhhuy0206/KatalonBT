import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Open Browser'
WebUI.openBrowser('')

'Navigate to URL\r\n'
WebUI.navigateToUrl('https://kiemthutudong.com/blog')

'Click to button Create New Account'
WebUI.click(findTestObject('Archive/kiemthutudong/btn_CreateNewAccount'))

'Input Username'
WebUI.setText(findTestObject('Archive/kiemthutudong/txt_UserName'), 'testdemo')

'Input email'
WebUI.setText(findTestObject('Archive/kiemthutudong/txt_Email'), 'testdemo@gmail.com')

'Click Register button'
WebUI.click(findTestObject('Archive/kiemthutudong/btn_Register'))

'Verify the text is displayed'
WebUI.verifyTextPresent('This username is already registered. Please choose another one', false)

'Take Screenshot'
WebUI.takeScreenshot()

WebUI.closeBrowser()

