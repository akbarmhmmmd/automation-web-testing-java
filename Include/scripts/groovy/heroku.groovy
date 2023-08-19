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


class heroku {
	@Given("User on Heroku Web")
	def validateHerokuWebPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://the-internet.herokuapp.com/')
	}

	@When("User click (.*) Button")
	def click(String click) {
		switch (click) {
			case 'Add Remove Element':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/a_AddRemove Elements'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_AddRemove Elements'))
				break;
			case 'Add Element':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/button_Add Element'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/button_Add Element'))
				break;
			case 'Delete Element':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/button_Delete'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/button_Delete'))
				break;
			case 'Checkboxes':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/a_Checkboxes'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Checkboxes'))
				break;
			case 'First Checkbox':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/input_checkbox_1'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/input_checkbox_1'))
				break;
			case 'Second Checkbox':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/input_checkbox_2'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/input_checkbox_2'))
				break;
			case 'Dropdown':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/dropdown_button'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/dropdown_button'))
				break;
			case 'Option':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/option_dropdown'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/option_dropdown'))
				break;
			case 'Dynamic Controls':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/dynamic_button'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/dynamic_button'))
				break;
			case 'A Checkbox':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/a_checkbox'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_checkbox'))
				break;
			case 'Remove Checkbox':
				WebUI.waitForElementClickable(findTestObject('Object Repository/Heroku/Page_The Internet/remove_button'), 0)
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/remove_button'))
				break;
			default:
				throw new Error('option does not exist')
		}
	}

	@When("User select (.*) Option")
	def selectOption(String option) {
		switch (option) {
			case 'First':
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/option_1'))
				break;
			case 'Second':
				WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/option_2'))
				break;
			default:
				throw new Error('option does not exist')
		}
	}

	@Then("User success (.*) Element")
	def validate(String validate) {
		switch (validate) {
			case 'Add':
				WebUI.waitForElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/button_Delete'), 0)
				WebUI.verifyElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/button_Delete'), 0)
				break;
			case 'Delete':
				WebUI.waitForElementNotPresent(findTestObject('Object Repository/Heroku/Page_The Internet/button_Delete'), 0)
				WebUI.verifyElementNotPresent(findTestObject('Object Repository/Heroku/Page_The Internet/button_Delete'), 0)
				break;
			default:
				throw new Error('option does not exist')
		}
		WebUI.closeBrowser()
	}

	@Then("User success click Checkboxes")
	def validateClickCheckboxes() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/input1_checked'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/input1_checked'), 0)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/input2_notchecked'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/input2_notchecked'), 0)
		WebUI.closeBrowser()
	}

	@Then("User success select Dropdown")
	def validateSelectDropdown() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/options_selected'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/options_selected'), 0)
		WebUI.closeBrowser()
	}

	@Then("User success Remove A Checkbox")
	def validateRemoveACheckbox() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/gone_msg'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/gone_msg'), 0)
		WebUI.closeBrowser()
	}
}
