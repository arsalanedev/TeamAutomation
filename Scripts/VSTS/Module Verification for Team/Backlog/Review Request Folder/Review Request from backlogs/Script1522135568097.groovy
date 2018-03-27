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

'Click Work Tab'
WebUI.click(findTestObject('VSTS/Login/New Team/TFVC Team/Backlogs/Page_Overview dashboard/span_Work'))

String ReviewName = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

WebUI.delay(2)

'Backlogs tab open'
WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Backlogs tab click/Page_Features (1)/span_Backlogs'))

'Work Item Creation - Randomly'
for (def index : (1..10)) {
    WebUI.setText(findTestObject('VSTS/Modules Objects/Backlog/Work Tab Click/backlog_newWiTextBox'), 'TestWI' + index)

    WebUI.delay(3)

    WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Add work item/Page_Features/button_Add'))
}

WebUI.delay(3)

CustomKeywords.'keyword.edevkatalon.com.ActionClass.SelectElement'()

'Click Context Menu'
WebUI.rightClick(findTestObject('VSTS/Modules Objects/Backlog/Click CM/Page_Product backlog/div_grid-context-menu-containe'))

WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Review Request/Page_Product backlog/span_Review Request'))

'Switched to IFrame'
WebUI.switchToFrame(findTestObject('VSTS/Modules Objects/Backlog/RR window/Page_Product backlog/iframe_externalContentHost514'), 
    0)

'Selected Reviewer dropdown'
WebUI.doubleClick(findTestObject('VSTS/Modules Objects/Backlog/RR window/Page_Product backlog/input_rvm-req-stakeholdercombo'))

WebUI.setText(findTestObject('VSTS/Modules Objects/Backlog/RR window/Page_Product backlog/input_rvm-req-stakeholdercombo'), 
    'shehzad ali')

'Reviewer Added'
WebUI.sendKeys(findTestObject('VSTS/Modules Objects/Backlog/RR window/Page_Product backlog/input_rvm-req-stakeholdercombo'), 
    Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('VSTS/Modules Objects/Backlog/Review Set Text dropdowns/Page_Product backlog/input_rvm-req-approverscombobo'))

'Selected Approver Dropdown'
WebUI.setText(findTestObject('VSTS/Modules Objects/Backlog/Review Set Text dropdowns/Page_Product backlog/input_rvm-req-approverscombobo'), 
    'syed saad')

'Approver Added'
WebUI.sendKeys(findTestObject('VSTS/Modules Objects/Backlog/Review Set Text dropdowns/Page_Product backlog/input_rvm-req-approverscombobo'), 
    Keys.chord(Keys.ENTER))

'Selected Approver Dropdown'
WebUI.setText(findTestObject('VSTS/Modules Objects/Backlog/Review Set Text dropdowns/Page_Product backlog/input_rvm-req-approverscombobo'), 
    'arsalan mushtaq')

'Approver Added'
WebUI.sendKeys(findTestObject('VSTS/Modules Objects/Backlog/Review Set Text dropdowns/Page_Product backlog/input_rvm-req-approverscombobo'), 
    Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('VSTS/Modules Objects/Backlog/Review Record/Page_Product backlog (1)/input_rvm-req-workitremtitletx'))

'Subject Name'
WebUI.setText(findTestObject('VSTS/Modules Objects/Backlog/Review Record/Page_Product backlog (1)/input_rvm-req-workitremtitletx'), 
    ReviewName)

WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Review Record/Calender/Page_Product backlog/span_k-icon k-i-calendar'))

WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Review Record/Calender/Page_Product backlog/a_Monday March 26 2018'))

