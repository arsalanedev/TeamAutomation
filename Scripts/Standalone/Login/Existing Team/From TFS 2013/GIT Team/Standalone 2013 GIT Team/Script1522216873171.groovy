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

//WebUI.maximizeWindow()
String service = findTestData('Datafile').getValue(4, 10)

String TFSServer = findTestData('Datafile').getValue(3, 10)

String username = findTestData('Datafile').getValue(1, 10)

String password = findTestData('Datafile').getValue(2, 10)

WebUI.navigateToUrl(service)

WebUI.sendKeys(findTestObject(null), findTestData('Datafile').getValue(4, 10))

WebUI.click(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Sign In/div_TFS Server URL'))

WebUI.click(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Sign In/div_TFS Server URL (1)'))

WebUI.clearText(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Sign In/input_TFSServerURL'))

WebUI.focus(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Sign In/div_TFS Server URL'))

WebUI.sendKeys(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Sign In/input_TFSServerURL'), 
    findTestData('Datafile').getValue(3, 10))

WebUI.click(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Sign In/div_User ID'))

WebUI.sendKeys(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Sign In/input_EmailAddress'), 
    findTestData('Datafile').getValue(1, 10))

WebUI.click(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Sign In/div_Password'))

WebUI.sendKeys(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Sign In/input_Password'), findTestData(
        'Datafile').getValue(2, 10))

WebUI.click(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Sign In/input_btnSignIn'))

WebUI.click(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Modern Requirements4TFS 2018/a_Browse'))

WebUI.click(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Modern Requirements4TFS 2018/span_k-icon k-i-expand'))

WebUI.click(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Modern Requirements4TFS 2018/span_k-icon k-i-expand_1'))

WebUI.click(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Modern Requirements4TFS 2018/span_GIT Team'))

WebUI.click(findTestObject('Standalone/Login/Existing Team/From TFS 2013/GIT Team/Page_Modern Requirements4TFS 2018/input_btnProjectNavigate'))

