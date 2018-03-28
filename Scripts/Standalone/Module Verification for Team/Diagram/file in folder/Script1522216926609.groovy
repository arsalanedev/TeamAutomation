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
import com.kms.katalon.core.webui.keyword.builtin.getCSSValueKeyword as getCSSValueKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Standalone 2013 GIT Team'), [:], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(10)

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/file in folder/Page_Modern Requirements4TFS 2018 - Copy/span_DEFINE'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/file in folder/Page_Modern Requirements4TFS 2018 - Copy/span_02wzbng707'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/file in folder/Page_Modern Requirements4TFS 2018 - Copy/span_k-icon  k-i-arrow-60-down'))

WebUI.waitForElementClickable(findTestObject('Standalone/Modules Objects/Diagram/file in folder/Page_Modern Requirements4TFS 2018 - Copy/span_Diagram'), 
    10)

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/file in folder/Page_Modern Requirements4TFS 2018 - Copy/span_Diagram'))

WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/file in folder/Page_Modern Requirements4TFS 2018 - Copy/div_NEW DIAGRAMclose'))

String FileName = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

WebUI.setText(findTestObject('Standalone/Modules Objects/Diagram/file in folder/Page_Modern Requirements4TFS 2018 - Copy/input_dia-title-text'), 
    FileName)

not_run: WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/shape dragging and analysis tab switching/Page_Modern Requirements4TFS 2018/div_x'))

not_run: WebUI.waitForElementVisible(findTestObject('Standalone/Modules Objects/Diagram/file in folder/Page_Modern Requirements4TFS 2018 - Copy/Page_Modern Requirements4TFS 2018 - Copy/input_dia-okBtn'), 
    10)

//String DiaUI = findTestObject('Standalone/Modules Objects/Diagram/file in folder/Page_Modern Requirements4TFS 2018 - Copy/Page_Modern Requirements4TFS 2018/input_dia-okBtn')
WebUI.click(findTestObject('Standalone/Modules Objects/Diagram/file in folder/Page_Modern Requirements4TFS 2018 - Copy/Page_Modern Requirements4TFS 2018 - Copy/input_dia-okBtn'))

not_run: String selector = ('k-item sim-ff-tv-file-item[title=\'' + FileName) + '\']'

//TestObject folderExplorer =CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.getCustomTestObjectBy'(selector, selector)
not_run: TestObject folderExplorer = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.getCustomTestObjectBy'('css', 
    selector)

not_run: WebUI.delay(2)

not_run: assert WebUI.getText(folderExplorer) == FileName

