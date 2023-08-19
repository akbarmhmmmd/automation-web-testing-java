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

WebUI.navigateToUrl('https://the-internet.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_AB Testing'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/h3_AB Test Control'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_AddRemove Elements'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/button_Add Element'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/button_Delete'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Heroku/Page_The Internet/button_Delete'), 0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Heroku/Page_The Internet/button_Delete'), 0)

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Broken Images'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Broken Images'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/h3_Broken Images'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Challenging DOM'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_foo'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_baz'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_qux'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/h3_Challenging DOM'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/td_Iuvaret0'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/td_Apeirian0'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/td_Adipisci0'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/td_Definiebas0'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/td_Consequuntur0'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/td_Phaedrum0'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_edit'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_delete'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Checkboxes'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/h3_Checkboxes'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Context Menu'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/h3_Context Menu'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/div_Context Menu_hot-spot'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Disappearing Elements'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Home'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Disappearing Elements'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_About'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Contact Us'))

WebUI.click(findTestObject('Object Repository/Heroku/Page_The Internet/a_Portfolio'))

WebUI.closeBrowser()

