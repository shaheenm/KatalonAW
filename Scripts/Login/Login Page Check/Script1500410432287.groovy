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

WebUI.openBrowser(GlobalVariable.Website)

WebUI.verifyElementPresent(findTestObject('Page_Log in  AW Force/img_logo'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Log in  AW Force/label_Email_or_username'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Log in  AW Force/input_name_Username'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Log in  AW Force/label_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Log in  AW Force/input_pass_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Log in  AW Force/input_op_Submit'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Log in  AW Force/li_Further instructions have b'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Log in  AW Force/a_Forgot Password'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Log in  AW Force/a_Create an account'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Log in  AW Force/input_google'), 0)

WebUI.closeBrowser()

