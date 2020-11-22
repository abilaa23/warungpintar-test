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

WebUI.navigateToUrl('https://gist.github.com/discover')

WebUI.click(findTestObject('Object Repository/Excercise 2/Page_Discover gists  GitHub/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Excercise 2/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'rachmadhanybila@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Excercise 2/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 
    'F+u7N1j8zyEZXGXjY+34TA==')

WebUI.click(findTestObject('Object Repository/Excercise 2/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Object Repository/Excercise 2/Page_Discover gists/svg_Sign out_octicon octicon-plus d-none d-_8b831b'))

WebUI.setText(findTestObject('Object Repository/Excercise 2/Page_Create a new Gist/input_Instantly share code, notes, and snip_82538a'), 
    'Test-Gist')

WebUI.click(findTestObject('Object Repository/Excercise 2/Page_Create a new Gist/div_1'))

WebUI.setText(findTestObject('Object Repository/Excercise 2/Page_Create a new Gist/div_1This is my first gist'), '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">This is my first gist</span></pre></div>')

WebUI.click(findTestObject('Object Repository/Excercise 2/Page_Create a new Gist/button_Create secret gist'))

WebUI.closeBrowser()

