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


class demoqa {
	String username = 'test'
	String email = 'test@test.com'
	String invalidEmail = 'test'
	String currentAddress = 'jl. jl. ke pasar baru'
	String permanentAddress = 'permanent jl. jl. ke pasar baru'

	@Given("User on Demo QA Page")
	def validateDemoQAPage() {
		WebUI.openBrowser('https://demoqa.com')
		WebUI.maximizeWindow()
	}

	@When("User click Elements Menu button")
	def clickElements() {
		WebUI.scrollToElement(findTestObject('Object Repository/Demo QA/btn_elements'), 10)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo QA/btn_elements'), 10)
		WebUI.click(findTestObject('Object Repository/Demo QA/btn_elements'))
	}

	@When("User click Text Box Menu button")
	def clickTextBox() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo QA/btn_textbox'), 5)
		WebUI.click(findTestObject('Object Repository/Demo QA/btn_textbox'))
	}

	@When("User click Check Box Menu button")
	def clickCheckBox() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo QA/btn_checkbox'), 5)
		WebUI.click(findTestObject('Object Repository/Demo QA/btn_checkbox'))
	}

	@When("User click Submit button")
	def clickSubmit() {
		WebUI.scrollToElement(findTestObject('Object Repository/Demo QA/btn_submit'), 10)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo QA/btn_submit'), 10)
		WebUI.click(findTestObject('Object Repository/Demo QA/btn_submit'))
	}

	@When("User click + button")
	def clickExpand() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo QA/btn_expand'), 5)
		WebUI.click(findTestObject('Object Repository/Demo QA/btn_expand'))
	}

	@When("User click - button")
	def clickCollapse() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo QA/btn_collapse'), 5)
		WebUI.click(findTestObject('Object Repository/Demo QA/btn_collapse'))
	}

	@When("User input Username Field")
	def inputUsername() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/field_username'), 5)
		WebUI.setText(findTestObject('Object Repository/Demo QA/field_username'), username)
	}

	@When("User input (.*)Email Field")
	def inputEmail(String emailFormat) {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/field_email'), 5)
		switch (emailFormat) {
			case '':
				WebUI.setText(findTestObject('Object Repository/Demo QA/field_email'), email)
				break;
			case 'Invalid ':
				WebUI.setText(findTestObject('Object Repository/Demo QA/field_email'), invalidEmail)
				break;
			default:
				throw new Error('option does not exist')
		}
	}

	@When("User input Current Address Field")
	def inputCurrentAddress() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/field_currentAddress'), 5)
		WebUI.setText(findTestObject('Object Repository/Demo QA/field_currentAddress'), currentAddress)
	}

	@When("User input Permanent Address Field")
	def inputPermanentAddress() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/field_permanentAddress'), 5)
		WebUI.setText(findTestObject('Object Repository/Demo QA/field_permanentAddress'), permanentAddress)
	}

	@Then("User successfully (.*) all menu")
	def validateExpandCollapse(String view) {
		switch (view) {
			case 'expand':
				WebUI.verifyElementPresent(findTestObject('Object Repository/Demo QA/label_desktop'), 3)
				WebUI.verifyElementPresent(findTestObject('Object Repository/Demo QA/label_documents'), 3)
				WebUI.verifyElementPresent(findTestObject('Object Repository/Demo QA/label_downloads'), 3)
				break;
			case 'collapse':
				WebUI.verifyElementNotPresent(findTestObject('Object Repository/Demo QA/label_desktop'), 3)
				break;
			default:
				throw new Error('option does not exist')
		}
		WebUI.closeBrowser()
	}

	@Then("User can(.*) view Submitted Data")
	def validateSubmitted(String view) {
		switch (view) {
			case '':
				WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/txt_output'), 5)
				break;
			case ' not':
				WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/txt_output'), 5)
				break;
			default:
				throw new Error('option does not exist')
		}
		WebUI.closeBrowser()
	}
}