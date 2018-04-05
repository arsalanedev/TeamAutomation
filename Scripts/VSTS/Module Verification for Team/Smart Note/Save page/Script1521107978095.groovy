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

WebUI.callTestCase(findTestCase('VSTS/Login/Existing Team/TFVC Team/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/Page_Overview dashboard - Visual St (1)/span_Work'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/Page_Product backlog (1)/span_SmartNote'))

WebUI.waitForElementClickable(findTestObject('VSTS/Modules Objects/Smart Note/Page_SmartNote - Visual Studio Team/span_New'), 
    5)

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/Page_SmartNote - Visual Studio Team/span_New'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/Page_SmartNote - Visual Studio Team/span_Page'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/Page_SmartNote - Visual Studio Team/div_k-overlay'))

WebUI.setText(findTestObject('Page_SmartNote - Visual Studio Team/input_ig-newfile-textbox-snt-n'), 'NEW PAGE')

WebUI.click(findTestObject('Page_SmartNote - Visual Studio Team/input_ig-newfile-ok-button-snt'))

WebUI.click(findTestObject('Page_SmartNote - Visual Studio Team/div_sn_designerArea'))

WebUI.click(findTestObject('Page_SmartNote - Visual Studio Team/span_savedropdown'))

WebUI.click(findTestObject('Page_SmartNote - Visual Studio Team/span_Save'))

WebUI.closeBrowser()

