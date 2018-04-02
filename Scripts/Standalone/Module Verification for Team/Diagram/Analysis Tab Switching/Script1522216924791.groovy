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

WebUI.callTestCase(findTestCase('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Standalone 2013 GIT Team'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/span_DEFINE'))

not_run: WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/div_Draftnew diagram123newest1'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/span_Automation'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/span_Automation Diagram'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/a_Edit'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/a_Analysis'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/input_ig-UserStories-PublishBt'))

not_run: WebUI.switchToWindowTitle('Feature 300934: User story 1 - Microsoft Team Foundation Server')

not_run: WebUI.closeWindowTitle('Team Foundation Server 2013')

not_run: WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Feature 300934 User story 1 -/a_Feature 300934'))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowTitle('Modern Requirements4TFS 2018')

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/a_Use Case'))

String usecase = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

WebUI.setText(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/input_ig-UseCase-TitleTextbox-'), 
    usecase)

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/input_ig-UseCase-PublishBtn-di'))

not_run: WebUI.switchToWindowTitle('Feature 300935: usecase - Microsoft Team Foundation Server')

not_run: WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Feature 300935 usecase - Micro/a_Feature 300935'))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowTitle('Modern Requirements4TFS 2018')

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/a_Test Cases'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/input_ig-TestCases-PublishBtn-'))

not_run: WebUI.switchToWindowTitle('Test Case 300936: Test case 1 - Microsoft Team Foundation Server')

not_run: WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Test Case 300936 Test case 1 -/a_Test Case 300936'))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowTitle('Modern Requirements4TFS 2018')

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/a_Diagram'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/li'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/div_Discard Changes'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/div_You have unsaved changes t'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Switching to analysis tab/Page_Modern Requirements4TFS 2018/button_OK'))

