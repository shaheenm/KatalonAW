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

'Bold\r\n'
try {
    WebUI.click(findTestObject('CKEditor/a_cke_11_Bold'))

    WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

    WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Bold)

    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

    WebUI.switchToDefaultContent()

    WebUI.click(findTestObject('CKEditor/a_cke_11_Bold'))
}
catch (Exception e) {
    WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Bold + '.png')
} 


'Italics\r\n'
try {
    WebUI.click(findTestObject('CKEditor/a_cke_12_Italic'))

    WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

    WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Italics)

    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

    WebUI.switchToDefaultContent()

    WebUI.click(findTestObject('CKEditor/a_cke_12_Italic'))
}
catch (Exception e) {
    WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Italics + '.png')
} 


'Underline\r\n'
try {
    WebUI.click(findTestObject('CKEditor/a_cke_13_Underline'))

    WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

    WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Underline)

    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

    WebUI.switchToDefaultContent()

    WebUI.click(findTestObject('CKEditor/a_cke_13_Underline'))
}
catch (Exception e) {
    WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Underline + '.png')
} 


'Subscript\r\n'
try {
    WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_14_Subscript'))

    WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

    WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Subscript)

    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

    WebUI.switchToDefaultContent()

    WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_14_Subscript'))
}
catch (Exception e) {
    WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Subscript + '.png')

}

'Superscript\r\n'
try {
    WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_15_Superscript'))

    WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

    WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Superscript)

    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

    WebUI.switchToDefaultContent()

    WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_15_Superscript'))
}
catch (Exception e) {
    WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Superscript + '.png')
}


'Left Alignment\r\n'
try {
	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_17_left_align')  )

	WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

	WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Leftalign)

	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

	WebUI.switchToDefaultContent()

	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_17_left_align')  )
}
catch (Exception e) {
	WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Leftalign + '.png')
}

'Center Alignment\r\n'
try {
	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_18_center_align')  )

	WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

	WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Centeralign)

	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

	WebUI.switchToDefaultContent()

	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_18_center_align')  )
}
catch (Exception e) {
	WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Centeralign + '.png')
}

'Right Alignment\r\n'
try {
	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_19_right_align')  )

	WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

	WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Rightalign)

	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

	WebUI.switchToDefaultContent()

	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_19_right_align')  )
}
catch (Exception e) {
	WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Rightalign + '.png')
}

'Justified Alignment\r\n'
try {
	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_20_justified')  )

	WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

	WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Justified)

	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

	WebUI.switchToDefaultContent()

	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_20_justified')  )
}
catch (Exception e) {
	WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Justified + '.png')
}

'Quote\r\n'
try {
	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_23_quote')  )

	WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

	WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Quote)

	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

	WebUI.switchToDefaultContent()

	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_23_quote')  )
}
catch (Exception e) {
	WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Quote + '.png')
}

'Horizontal Line\r\n'
try {
	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_24_Horizontal_line'))

	WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

	WebUI.switchToDefaultContent()

}
catch (Exception e) {
	WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Quote + '.png')
}


'Quote\r\n'
try {
	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_24_Bulletpoint')  )

	WebUI.switchToFrame(findTestObject('Page_Pages  junetest2bda/Modal/iframe_cke_wysiwyg_frame cke_r (2)'), 4)

	WebUI.sendKeys(findTestObject('Page_Pages  junetest2bda/Modal/p'), Bulletpoint)

	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

	WebUI.switchToDefaultContent()

	WebUI.click(findTestObject('Object Repository/CKEditor/a_cke_24_Bulletpoint')  )
}
catch (Exception e) {
	WebUI.takeScreenshot('C:/Users/Cindy/Desktop/screenshots/' + Bulletpoint + '.png')
}

