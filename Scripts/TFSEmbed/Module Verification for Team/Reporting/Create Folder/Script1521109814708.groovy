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

WebUI.callTestCase(findTestCase('TFSEmbed/Login/Existing Team/From TFS 2017/GIT Team/Login git'), [:], FailureHandling.STOP_ON_FAILURE)

String Foldername = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/Create folder/Page_Overview dashboard - Microsoft/span_Work'))

WebUI.waitForElementVisible(findTestObject('TFSEmbed/Modules Objects/Reporting/Create folder/Page_Requirements - Microsoft Team/span_Reporting (1)'), 
    5)

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/Create folder/Page_Requirements - Microsoft Team/span_Reporting (1)'))

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/Create folder/Page_Reporting - Microsoft Team Fou/span_New'))

WebUI.delay(1)

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/Create folder/Page_Reporting - Microsoft Team Fou/img_k-image'))

WebUI.setText(findTestObject('TFSEmbed/Modules Objects/Reporting/Create folder/Page_Reporting - Microsoft Team Fou/input_ig-newfolder-textbox-rpt'), 
    Foldername)

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/Create folder/Page_Reporting - Microsoft Team Fou/input_ig-newfolder-ok-button-r'))

