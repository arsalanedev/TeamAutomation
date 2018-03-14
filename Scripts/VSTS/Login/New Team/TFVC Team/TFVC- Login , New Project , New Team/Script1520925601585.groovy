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

String projectName = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

String TeamName = CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

WebUI.callTestCase(findTestCase('VSTS/Login/Login VSTS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('New Project and Team for VSTS and Embed 2017/newProject-btn'))

WebUI.setText(findTestObject('New Project and Team for VSTS and Embed 2017/newProjectTextField'), projectName)

WebUI.waitForElementClickable(findTestObject('New Project and Team for VSTS and Embed 2017/button_Create'), 5)

WebUI.click(findTestObject('New Project and Team for VSTS and Embed 2017/button_Create'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('New Project and Team for VSTS and Embed 2017/ProjectNameOnDashboard - Project name for Team'), 10)

WebUI.click(findTestObject('New Project and Team for VSTS and Embed 2017/Project dropdown for Create Team'))

WebUI.delay(5)

WebUI.click(findTestObject('New Project and Team for VSTS and Embed 2017/span_New team'))

WebUI.delay(5)

WebUI.setText(findTestObject('New Project and Team for VSTS and Embed 2017/input_groupName'), TeamName)

WebUI.delay(5)

WebUI.click(findTestObject('New Project and Team for VSTS and Embed 2017/span_Create team'))

WebUI.delay(20)

