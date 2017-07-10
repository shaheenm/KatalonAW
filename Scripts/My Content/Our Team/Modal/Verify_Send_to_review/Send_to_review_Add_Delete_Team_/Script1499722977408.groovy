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

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/My Content Menu/a_Our Team'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Add New'))

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

WebUI.verifyElementClickable(findTestObject('Page_Pages  junetest2bda/Modal/button_SendtoReview'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/Modal/button_SendtoReview'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/Compliance Menu/a_Send to Compliance (31)'))

WebUI.verifyTextPresent(Title, true)

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/a_MyContent'))

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/My Content Menu/a_Our Team'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Delete'))

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/button_Delete'))

WebUI.waitForElementNotPresent(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/div_ui-dialog ui-widget ui-wid'), 
    2)

WebUI.verifyElementNotPresent(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/div_ui-dialog ui-widget ui-wid'), 
    2)

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/Compliance Menu/a_Send to Compliance (31)'))

WebUI.verifyTextNotPresent(Title, true)

WebUI.closeBrowser()

