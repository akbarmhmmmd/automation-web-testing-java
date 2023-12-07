import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class demoweb {
	@Keyword
	def static void login(String webURL, String email, String password) {
		WebUI.openBrowser(webURL)
		WebUI.waitForPageLoad(5)
		WebUI.maximizeWindow()

		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo Web Shop/Page_Demo Web Shop/a_Log in'), 3)
		WebUI.click(findTestObject('Object Repository/Demo Web Shop/Page_Demo Web Shop/a_Log in'))
		WebUI.sendKeys(findTestObject('Object Repository/Demo Web Shop/Page_Demo Web Shop. Login/input_Email_Email'), email)
		WebUI.sendKeys(findTestObject('Object Repository/Demo Web Shop/Page_Demo Web Shop. Login/input_Password_Password'), password)
		WebUI.click(findTestObject('Object Repository/Demo Web Shop/Page_Demo Web Shop/Log in'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo Web Shop/Page_Demo Web Shop/a_akbarmhmmmdgmail.com'), 5)
	}

	@Keyword
	def static void loginWithGlobalVariable() {
		login(GlobalVariable.webURL, GlobalVariable.email, GlobalVariable.password)
	}

	@Keyword
	def static void search() {
		WebUI.sendKeys(findTestObject('Object Repository/Demo QA/field_searchStore'), GlobalVariable.productName)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo QA/btn_searchStore'), 2)
		WebUI.click(findTestObject('Object Repository/Demo QA/btn_searchStore'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/txt_searchResults'), 2)
	}
}
