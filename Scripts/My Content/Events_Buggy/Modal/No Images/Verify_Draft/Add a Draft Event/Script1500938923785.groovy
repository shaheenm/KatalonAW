import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.Month as Month
import javax.lang.model.element.VariableElement as VariableElement
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

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/My Content Menu/a_Events'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Add New'))

Title = WebUI.getText(findTestObject('Page_Pages  junetest2bda/h3_Title'))

WebUI.waitForElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid_MyContentModal'), 
    5)

WebUI.verifyElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid_MyContentModal'), 
    2)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/input_title0value_Title'), Title + (GlobalVariable.AddDraftTitle[
    0]))

'Random Ckeditor Text Generator\\r\\n'
Ctext = CustomKeywords.'random.Rand_CkEd_Text.rand_text'(GlobalVariable.CKText)

WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/p'), Ctext)

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Page_Events  Advisor Websites/input_field_location0value'), GlobalVariable.EventsLDD[0])

WebUI.sendKeys(findTestObject('Page_Events  Advisor Websites/input_field_date_from0valuetim'), (GlobalVariable.EventsLDD[
    3]) + Keys.chord(Keys.UP))

WebUI.sendKeys(findTestObject('Page_Events  Advisor Websites/input_field_date_to0valuetime'), (GlobalVariable.EventsLDD[
    4]) + Keys.chord(Keys.UP))

WebUI.setText(findTestObject('Page_Events  Advisor Websites/input_field_date_from0valuedat'), GlobalVariable.EventsLDD[1])

WebUI.setText(findTestObject('Page_Events  Advisor Websites/input_field_date_to0valuedate'), GlobalVariable.EventsLDD[2])

WebUI.sendKeys(findTestObject('Page_Events  Advisor Websites/input_field_date_to0valuetime'), Keys.chord(Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('Page_Pages  junetest2bda/Modal/button_SaveasDraft'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/Modal/button_SaveasDraft'))

WebUI.waitForPageLoad(2)

WebUI.switchToFrame(findTestObject('Page_Preview  junetest2bda/iframe_website-preview'), 10)

CapTitle = CustomKeywords.'random.Capitals.makeCap'(Title + (GlobalVariable.AddDraftTitle[0]))

WebUI.verifyTextPresent(Ctext, true)

WebUI.verifyTextPresent(CapTitle, true)

WebUI.verifyTextPresent(GlobalVariable.EventsLDD[0], true)

not_run: WebUI.verifyTextPresent(GlobalVariable.EventsLDD[1], true)

not_run: WebUI.verifyTextPresent(GlobalVariable.EventsLDD[2], true)

WebUI.verifyTextPresent(GlobalVariable.EventsLDD[3], true)

WebUI.verifyTextPresent(GlobalVariable.EventsLDD[4], true)

WebUI.switchToDefaultContent()

