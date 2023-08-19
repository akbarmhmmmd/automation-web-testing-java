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
	String currentAddress = 'jl. jl. ke pasar baru'
	String permanentAddress = 'permanent jl. jl. ke pasar baru'
	
	@Given("User on Demo QA Page")
	def validateDemoQAPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://demoqa.com')
	}

	@When("User click Elements Menu button")
	def clickElements() {
		WebUI.scrollToElement(findTestObject('Object Repository/Demo QA/elements_button'), 10)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo QA/elements_button'), 10)
		WebUI.click(findTestObject('Object Repository/Demo QA/elements_button'))
	}
	
	@When("User click Text Box Menu button")
	def clickTextBox() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo QA/textbox_button'), 10)
		WebUI.click(findTestObject('Object Repository/Demo QA/textbox_button'))
	}
	
	@When("User click Submit button")
	def clickSubmit() {
		WebUI.scrollToElement(findTestObject('Object Repository/Demo QA/submit_button'), 10)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Demo QA/submit_button'), 10)
		WebUI.click(findTestObject('Object Repository/Demo QA/submit_button'))
	}
	
	@When("User input Username Field")
	def inputUsername() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/username_field'), 0)
		WebUI.setText(findTestObject('Object Repository/Demo QA/username_field'), username)
	}
	
	@When("User input Email Field")
	def inputEmail() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/email_field'), 0)
		WebUI.setText(findTestObject('Object Repository/Demo QA/email_field'), email)
	}
	
	@When("User input Current Address Field")
	def inputCurrentAddress() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/currentAddress_field'), 0)
		WebUI.setText(findTestObject('Object Repository/Demo QA/currentAddress_field'), currentAddress)
	}
	
	@When("User input Permanent Address Field")
	def inputPermanentAddress() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/permanentAddress_field'), 0)
		WebUI.setText(findTestObject('Object Repository/Demo QA/permanentAddress_field'), permanentAddress)
	}

	@Then("User can view Submitted Data")
	def validateSubmitted() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Demo QA/output_text'), 0)
		WebUI.closeBrowser()
	}
}