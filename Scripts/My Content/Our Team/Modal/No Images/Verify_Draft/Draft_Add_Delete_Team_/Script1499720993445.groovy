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

Title = WebUI.getText(findTestObject('Page_Pages  junetest2bda/h3_Title'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Add New'))

WebUI.waitForElementPresent(findTestObject('Page_Pages  junetest2bda/Modal/div_ui-dialog ui-widget ui-wid_MyContentModal'), 
    4)

WebUI.setText(findTestObject('Page_Pages  junetest2bda/Modal/input_title0value_Title'), Title + (GlobalVariable.AddDraftTitle[
    2]))

String TeamMemberWeightValue = GlobalVariable.TeamMemberWeight

WebUI.setText(findTestObject('Page_Our Team  junetest2bda/input_field_weight0value'), TeamMemberWeightValue)

GlobalVariable.TeamMemberWeight -= 1

WebUI.verifyElementClickable(findTestObject('Page_Pages  junetest2bda/Modal/button_SaveasDraft'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/Modal/button_SaveasDraft'))

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/a_MyContent'))

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/My Content Menu/a_Our Team'))

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Delete'))

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/button_Delete'))

WebUI.waitForElementNotPresent(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/div_ui-dialog ui-widget ui-wid'), 
    2)

WebUI.verifyElementNotPresent(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/div_ui-dialog ui-widget ui-wid'), 
    2)

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/a_MyContent'))

WebUI.click(findTestObject('Page_User dashboard  junetest2bda/My Content Menu/a_Our Team'))

WebUI.verifyTextNotPresent(Title + (GlobalVariable.AddDraftTitle[2]), true)

