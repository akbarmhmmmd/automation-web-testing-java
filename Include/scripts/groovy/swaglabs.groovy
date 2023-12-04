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

	@When("User click (.*) button")
	def clickLogin(String btn) {
		switch(btn ) {
			case 'Login':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/login_btn'), 3)
				WebUI.click(findTestObject('Object Repository/SwagLabs/login_btn'))
				break;
			case 'Logout':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/logout_btn'), 3)
				WebUI.click(findTestObject('Object Repository/SwagLabs/logout_btn'))
				break;
			case 'Burger':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/burger_btn'), 3)
				WebUI.click(findTestObject('Object Repository/SwagLabs/burger_btn'))
				break;
			default:
				throw new Error('option does not exist')
		}
	}

	@When("User click (.*) Add to Cart")
	def clickAddCart(String add) {
		switch(add) {
			case 'Backpack':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/addBackpack_btn'), 3)
				WebUI.click(findTestObject('Object Repository/SwagLabs/addBackpack_btn'))
				break;
			case 'Bike Light':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/addBikeLight_btn'), 3)
				WebUI.click(findTestObject('Object Repository/SwagLabs/addBikeLight_btn'))
				break;
			case 'Bolt T-Shirt':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/addBoltTShirt_btn'), 3)
				WebUI.click(findTestObject('Object Repository/SwagLabs/addBoltTShirt_btn'))
				break;
			case 'Fleece Jacket':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/addFleeceJacket_btn'), 3)
				WebUI.click(findTestObject('Object Repository/SwagLabs/addFleeceJacket_btn'))
				break;
			case 'Onesie':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/addOnesie_btn'), 3)
				WebUI.click(findTestObject('Object Repository/SwagLabs/addOnesie_btn'))
				break;
			case 'Red T-Shirt':
				WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/addRedTShirt_btn'), 3)
				WebUI.click(findTestObject('Object Repository/SwagLabs/addRedTShirt_btn'))
				break;
			default:
				throw new Error('item does not exist')
		}
	}

	@When("User click cart icon")
	def clickCart() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/SwagLabs/cartIcon'), 3)
		WebUI.click(findTestObject('Object Repository/SwagLabs/cartIcon'))
	}

	@When("User select (.*) sort icon")
	def selectSort(String sort) {
		switch(sort) {
			case 'A to Z':
				WebUI.click(findTestObject('Object Repository/SwagLabs/AtoZ'))
				break;
			case 'Z to A':
				WebUI.click(findTestObject('Object Repository/SwagLabs/ZtoA'))
				break;
			case 'Price low to high':
				WebUI.click(findTestObject('Object Repository/SwagLabs/LowtoHigh'))
				break;
			case 'Price high to low':
				WebUI.click(findTestObject('Object Repository/SwagLabs/HightoLow'))
				break;
			default:
				throw new Error('option does not exist')
		}
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

	@Then("User successfully add (.*) to the cart")
	def validateItem(String cart) {
		switch(cart) {
			case 'Backpack':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/backpack_txt'), 3)
				break;
			case 'Bike Light':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/bikeLight_txt'), 3)
				break;
			case 'Bolt T-Shirt':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/boltShirt_txt'), 3)
				break;
			case 'Fleece Jacket':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/fleece_txt'), 3)
				break;
			case 'Onesie':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/onesie_txt'), 3)
				break;
			case 'Red T-Shirt':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/redShirt_txt'), 3)
				break;
			default:
				throw new Error('item does not exist')
		}
		WebUI.closeBrowser()
	}

	@Then("User success sort products by (.*)")
	def validateSorted(String sort) {
		switch(sort) {
			case 'A to Z':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/itemBackpack_txt'), 3)
				break;
			case 'Z to A':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/itemRedShirt_txt'), 3)
				break;
			case 'Price low to high':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/itemOnesie_txt'), 3)
				break;
			case 'Price high to low':
				WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/itemFleece_txt'), 3)
				break;
			default:
				throw new Error('option does not exist')
		}
		WebUI.closeBrowser()
	}

	@Then("User successfully Logout")
	def validateLogout() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/SwagLabs/login_btn'), 3)
		WebUI.closeBrowser()
	}
}
