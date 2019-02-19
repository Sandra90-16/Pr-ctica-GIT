package shopping;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ShoppingCartTest extends TestCase {

	private ShoppingCart shoppingCart;
	private Product product1;
	
	 public static Test suite() {
		 TestSuite suite = new TestSuite(ShoppingCartTest.class);
		 return suite;
	} 

	protected void setUp() throws Exception {
		this.shoppingCart = new ShoppingCart();
		product1 = new Product("P001","Plasma TV LG 32", 
				"Plasma Tv with TDT decod, and high resolution Screen",
				699.99);	
		shoppingCart.addItem(product1);
	}

	protected void tearDown() throws Exception {
		shoppingCart= null;
		product1= null;
	}
	/**
	 * test of getBalance method of class ShoppingCart
	 */
	public void testGetBalance() {
		System.out.println("getBalance");
		double expectedResult = 699.99; //Test ok
		//double expectedResult = 700;
		double result= shoppingCart.getBalance();
		assertEquals(expectedResult, result);
	}
	/**
	 * test of addItem method of class ShoppingCart
	 */
	public void testAddItem() {
		System.out.println("addItem");
		Product product2 = new Product("P002","DVD player Samsung", 
				"DVD player remote",
				39.99);
		shoppingCart.addItem(product2);
		assertEquals(shoppingCart.getItemCount(),2);
		double balanceSum = product1.getPrice()+ product2.getPrice();
		assertEquals(balanceSum, shoppingCart.getBalance());
	}
	
	public void testGetItemCount() {
		System.out.println("getItemCount");
		int expectedResult = 1;
		int result = shoppingCart.getItemCount();
		assertEquals(expectedResult, result);
	}
	
	public void testRemoveItem() {
		System.out.println("removeItem");
		shoppingCart.removeItem(product1);
		assertEquals(shoppingCart.getItemCount(), 0);
	}
	
	public void testEmpty() {
		System.out.println("empty");
		shoppingCart.empty();
		int expectedResult = 0;
		int result = shoppingCart.getItemCount(); 
		assertEquals(expectedResult, result);
		
	} 
}

