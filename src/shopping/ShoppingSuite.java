package shopping;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ShoppingSuite extends TestCase {

	 public ShoppingSuite(String testName) {
		 super(testName);
		 }
		 public static Test suite() {
			 TestSuite suite = new TestSuite("ShoppingSuite");
		// suite.addTest(shopping.MainTest.suite());
		 	suite.addTest(shopping.ProductTest.suite());
		 	suite.addTest(shopping.ShoppingCartTest.suite());
		 	return suite;
		 }
		 protected void setUp() throws Exception {
			 super.setUp();
		 }
		 protected void tearDown() throws Exception {
			 super.tearDown();
		 } 

}
