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

WebUI.callTestCase(findTestCase('My Content/Global TestCases/Login Via Website'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/a_MyContent'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Edit'))

WebUI.waitForElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid_MyContentModal'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid_MyContentModal'), 
    2)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/input_title0value_Title'), Title_Edit)

WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/p'), Text_Edit)

WebUI.switchToDefaultContent()

WebUI.verifyElementClickable(findTestObject('Page_Pages  junetest2bda/Modal/button_SendtoReview'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/Modal/button_SendtoReview'))

'Click to Design Tab\r\n'
WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Test Draft 1'))

WebUI.waitForPageLoad(2)

WebUI.switchToFrame(findTestObject('Page_Preview  junetest2bda/iframe_website-preview'), 10)

actual_title = WebUI.getText(findTestObject('Page_Preview  junetest2bda/span_Test Draft 1'))

WebUI.verifyMatch(actual_title, 'TEST SEND TO REVIEW EDIT 1', true)

actual_text = WebUI.getText(findTestObject('Page_Preview  junetest2bda/p_This is a Draft Test'))

WebUI.verifyMatch(actual_text, 'Send to view page is edited', true)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/Compliance Menu/a_Send to Compliance (31)'))

WebUI.verifyTextPresent(Title_Edit, true)

WebUI.closeBrowser()

