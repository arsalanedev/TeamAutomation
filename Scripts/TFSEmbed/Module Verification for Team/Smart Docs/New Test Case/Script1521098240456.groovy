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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TFSEmbed/Login/New Team/From TFS 2017/TFVC Team/TFVC Team'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('http://syedsaad:8080/tfs/QA%20Collection/_projects')

not_run: WebUI.click(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/a_bux0txa3yr  2usgjkou50'))

not_run: WebUI.waitForElementPresent(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/span_Work'), 5)

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/span_Work'))

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/span_Smart Docs'))

WebUI.waitForElementClickable(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/span_New'), 10)

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/span_New'))

WebUI.waitForElementVisible(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/span_Folder'), 5)

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/span_Folder'))

not_run: element = WebUiCommonHelper.findWebElement(findTestObject('Page_Smart Docs - Microsoft Team Fo/span_Folder'), 30)

not_run: WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))

WebUI.waitForElementVisible(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/input_ig-newfolder-textbox-smd'), 
    5)

String FolderName = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

WebUI.setText(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/input_ig-newfolder-textbox-smd'), FolderName)

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Smart Docs/FolderCreation/input_ig-newfolder-ok-button-s'))

//WebUI.executeJavaScript("arguments[0].style.border='3px solid blue'", Arrays.asList(element))
String selector = ('li.sim-ff-tv-folder-item[title=\'' + FolderName) + '\']'

TestObject folderExplorer = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.getCustomTestObjectBy'('css', selector)

WebUI.delay(2)

