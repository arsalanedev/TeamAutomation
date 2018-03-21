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

WebUI.navigateToUrl('https://app.vssps.visualstudio.com/_signin?realm=newvsoaccount.visualstudio.com&reply_to=https%3A%2F%2Fnewvsoaccount.visualstudio.com%2F13.1.1%2520Tfvc%2520Agile%2F_admin&redirect=1&context=eyJodCI6MiwiaGlkIjoiZTJlMDhhZDUtZDE5MC00ZmIyLThjMDAtNDVkZDkzMDkyMDU1IiwicXMiOnt9LCJyciI6IiIsInZoIjoiIiwiY3YiOiIiLCJjcyI6IiJ90#ctx=eyJTaWduSW5Db29raWVEb21haW5zIjpbImh0dHBzOi8vbG9naW4ubWljcm9zb2Z0b25saW5lLmNvbSIsImh0dHBzOi8vbG9naW4ubWljcm9zb2Z0b25saW5lLmNvbSJdfQ2')

WebUI.setText(findTestObject('Standalone/Login/New Team/From VSO/TFVC Team/Page_Sign in to your Microsoft acco/input_loginfmt'), 
    'shehzad.ali@edevtech.com')

WebUI.click(findTestObject('Standalone/Login/New Team/From VSO/TFVC Team/Page_Sign in to your Microsoft acco/input_idSIButton9'))

WebUI.setText(findTestObject('Standalone/Login/New Team/From VSO/TFVC Team/Page_Sign in to your Microsoft acco/input_passwd'), 
    'shehzad10132')

WebUI.click(findTestObject('Standalone/Login/New Team/From VSO/TFVC Team/Page_Sign in to your Microsoft acco/input_idSIButton9'))

WebUI.click(findTestObject('Standalone/Login/New Team/From VSO/TFVC Team/Page_Sign in to your account/input_idBtn_Back'))

WebUI.click(findTestObject('Standalone/Login/New Team/From VSO/TFVC Team/Page_13.1.1 Tfvc Agile - Visual Stu/span_New team'))

WebUI.setText(findTestObject('Standalone/Login/New Team/From VSO/TFVC Team/Page_13.1.1 Tfvc Agile - Visual Stu/input_groupName'), 
    teamname)

WebUI.click(findTestObject('Standalone/Login/New Team/From VSO/TFVC Team/Page_13.1.1 Tfvc Agile - Visual Stu/span_Create team'))

WebUI.navigateToUrl('https://newvsoaccount.visualstudio.com/13.1.1%20Tfvc%20Agile/team%20tfvc/_dashboards')

