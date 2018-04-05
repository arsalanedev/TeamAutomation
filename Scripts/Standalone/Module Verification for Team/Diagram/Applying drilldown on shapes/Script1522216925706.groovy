import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.googlecode.javacv.CameraDevice as CameraDevice
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
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain as WebUIKeywordMain
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.stringtemplate.v4.compiler.STParser.region_return as region_return

WebUI.callTestCase(findTestCase('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Standalone 2013 GIT Team'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/span_DEFINE'))

not_run: WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/div_Draftnew diagram123newest1 (1)'))

not_run: WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/div_Draftnew diagram123newest1 (1)'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/span_Automation'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/span_Automation Diagram'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/a_Edit'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/rect_ProcessPcb0_shape'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/span_dia-hasMenu'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/div_Diagram'))

String drilldowndiagram = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

WebUI.setText(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/input_dia_story_scenario_filen'), 
    drilldowndiagram)

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/input_dia_story_scenario_ok'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/span_Newdiagram14536364'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/rect_ProcessPcb0_shape'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/span_dia-hasMenu_1'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/div_Discard Changes'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/div_You have unsaved changes t'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/Applying drill down/Page_Modern Requirements4TFS 2018/button_OK'))

