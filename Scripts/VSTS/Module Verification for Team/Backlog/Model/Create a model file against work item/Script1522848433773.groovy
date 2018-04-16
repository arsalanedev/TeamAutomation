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

String BaselineName = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

WebUI.callTestCase(findTestCase('VSTS/Login/New Team/TFVC Team/TFVC- Login , New Project , New Team'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'Work Tab Open'
WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Click Work Tab/Page_Overview dashboard - Visual St/span_Work'))

WebUI.delay(3)

'Backlogs tab Opened'
WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Click Work Tab/Click Backlogs Tab/span_Backlogs'))

'Work Items Creation'
for (def index : (1..10)) {
    WebUI.setText(findTestObject('VSTS/Modules Objects/Backlog/Work Tab Click/backlog_newWiTextBox'), 'TestWI' + index)

    WebUI.delay(3)

    WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Add work item/Page_Features/button_Add'))
}

WebUI.delay(3)

WebUI.click(findTestObject('VSTS/Modules Objects/Backlogs Model/Mozilla/div_TestWI1'))

WebUI.click(findTestObject('VSTS/Modules Objects/Backlogs Model/Mozilla/span_Off'))

WebUI.click(findTestObject('VSTS/Modules Objects/Backlogs Model/Mozilla/span_Model'))

WebUI.waitForElementVisible(findTestObject('VSTS/Modules Objects/Backlogs Model/Mozilla/Spy/Page_Product backlog/span_Define Model'), 
    50)

WebUI.click(findTestObject('VSTS/Modules Objects/Backlogs Model/Mozilla/Spy/Page_Product backlog/span_Define Model'))

WebUI.click(findTestObject('VSTS/Modules Objects/Backlogs Model/Mozilla/span_Diagram'))

WebUI.waitForElementPresent(findTestObject('VSTS/Modules Objects/Backlogs Model/Mozilla/input_dia-title-text dia-show-'), 
    10)

WebUI.doubleClick(findTestObject('VSTS/Modules Objects/Backlogs Model/Mozilla/input_dia-title-text dia-show-'))

WebUI.setText(findTestObject('VSTS/Modules Objects/Backlogs Model/Mozilla/input_dia-title-text dia-show-'), 'TestDiagram')

WebUI.click(findTestObject('VSTS/Modules Objects/Backlogs Model/Mozilla/input_dia-okBtn'))

