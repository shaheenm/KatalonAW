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

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/a_MyContent'))

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/My Content Menu/a_Our Team'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Edit'))

WebUI.waitForElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid_MyContentModal'), 
    2)

WebUI.verifyElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid_MyContentModal'), 
    2)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/input_title0value_Title'), Title)

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_designation0value'), Designation)

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_email0value'), Email)

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/textarea_field_role_title0valu'), License)

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_facebook0uri'), Facebook)

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_linkedin0uri'), Linkedin)

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_twitter0uri'), Twitter)

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_phone0value'), Phone)

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_skype0value'), Skype)

WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/p'), Text)

WebUI.switchToDefaultContent()

WebUI.verifyElementClickable(findTestObject('Page_Pages  junetest2bda/Modal/button_SaveasDraft'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/Modal/button_SaveasDraft'))

'Click to Design Tab\\r\\n'
WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Test Draft Other'))

WebUI.waitForPageLoad(2)

WebUI.switchToFrame(findTestObject('Page_Preview  junetest2bda/iframe_website-preview'), 10)

WebUI.verifyElementText(findTestObject('Page_Preview  junetest2bda/span_Test Draft 1'), 'TEST TEAM EDIT DRAFT 1')

not_run: WebUI.verifyElementText(findTestObject('Page_Preview  junetest2bda/p_This is a Team Draft Test'), 'This is a Team Edit Draft Test')

not_run: WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/a_123-123-1322'), 1)

not_run: WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/a_nameexample.com'), 1)

not_run: WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/div_CPA CFFA'), 1)

not_run: WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/div_Financial Advisor'), 1)

not_run: WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/i_fi-social-facebook'), 1)

not_run: WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/i_fi-social-linkedin'), 1)

not_run: WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/i_fi-social-skype'), 1)

not_run: WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/i_fi-social-twitter'), 1)

WebUI.switchToDefaultContent()

println(GlobalVariable.TeamMemberWeight)

