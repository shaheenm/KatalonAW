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

WebUI.callTestCase(findTestCase('My Content/Our Team/Modal/No Images/Verify_Send_to_review/Send_to_review_Add_Team_'), [
        ('Title') : 'Test Team Review Edit Draft 1', ('Text') : 'This is a Team Draft Test', ('Phone') : '123-123-1322', ('Designation') : 'Financial Advisor'
        , ('Email') : 'name@example.com', ('Facebook') : 'http://www.facebook.com', ('Linkedin') : 'http://www.linkedin.com'
        , ('Twitter') : 'http://www.twitter.com', ('Skype') : 'skype@example.com', ('License') : 'CPA, CFFA'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/a_MyContent'))

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/My Content Menu/a_Our Team'))

Title = WebUI.getText(findTestObject('Page_Pages  junetest2bda/h3_Title'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Edit'))

WebUI.waitForElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid_MyContentModal'), 
    5)

WebUI.verifyElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid_MyContentModal'), 
    2)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/input_title0value_Title'), Title + (GlobalVariable.AddDraftTitle[
    5]))

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_phone0value'), GlobalVariable.Teamedit_PEDLIFTS[0])

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_email0value'), GlobalVariable.Teamedit_PEDLIFTS[1])

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_designation0value'), GlobalVariable.Teamedit_PEDLIFTS[
    2])

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/textarea_field_role_title0valu'), GlobalVariable.Teamedit_PEDLIFTS[
    3])

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_linkedin0uri'), GlobalVariable.Teamedit_PEDLIFTS[4])

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_facebook0uri'), GlobalVariable.Teamedit_PEDLIFTS[5])

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_twitter0uri'), GlobalVariable.Teamedit_PEDLIFTS[6])

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_skype0value'), GlobalVariable.Teamedit_PEDLIFTS[7])

String TeamMemberWeightValue = GlobalVariable.TeamMemberWeight

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_weight0value'), TeamMemberWeightValue)

GlobalVariable.TeamMemberWeight -= 1

println(GlobalVariable.TeamMemberWeight)

'Random Ckeditor Text Generator\\r\\n'
Ctext = CustomKeywords.'random.Rand_CkEd_Text.rand_text'(GlobalVariable.CKText)

WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/p'), Ctext)

WebUI.switchToDefaultContent()

WebUI.verifyElementClickable(findTestObject('Page_Pages  junetest2bda/Modal/button_SendtoReview'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/Modal/button_SendtoReview'))

'Click to Design Tab\\r\\n'
WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Test Draft Other'))

WebUI.waitForPageLoad(2)

WebUI.switchToFrame(findTestObject('Page_Preview  junetest2bda/iframe_website-preview'), 10)

CapTitle = CustomKeywords.'random.Capitals.makeCap'(Title + (GlobalVariable.AddDraftTitle[5]))

WebUI.verifyTextPresent(CapTitle, true)

WebUI.verifyTextPresent(GlobalVariable.Teamedit_PEDLIFTS[0], true)

WebUI.verifyTextPresent(GlobalVariable.Teamedit_PEDLIFTS[1], true)

WebUI.verifyTextPresent(GlobalVariable.Teamedit_PEDLIFTS[2], true)

WebUI.verifyTextPresent(GlobalVariable.Teamedit_PEDLIFTS[3], true)

WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/Team Members/i_fi-social-linkedin'), 1)

WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/Team Members/i_fi-social-facebook'), 1)

WebUI.verifyElementPresent(findTestObject('Page_Preview  junetest2bda/Team Members/i_fi-social-twitter'), 1)

WebUI.verifyElementNotPresent(findTestObject('Page_Preview  junetest2bda/Team Members/i_fi-social-skype'), 1)

WebUI.verifyElementAttributeValue(findTestObject('Page_Preview  junetest2bda/Team Members/a_linkedin'), 'href', GlobalVariable.Teamedit_PEDLIFTS[
    4], 1)

WebUI.verifyElementAttributeValue(findTestObject('Page_Preview  junetest2bda/Team Members/a_facebook'), 'href', GlobalVariable.Teamedit_PEDLIFTS[
    5], 1)

WebUI.verifyElementAttributeValue(findTestObject('Page_Preview  junetest2bda/Team Members/a_twitter'), 'href', GlobalVariable.Teamedit_PEDLIFTS[
    6], 1)

not_run: WebUI.verifyElementAttributeValue(findTestObject('Page_Preview  junetest2bda/Team Members/a_skype'), 'href', GlobalVariable.Teamedit_PEDLIFTS[
    7], 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToDefaultContent()

not_run: WebUI.click(findTestObject('Page_User dashboard  junetest2bda/Compliance Menu/a_Send to Compliance (31)'))

