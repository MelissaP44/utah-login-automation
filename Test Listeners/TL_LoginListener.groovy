import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.util.KeywordUtil

class TL_LoginListener {

	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		KeywordUtil.logInfo("Starting Test Case: " + testCaseContext.getTestCaseId())
	}

	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {
		KeywordUtil.logInfo("Finished Test Case: " + testCaseContext.getTestCaseId())
	}
}
