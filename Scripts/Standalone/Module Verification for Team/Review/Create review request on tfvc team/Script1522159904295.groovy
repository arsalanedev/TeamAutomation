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

WebUI.callTestCase(findTestCase('Standalone/Login/New Team/From TFS 2013/TFVC Team/Login To Team Project'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/span_MANAGE'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/span_k-icon  k-i-arrow-60-down'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/span_Review Request'))

WebUI.setText(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_rvm-req-stakeholdercombo'), 
    's')

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/li_Shehzad Ali'))

WebUI.setText(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_rvm-req-approverscombobo'), 
    's')

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/li_Syed Saad'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/div_Title of review item'))

WebUI.setText(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_rvm-req-workitremtitletx'), 
    'review1')

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/Page_Modern Requirements4TFS 2018/span_Add Work Item'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/Page_Modern Requirements4TFS 2018/div_ Select a Query'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/Page_Modern Requirements4TFS 2018/div_e-treegridcollapse e-icon'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/Page_Modern Requirements4TFS 2018/div_Product Backlog'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_ig-linkToWindow-btnFind-'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_ig-linkToWindow-SelectAl'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_ig-linkToWindow-OkBtn-rv'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/span_Add Work Item'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/div_Select one of the followin'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_options'))

WebUI.setText(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_ig-linkToWidow-txtIds-rv'), 
    '1')

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_ig-linkToWindow-btnFind-'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_ig-linkToWindow-SelectAl'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_ig-linkToWindow-OkBtn-rv'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/div_jqx-icon-arrow-down jqx-ic_1'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/div_Project katalon Scrum Tfvc'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/span_k-icon k-i-calendar'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/a_28'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_rvm-req-btnpreview'))

WebUI.click(findTestObject('Standalone/Modules Objects/Review/create review request/Page_Modern Requirements4TFS 2018 (2)/input_rvm-req-btnsend'))

