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

WebUI.callTestCase(findTestCase('My Content/Events_Buggy/Modal/No Images/Verify_Send_to_review/Send_to_review_Add_Event_'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/a_MyContent'))

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/My Content Menu/a_Events'))

Title = WebUI.getText(findTestObject('Page_Pages  junetest2bda/h3_Title'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Edit'))

WebUI.waitForElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid_MyContentModal'), 
    5)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/input_title0value_Title'), Title + (GlobalVariable.AddDraftTitle[
    7]))

println(GlobalVariable.TeamMemberWeight)

'Random Ckeditor Text Generator\\r\\n'
Ctext = CustomKeywords.'random.Rand_CkEd_Text.rand_text'(GlobalVariable.CKText)

WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/p'), Ctext)

WebUI.switchToDefaultContent()

WebUI.verifyElementClickable(findTestObject('Page_Pages  junetest2bda/Modal/button_SaveasDraft'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/Modal/button_SaveasDraft'))

'Click to Design Tab\\r\\n'
WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Test Draft Pages only'))

WebUI.waitForPageLoad(2)

WebUI.switchToFrame(findTestObject('Page_Preview  junetest2bda/iframe_website-preview'), 10)

CapTitle = CustomKeywords.'random.Capitals.makeCap'(Title + (GlobalVariable.AddDraftTitle[7]))

WebUI.verifyTextPresent(CapTitle, true)

WebUI.switchToDefaultContent()

not_run: WebUI.click(findTestObject('Page_User dashboard  junetest2bda/Compliance Menu/a_Send to Compliance (31)'))
