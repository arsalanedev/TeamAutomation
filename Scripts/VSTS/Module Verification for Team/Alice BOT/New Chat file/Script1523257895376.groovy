import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.main.CustomKeywordDelegatingMetaClass as CustomKeywordDelegatingMetaClass
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

WebUI.callTestCase(findTestCase('VSTS/Login/Existing Team/GIT Team/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('VSTS/Modules Objects/Alice BOT/new chat/Page_Overview dashboard - Visual St/span_Work'))

WebUI.click(findTestObject('VSTS/Modules Objects/Alice BOT/new chat/Page_Work Items - Visual Studio Tea/span_Alice (Bot)'))

WebUI.refresh()

WebUI.waitForPageLoad(30)

WebUI.verifyElementClickable(findTestObject('VSTS/Modules Objects/Alice BOT/New chat within folder/Page_Alice (Bot) - Visual Studio Te/span_ncqrjinr10'))

WebUI.click(findTestObject('VSTS/Modules Objects/Alice BOT/New chat within folder/Page_Alice (Bot) - Visual Studio Te/span_ncqrjinr10'))

WebUI.rightClick(findTestObject('VSTS/Modules Objects/Alice BOT/New chat within folder/Page_Alice (Bot) - Visual Studio Te/span_ncqrjinr10'))

WebUI.click(findTestObject('VSTS/Modules Objects/Alice BOT/New chat within folder/Page_Alice (Bot) - Visual Studio Te/span_New'))

WebUI.click(findTestObject('VSTS/Modules Objects/Alice BOT/New chat within folder/Page_Alice (Bot) - Visual Studio Te/span_Start Chat'))

String chatname = CustomKeywords.'keyword.edevkatalon.GeneralKeywords.GetRandomString'()

WebUI.setText(findTestObject('VSTS/Modules Objects/Alice BOT/New chat within folder/Page_Alice (Bot) - Visual Studio Te/input_ig-newfile-textbox-bot-n'), 
    chatname)

WebUI.click(findTestObject('VSTS/Modules Objects/Alice BOT/New chat within folder/Page_Alice (Bot) - Visual Studio Te/input_ig-newfile-ok-button-bot'))

WebUI.click(findTestObject('VSTS/Modules Objects/Alice BOT/New chat within folder/Page_Alice (Bot) - Visual Studio Te/span_k-icon  k-i-arrow-60-down'))

WebUI.click(findTestObject('VSTS/Modules Objects/Alice BOT/New chat within folder/Page_Alice (Bot) - Visual Studio Te/span_Check In Changes'))

