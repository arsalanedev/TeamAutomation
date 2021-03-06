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

WebUI.openBrowser('')

WebUI.maximizeWindow()

String server = findTestData('Datafile').getValue('TFSServer', 4)

WebUI.navigateToUrl(server)

WebUI.click(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/button_New Project'))

String ProjectName = CustomKeywords.'shehzad.GeneralKeywords.GetRandomString'()

WebUI.setText(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/input_project-name'), ProjectName)

WebUI.click(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/input_version-control-types-co'))

WebUI.click(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/div_Team Foundation Version Co'))

WebUI.scrollToElement(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/button_Create'), 
    10)

WebUI.waitForElementClickable(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/button_Create'), 
    2)

WebUI.click(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/button_Create'))

WebUI.delay(5)

WebUI.click(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/Project dropdown for Create Team'))

WebUI.click(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/span_New team'))

String TeamName = CustomKeywords.'shehzad.GeneralKeywords.GetRandomString'()

WebUI.setText(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/input_groupName'), TeamName)

WebUI.click(findTestObject('TFSEmbed/Login/New Team/From TFS 2017/TeamCreationObjects-Rename/button_Create team'))

