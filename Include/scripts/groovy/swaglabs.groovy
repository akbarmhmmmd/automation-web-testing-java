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



class swaglabs {
	String sauceDemoUrl = 'https://www.saucedemo.com'
	String standardUser = 'standard_user'
	String lockedOutUser = 'locked_out_user'
	String problemUser = 'problem_user'
	String wrongUser = 'user'
	String wrongPass = 'pass'
	String password = 'secret_sauce'
	
	@Given("User on Swag Labs page")
	def validateSwagLabsPage() {
		WebUI.openBrowser(sauceDemoUrl)
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/swagLabs_txt'), 5)
	}

	@When("User input (.*) User username")
	def inputUser(String user) {
		switch(user) {
			case 'Standard':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/userField'), 3)
				WebUI.setText(findTestObject('Object Repository/SwagLabs/userField'), standardUser)
			break;
			case 'Locked Out':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/userField'), 3)
				WebUI.setText(findTestObject('Object Repository/SwagLabs/userField'), lockedOutUser)
			break;
			case 'Problem':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/userField'), 3)
				WebUI.setText(findTestObject('Object Repository/SwagLabs/userField'), problemUser)
			break;
			case 'Wrong':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/userField'), 3)
				WebUI.setText(findTestObject('Object Repository/SwagLabs/userField'), wrongUser)
			break;
			default:
				throw new Error('option does not exist')
		}
	}
	
	@When("User input (.*) password")
	def inputPass(String pass) {
		WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/passField'), 3)
		switch(pass) {
			case 'correct':
				WebUI.setText(findTestObject('Object Repository/SwagLabs/passField'), password)
			break;
			case 'incorrect':
				WebUI.setText(findTestObject('Object Repository/SwagLabs/passField'), wrongPass)
			break;
			default:
				throw new Error('option does not exist')
		}
	}
	
	@When("User click Login button")
	def clickLogin() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/login_btn'), 3)
		WebUI.click(findTestObject('Object Repository/SwagLabs/login_btn'))
	}

	@Then("User successfully redirected to (.*) Home page")
	def validatePage(String page) {
		switch(page) {
			case 'Standard':
				WebUI.waitForElementVisible(findTestObject('Object Repository/SwagLabs/products_txt'), 5)
			break;
			case 'Problem':
				WebUI.waitForElementVisible(findTestObject('Object Repository/SwagLabs/problem_img'), 5)
			break;
			default:
				throw new Error('page does not exist')
		}
		WebUI.closeBrowser()
	}
	
	@Then("User can see (.*) error message")
	def validateErrorLocked(String error) {
		switch(error) {
			case 'locked out':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/lockedOut_txt'), 3)
			break;
			case 'credential':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/credentialError_txt'), 3)
			break;
			default:
				throw new Error('message does not exist')
		}
		WebUI.closeBrowser()
	}
}
