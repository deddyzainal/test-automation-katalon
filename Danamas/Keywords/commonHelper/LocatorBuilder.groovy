package commonHelper
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

class LocatorBuilder {

	@Keyword
	def buildTestObject(String selectorType, String selectorValue) {
		TestObject to = new TestObject()
		to.addProperty(selectorType, ConditionType.EQUALS, selectorValue)
		return to
	}
}