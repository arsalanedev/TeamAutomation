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

String teamname = CustomKeywords.'shehzad.generalkeys.GetRandomString'()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://tfs2013s:8080/tfs/Test/Project%20katalon%20Scrum%20Tfvc/_admin')

WebUI.click(findTestObject('Standalone/Login/New Team/From TFS 2013/TFVC Team/Page_Project katalon Scrum Tfvc - M/span_New team'))

WebUI.setText(findTestObject('Standalone/Login/New Team/From TFS 2013/TFVC Team/Page_Project katalon Scrum Tfvc - M/input_groupName'), 
    teamname)

WebUI.click(findTestObject('Standalone/Login/New Team/From TFS 2013/TFVC Team/Page_Project katalon Scrum Tfvc - M/span_Create team'))

WebUI.navigateToUrl('http://shehzad:8028/ModernRequirements4TFS/Index#|s?http://tfs2013s:8080/tfs|c?Test|p?Project%20katalon%20Scrum%20Tfvc|t?1dc5d8cb-71ee-40bf-83d4-026e291c1107')

String username = findTestData('Datafile').getValue('username', 7)

String password = findTestData('Datafile').getValue('password', 7)

WebUI.setText(findTestObject('Standalone/Login/New Team/From TFS 2013/TFVC Team/Page_Sign In/input_EmailAddress'), username)

WebUI.setText(findTestObject('Standalone/Login/New Team/From TFS 2013/TFVC Team/Page_Sign In/input_Password'), password)

WebUI.click(findTestObject('Standalone/Login/New Team/From TFS 2013/TFVC Team/Page_Sign In/input_btnSignIn'))

