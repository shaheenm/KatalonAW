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

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Delete'))

WebUI.waitForElementPresent(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/div_ui-dialog ui-widget ui-wid'), 
    1)

'Verify Cancel Button\\r\\n'
WebUI.click(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/button_Cancel'))

WebUI.waitForElementNotPresent(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/div_ui-dialog ui-widget ui-wid'), 
    1)

WebUI.click(findTestObject('Page_Pages  junetest2bda/a_Delete'))

WebUI.waitForElementPresent(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/div_ui-dialog ui-widget ui-wid'), 
    1)

'Verify Close button\\r\\n'
WebUI.click(findTestObject('Page_Pages  junetest2bda/Modal/Button_Close'))

WebUI.waitForElementNotPresent(findTestObject('Page_User dashboard  junetest2bda/Delete Modal/div_ui-dialog ui-widget ui-wid'), 
    1)

