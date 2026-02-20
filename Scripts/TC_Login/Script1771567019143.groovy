import internal.GlobalVariable
import pages.LoginPage
import utils.DateTimeUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String userName = userName
String password = password

def loginPage = new LoginPage()


loginPage.open(GlobalVariable.baseUrl)
loginPage.login(userName, password)


WebUI.delay(2)


String ts = DateTimeUtil.now()
WebUI.takeScreenshot("Reports/screenshots/login_${ts}.png")

WebUI.closeBrowser()