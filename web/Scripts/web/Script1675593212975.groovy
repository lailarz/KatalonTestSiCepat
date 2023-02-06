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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.saucedemo.com/')

String username = 'standard_user'

String password = 'secret_sauce'

WebUI.setText(findTestObject('Object Repository/SauceDemo Web/input username'), username)

WebUI.setText(findTestObject('Object Repository/SauceDemo Web/input pasword'), password)

WebUI.click(findTestObject('SauceDemo Web/login button'))

hargaBarang = WebUI.getText(findTestObject('SauceDemo Web/Page_Swag Labs/div_29.99'))

WebUI.click(findTestObject('SauceDemo Web/add to cart button'))

WebUI.click(findTestObject('SauceDemo Web/keranjang button'))

WebUI.verifyElementText(findTestObject('SauceDemo Web/harga barang checkout 2'), hargaBarang)

WebUI.click(findTestObject('SauceDemo Web/button_Checkout'))

WebUI.setText(findTestObject('SauceDemo Web/first name check out'), 'tester')

WebUI.setText(findTestObject('SauceDemo Web/last name checkout'), 'tester')

WebUI.setText(findTestObject('SauceDemo Web/zip code checkout'), '12860')

WebUI.click(findTestObject('SauceDemo Web/continue button checkout'))

WebUI.click(findTestObject('SauceDemo Web/finish button shopping'))

