package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(500);
		product.setStockAmount(3);
		Product product2 = new Product(1,"Laptop 2","Dell",3000,2,"Siyah","L2");
		//System.out.println(product.name);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.add(product2);
		System.out.println(product.getKod());
	}

}
