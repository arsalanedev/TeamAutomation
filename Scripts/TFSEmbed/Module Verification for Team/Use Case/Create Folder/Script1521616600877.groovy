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

WebUI.callTestCase(findTestCase('TFSEmbed/Login/Existing Team/From TFS 2017/GIT Team/Login git'), [:], FailureHandling.STOP_ON_FAILURE)

String  Foldername  =  CustomKeywords.'keyword.edevkatalon.com.GeneralKeywords.GetRandomString'()

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Use Case/Create Folder from New/Page_Overview dashboard - Microsoft/span_Work'))

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Use Case/Create Folder from New/Page_Requirements/span_Simulation and Use case'))

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Use Case/Create Folder from New/Page_Simulation and Use case - Micr/span_k-icon  k-i-arrow-60-down'))

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Use Case/Create Folder from New/Page_Simulation and Use case - Micr/span_Folder'))

WebUI.setText(findTestObject('TFSEmbed/Modules Objects/Use Case/Create Folder from New/Page_Simulation and Use case - Micr/input_txtNewFolderName'), 
    Foldername)

WebUI.click(findTestObject('TFSEmbed/Modules Objects/Use Case/Create Folder from New/Page_Simulation and Use case - Micr/input_newFolderOkButton'))

