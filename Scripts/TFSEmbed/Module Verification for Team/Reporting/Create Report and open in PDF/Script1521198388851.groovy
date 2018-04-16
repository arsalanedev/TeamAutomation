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

String templatename = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

WebUI.callTestCase(findTestCase('TFSEmbed/Login/Existing Team/From TFS 2017/GIT Team/Login git'), [:], FailureHandling.STOP_ON_FAILURE)

'Work'
WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/Create folder/Page_Overview dashboard - Microsoft/span_Work'))

WebUI.waitForElementVisible(findTestObject('TFSEmbed/Modules Objects/Reporting/Create folder/Page_Requirements - Microsoft Team/span_Reporting (1)'), 
    5)

'Reporting Tab'
WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/Create folder/Page_Requirements - Microsoft Team/span_Reporting (1)'))

'New Dropdown'
WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou/span_k-icon  k-i-arrow-60-down'))

'Report From dropdown'
WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou/span_Report'))

WebUI.setText(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou/input_ig-newfile-textbox-rpt-n'), 
    templatename)

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou/input_ig-newfile-ok-button-rpt'))

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou/span_Insert Smart Part'))

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou/div_jqx-icon-arrow-down jqx-ic'))

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou/div_e-treegridcollapse e-icon'))

'select query'
WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou/div_For Katlon'))

'OK'
WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou/input_rpt-mp-editor-tab-smarts'))

'save\r\n'
WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou (1)/span_k-sprite rpt-mp-editor-sa'))

'Run'
WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/create report with basic/Page_Reporting - Microsoft Team Fou/span_k-sprite rpt-mp-editor-ru'))

'save as dropdown\r\n'
WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/open report in PDF/Page_Reporting - Microsoft Team Fou/span_Save As'))

'open PDF'
WebUI.click(findTestObject('TFSEmbed/Modules Objects/Reporting/open report in PDF/Page_Reporting - Microsoft Team Fou/span_PDF'))

