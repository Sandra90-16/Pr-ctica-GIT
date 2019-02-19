package shopping;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * <h2>Esta clase es una<b> lista de la compra</b></h2>
 * <p>Tiene m�todos para calcular el balance y para manipular la lista de art�culos</p>
 * <a target="_blank" href="https://www.oracle.com/technetwork/articles/java/index-137868.html">
 * enlace a la documentaci�n</a>
 * <h1>Pr�ctica de entornos</h1>
 * @see <a target="_blank" href="https://github.com/Sandra90-16/Pr-ctica-GIT">enlace a GitHub</a>
 * @version 1.0 19 febrero
 * @author sandra
 *
 */
public class ShoppingCart {
	/**
	 * lista de articulos
	 */
	private ArrayList items;
	/**
	 * constructor sin parametros
	 */
	public 	ShoppingCart() {
		items = new ArrayList();
	}
	/**
	 * devuelve el balance de los articulos
	 * @return double
	 * @throws Exception
	 */
	public double getBalance() throws Exception{
		double balance = 0.00;
		for (Iterator i = items.iterator(); i.hasNext();) {
			Product item = (Product) i.next();
			balance += item.getPrice();
		}
		return balance;
	}
	/**
	 * a�ade un articulo a la lista
	 * @param item
	 */
	public void addItem(Product item) {
		items.add(item);
	}
	/**
	 * borra articulo de la lista
	 * @param item
	 */
	public void removeItem(Product item) {
		items.remove(item);
	}
	
	public int getItemCount() {
		return items.size();
	}
	
	public void empty() {
		items.clear();
	}
}

