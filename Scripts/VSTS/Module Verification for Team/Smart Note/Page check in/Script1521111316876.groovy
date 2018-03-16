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

WebUI.openBrowser('https://automationkatalon.visualstudio.com/xktl3tcg72/21e05d5804/')

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_Overview dashboard - Visual St/span_Work'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_Work Items - Visual Studio Tea/span_SmartNote'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/Page_SmartNote - Visual Studio Team/span_New'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/Page_SmartNote - Visual Studio Team/span_Page'))

WebUI.setText(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_SmartNote - Visual Studio Team/input_ig-newfile-textbox-snt-n'), 
    'ASDSAD')

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_SmartNote - Visual Studio Team/input_ig-newfile-ok-button-snt'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_SmartNote - Visual Studio Team/div_'))

WebUI.sendKeys(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_SmartNote - Visual Studio Team/div_ASDASDSADASDASDASD'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_SmartNote - Visual Studio Team/span_k-icon  k-i-arrow-60-down'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_SmartNote - Visual Studio Team/span_Check In Changes'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_SmartNote - Visual Studio Team/a_257'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_SmartNote - Visual Studio Team/img_saveAsImg'))

WebUI.click(findTestObject('VSTS/Modules Objects/Smart Note/CHECK IN CHANGES/Page_SmartNote - Visual Studio Team/span_Save  Close'))

WebUI.closeBrowser()

