package shopping;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ProductTest extends TestCase {
	
	 public static Test suite() {
		 TestSuite suite = new TestSuite(ProductTest.class);
		 return suite;
	}

	private Product prod1;
	public ProductTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		prod1 = new Product("P001","Plasma TV LG 32", 
				"Plasma Tv with TDT decod, and high resolution Screen",
				699.99);			
	}

	protected void tearDown() throws Exception {
		prod1 = null;
	}
	
	/**
	 * Test of getCode method of class Product
	 */
	public void testGetCode() {
		System.out.println("getCode");
		String expectedResult = "P001"; //Test OK
		// String expectedResult = "P002";// Test KO
		String result = prod1.getCode();
		assertEquals(expectedResult, result);
	}
	/**
	 * Test of getTitle method of class Product
	 */
	public void testGetTitle() {
		System.out.println("getTitle");
		String expectedResult = "Plasma TV LG 32"; //Test OK
		// String expectedResult = "Plasma Samsung";// Test KO
		String result = prod1.getTitle();
		assertEquals(expectedResult, result);
	}
	
	/**
	 * Test of getDescription method of class Product
	 */
	public void testGetDescription() {
		System.out.println("getDescription");
		String expectedResult = "Plasma Tv with TDT decod, and high resolution Screen"; //Test OK
		// String expectedResult = "Plasma fino";// Test KO
		String result = prod1.getDescription();
		assertEquals(expectedResult, result);
	}
	/**
	 * Test of getPrice method of class Product
	 */
	public void testGetPrice() {
		System.out.println("getPrice");
		double expectedResult = 699.99; //Test OK
		// String expectedResult = 700;// Test KO
		double result = prod1.getPrice();
		assertEquals(expectedResult, result);
	}
}
