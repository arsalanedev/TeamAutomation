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
import com.kms.katalon.core.webui.keyword.builtin.getCSSValueKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Standalone 2013 GIT Team'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/span_DEFINE'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/span_k-icon  k-i-arrow-60-down'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/span_Folder'))

String Newfolder = CustomKeywords.'shehzad.GeneralKeywords.GetRandomString'()

 WebUI.setText(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/input_ig-newfolder-textbox-mdl'), 
    Newfolder)

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/input_ig-newfolder-ok-button-m'))

WebUI.rightClick(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/span_new folder'))



WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/span_Diagram'))

String Newfile = CustomKeywords.'shehzad.GeneralKeywords.GetRandomString'()

WebUI.setText(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/input_dia-title-text'), 
  Newfile)

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/input_dia-okBtn'))

//WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/span_k-icon  k-i-arrow-60-down'))

//WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/span_Diagram'))

//WebUI.setText(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/input_dia-title-text'), 
    //Newfile)

//WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/New file craetion/Page_Modern Requirements4TFS 2018/input_dia-okBtn'))
//
