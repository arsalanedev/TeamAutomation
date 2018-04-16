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

'Select all Work Items (Keyword)'
CustomKeywords.'keyword.edevkatalon.com.ActionClass.SelectElement'()

'Review Name Random '
String ReviewName = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

'Click Context Menu'
WebUI.rightClick(findTestObject('VSTS/Modules Objects/Backlog/Click Work Tab/Page_Features/div_grid-context-menu-containe'))

WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Review Request/Page_Product backlog/span_Review Request'))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('VSTS/Modules Objects/Backlog/RR window/Page_Product backlog/iframe_externalContentHost514'), 
    50)

'Switched to IFrame'
WebUI.switchToFrame(findTestObject('VSTS/Modules Objects/Backlog/RR window/Page_Product backlog/iframe_externalContentHost514'), 
    10)

'Selected Reviewer dropdown'
WebUI.doubleClick(findTestObject('VSTS/Modules Objects/Backlog/RR window/Page_Product backlog/input_rvm-req-stakeholdercombo'))

not_run: WebUI.setText(findTestObject('VSTS/Modules Objects/Backlog/Page_Product backlog/ReviewerApprover fields'), 'shehzad')

not_run: WebUI.sendKeys(findTestObject('VSTS/Modules Objects/Backlog/Page_Product backlog/ReviewerApprover fields'), Keys.chord(
        Keys.ENTER))

not_run: WebUI.doubleClick(findTestObject('VSTS/Modules Objects/Backlog/Page_Product backlog/input_rvm-req-approverscombobo'))

not_run: WebUI.setText(findTestObject('VSTS/Modules Objects/Backlog/Page_Product backlog/input_rvm-req-approverscombobo'), 
    'syed saad')

not_run: WebUI.sendKeys(findTestObject('VSTS/Modules Objects/Backlog/Page_Product backlog/input_rvm-req-approverscombobo'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.setText(findTestObject('VSTS/Modules Objects/Backlog/Page_Product backlog/input_rvm-req-approverscombobo'), 
    'arsalan ')

not_run: WebUI.sendKeys(findTestObject('VSTS/Modules Objects/Backlog/Page_Product backlog/input_rvm-req-approverscombobo'), 
    Keys.chord(Keys.ENTER))

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

not_run: WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Review Record/Calender/Page_Product backlog/span_k-icon k-i-calendar'))

not_run: WebUI.click(findTestObject('VSTS/Modules Objects/Backlog/Review Record/Calender/Page_Product backlog/a_Monday March 26 2018'))

