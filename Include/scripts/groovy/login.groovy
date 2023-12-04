import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class login {
	String demoWebShopUrl = 'https://demowebshop.tricentis.com/'
	String loginButton = 'Object Repository/Demo Web Shop/Page_Demo Web Shop/a_Log in'
	String userNameField = 'Object Repository/Demo Web Shop/Page_Demo Web Shop. Login/input_Email_Email'
	String passwordField = 'Object Repository/Demo Web Shop/Page_Demo Web Shop. Login/input_Password_Password'
	String submitButton = 'Object Repository/Demo Web Shop/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'
	String emailText = 'Object Repository/Demo Web Shop/Page_Demo Web Shop/a_akbarmhmmmdgmail.com'
	String logoutButton = 'Object Repository/Demo Web Shop/Page_Demo Web Shop. Account/a_Log out'

	@Given("User on Login Page")
	def validateLoginPage() {
		println ("\nUser on Login Page")
		WebUI.openBrowser('')
		WebUI.navigateToUrl(demoWebShopUrl)
		WebUI.click(findTestObject(loginButton))
	}

	@When("User enter username (.*)")
	def userEnterUsername(String username) {
		println ("\nUser enter username")
		println ("Username: "+ username)
		WebUI.setText(findTestObject(userNameField), username)
	}

	@When("User enter password (.*)")
	def userEnterPassword(String password) {
		println ("\nUser enter password")
		println ("Password: "+ password)
		WebUI.setEncryptedText(findTestObject(passwordField), password)
	}

	@When("User is click submit Button")
	def userClickSubmit() {
		println ("\nUser click submit button")
		WebUI.click(findTestObject(submitButton))
	}

	@Then("User successfully Login")
	def validateLogin() {
		println ("\nUser successfully Login")
		WebUI.verifyElementPresent(findTestObject(emailText), 0)
		WebUI.click(findTestObject(logoutButton))
		WebUI.closeBrowser()
	}
}
