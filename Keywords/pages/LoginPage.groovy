package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class LoginPage {

    def open(String url) {
        WebUI.openBrowser('')
        WebUI.maximizeWindow()
        WebUI.navigateToUrl(url)
    }

    def login(String userName, String password) {
    WebUI.waitForElementVisible(findTestObject('Login/txt_userID'), 10)
	WebUI.setText(findTestObject('Login/txt_userID'), userName)
	
	WebUI.waitForElementVisible(findTestObject('Login/txt_password'), 10)
	WebUI.setText(findTestObject('Login/txt_password'), password)
	
	WebUI.waitForElementClickable(findTestObject('Login/btn_login'), 10)
	WebUI.click(findTestObject('Login/btn_login'))
    }
}

