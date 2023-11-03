import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airbnb.com/')

WebUI.waitForElementPresent(findTestObject('Airbnb/txt_home'), 3)

WebUI.click(findTestObject('Airbnb/btn_addGuests'))

WebUI.setText(findTestObject('Airbnb/field_searchDestinations'), city)

WebUI.click(findTestObject('Airbnb/field_checkinDates'))

WebUI.click(findTestObject('Airbnb/btn_2days'))

WebUI.click(findTestObject('Airbnb/field_checkoutDates'))

WebUI.click(findTestObject('Airbnb/btn_3days'))

WebUI.click(findTestObject('Airbnb/btn_searchIcon'))

WebUI.waitForElementPresent(findTestObject('Airbnb/txt_searchResult'), 3)

WebUI.verifyTextPresent(expectedResult, false)

WebUI.executeJavaScript('window.open();', [])

currentIndex = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentIndex + 1, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.verifyElementPresent(findTestObject('Demo Web Shop/Page_Demo Web Shop/a_Log in'), 3)

WebUI.switchToWindowIndex(currentIndex)

WebUI.verifyTextPresent(expectedResult, false)

WebUI.closeBrowser()

