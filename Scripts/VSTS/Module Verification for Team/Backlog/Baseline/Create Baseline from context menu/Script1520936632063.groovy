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

WebUI.callTestCase(findTestCase('VSTS/Login/New Team/TFVC Team/TFVC- Login , New Project , New Team'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Work Tab Click/span_Work'))

for (def index : (1..10)) {
    WebUI.setText(findTestObject('VSTS/Modules Objects/Backlog/Work Tab Click/backlog_newWiTextBox'), 'TestWI' + index)

    WebUI.delay(3)

    WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Add work item/Page_Features/button_Add'))
}

WebUI.delay(3)

WebUI.focus(findTestObject('VSTS/Modules Objects/Backlog/Work Item Selection/Page_Product backlog/div_grid-cell add-icon-cell'))

WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Work Item Selection/Page_Product backlog/div_grid-cell add-icon-cell'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('VSTS/Modules Objects/Backlog/Work Item Selection/Page_Product backlog/div_grid-cell add-icon-cell'), 
    Keys.chord(Keys.SHIFT))

WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Work Item Selection/Page_Product backlog/div_grid-cell add-icon-cell (1)'))

WebUI.sendKeys(findTestObject('VSTS/Modules Objects/Backlog/Work Item Selection/Page_Product backlog/div_grid-cell add-icon-cell'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a'))

