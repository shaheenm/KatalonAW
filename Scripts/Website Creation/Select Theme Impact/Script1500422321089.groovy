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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.Account)

WebUI.click(findTestObject('Page_Log in  AW Force/a_Create an account'))

WebUI.verifyElementPresent(findTestObject('Page_AW Force Website Builder/Themes/label_Select a theme'), 1)

WebUI.click(findTestObject('Page_AW Force Website Builder/Themes/span_Reaction'))

'Try Clicking\\r\\n'
try {
    WebUI.setText(findTestObject('Page_AW Force Website Builder/Themes/input_select2-search__field'), 'Impact')

    WebUI.click(findTestObject('Page_AW Force Website Builder/Themes/li_Impact'))
}
finally { 
    WebUI.click(findTestObject('Page_AW Force Website Builder/Themes/span_select2-selection__arrow'))

    WebUI.click(findTestObject('Page_AW Force Website Builder/Themes/li_Reaction'))
}

WebUI.click(findTestObject('Page_AW Force Website Builder/Themes/span_Reaction'))

try {
    WebUI.setText(findTestObject('Page_AW Force Website Builder/Themes/input_select2-search__field'), 'Impact')

    WebUI.sendKeys(findTestObject('Page_AW Force Website Builder/Themes/input_select2-search__field'), Keys.chord(Keys.ENTER))
}
finally { 
    println('enter works')
}

