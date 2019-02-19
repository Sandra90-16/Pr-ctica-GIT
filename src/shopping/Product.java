package shopping;

/**
 * 
 * @author sandra
 * @version 1.0 19febrero
 *
 */
public class Product {
 /**
  * codigo de producto
  */
 private String code;
 /**
  * titulo del producto
  */
 private String title;
 /**
  * descripcion del producto
  */
 private String description;
 /**
  * precio del producto
  */
 private double price;
 /**
  * constructor
  * @param code
  * @param title
  * @param description
  * @param price
  */
 public Product (String code, String title, String description, double price)
 {
	 this.code = code;
	 this.title = title;
	 this.description = description;
	 this.price = price;   
 }
 /**
  * devuelve el codigo del producto
  * @return String
  */
public String getCode() {
	return this.code;
	
}
/**
 * devuelve el titulo del producto
 * @return String
 */
public String getTitle() {
	return this.title;
}	
/**
 * devuelve la descripcion del producto
 * @return String
 */
public String getDescription() {
	return this.description;
}	
/** 
 * devuelve el precio del producto
 * @return double
 */
 public double getPrice() {
	return this.price;
 }
}

