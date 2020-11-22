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

WebUI.openBrowser('https://www.ebay.com/')

WebUI.click(findTestObject('Object Repository/Page_Electronics, Cars, Fashion, Collectibl_475ffe/button_Shop by category'))

WebUI.click(findTestObject('Object Repository/Page_Electronics, Cars, Fashion, Collectibl_475ffe/a_Cell phones  accessories'))

WebUI.click(findTestObject('Page_Cell Phones, Smartphones, Smart Watche_d1fc43/img_Shop the best of yesterday, today and t_dc6a60'))

WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/button_More refinementsMore refinements'))

WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/span_Screen Size'))

WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/input_Screen Size_c3-subPanel-Screen20Size__f6e909'))

WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/div_Price'))

WebUI.setText(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/input_IDR_x-textrange__input x-textrange__i_f04732'), 
    '1000000')

WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/div_Item Location'))

WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/input_Europe_location'))

WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/button_Apply'))

WebUI.verifyElementText(findTestObject('Page_5.5 - 5.9 Inch Cell Phones  Smartphone_67e2bd/span_5.5 - 5.9 Inch Cell Phones  Smartphone_4b1103'), 
    '5.5 - 5.9 Inch Cell Phones & Smartphones over IDR1,000,000.00')

WebUI.closeBrowser()

