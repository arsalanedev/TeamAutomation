import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

String server = findTestData('datadriven').getValue('TFSServer', 2)

String username = findTestData('datadriven').getValue('username', 1)

String password = findTestData('datadriven').getValue('password', 1)


WebUI.navigateToUrl(server)

WebUI.setText(findTestObject('VSTS/Login/Existing Team/TFVC Team/NEW LOGIN/Page_Sign in to your Microsoft acco/input_loginfmt'), 
    username)

WebUI.sendKeys(findTestObject('VSTS/Login/Existing Team/TFVC Team/NEW LOGIN/Page_Sign in to your Microsoft acco/input_idSIButton9'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('VSTS/Login/Existing Team/TFVC Team/NEW LOGIN/Page_Sign in to your Microsoft acco/input_passwd'), 
    password)

WebUI.click(findTestObject('VSTS/Login/Existing Team/TFVC Team/Page_Sign in to your Microsoft acco/input_idSIButton9'))

WebUI.click(findTestObject('VSTS/Login/Existing Team/TFVC Team/NEW LOGIN/Page_Sign in to your Microsoft acco/input_idSIButton9'))

WebUI.waitForPageLoad(2)

WebUI.navigateToUrl('https://automationkatalon.visualstudio.com/xktl3tcg72/21e05d5804/')

WebUI.waitForPageLoad(2)

