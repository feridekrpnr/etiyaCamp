package classesWithAttributes;

public class ProductManager {
	public void add(Product product) {
		// jdbc
		System.out.println("Ürün eklendi " + product.getName());
	}

	public void add2(int id, String name, String description, int stockAmount, double price) {

	}
}
