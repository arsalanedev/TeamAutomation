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

WebUI.click(findTestObject('Standalone/Modules Objects/Smart Note/Page_Overview dashboard - Microsoft (2)/Work_tab'))

WebUI.click(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/New_dropdown'))

WebUI.click(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/Page_en_NewDropdown'))

WebUI.click(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/Name_page'))

WebUI.setText(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/Name_page'), 
    '')

WebUI.click(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/OkButton_page_creation'))

WebUI.click(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/editor_area'))

WebUI.click(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/editor_ContainerArea'))

WebUI.setText(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/editor_ContainerArea'), 
    'asdasd')

WebUI.click(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/Save_dropdown'))

WebUI.click(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/Save_en_saveDropdown'))

WebUI.verifyElementVisible(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/notification_save_message'))

WebUI.refresh()

WebUI.verifyElementText(findTestObject('Standalone/Modules Objects/Smart Note/Page_SmartNote - Microsoft Team Fou (2)/editor_ContainerArea'), 
    'asdasd')

