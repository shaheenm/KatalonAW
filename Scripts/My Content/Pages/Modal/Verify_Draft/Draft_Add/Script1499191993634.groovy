import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.jsoup.select.Evaluator.ContainsText as ContainsText
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

WebUI.navigateToUrl(GlobalVariable.Accounts)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Log in  AW Force/input_name_Username'), GlobalVariable.Username)

WebUI.setText(findTestObject('Page_Log in  AW Force/input_pass_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Page_Log in  AW Force/input_op_Submit'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/a_MyContent'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Add New'))

WebUI.waitForElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid'), 2)

WebUI.verifyElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid'), 2)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/input_title0value_Title'), Title)

WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/p'), Text)

WebUI.switchToDefaultContent()

WebUI.verifyElementClickable(findTestObject('Page_Pages  junetest2bda/Modal/button_SaveasDraft'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/Modal/button_SaveasDraft'))

WebUI.waitForPageLoad(2)

WebUI.switchToFrame(findTestObject('Page_Preview  junetest2bda/iframe_website-preview'), 10)

actual_title = WebUI.getText(findTestObject('Page_Preview  junetest2bda/span_Test Draft 1'))

WebUI.verifyMatch(actual_title, 'TEST DRAFT 1', true)

actual_text = WebUI.getText(findTestObject('Page_Preview  junetest2bda/p_This is a Draft Test'))

WebUI.verifyMatch(actual_text, 'This is a Draft Test', true)

WebUI.closeBrowser()

