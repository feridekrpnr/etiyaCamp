package oop1;

public class Main {

	public static void main(String[] args) {
		
	Category category1= new Category();
	category1.setId(1); //set -okuma
	category1.setName("Meyve");
	
	Category category2= new Category();
	category2.setId(2); //set -okuma
	category2.setName("Yemek");
		
    Product product1= new Product(); //referans olusturuldu
    product1.setId(1); //set -okuma
    product1.setName("Elma");
    product1.setUnitPrice(50);
    product1.setCategory(category1);
    
    Product product2= new Product(); //referans olusturuldu
    product2.setId(2); //set -okuma
    product2.setName("Mantı");
    product2.setUnitPrice(50);
    product2.setCategory(category2);
    
    
    System.out.println(product1.getName());
    System.out.println(product1.getUnitPrice());
    System.out.println(product1.getDiscountedPrice());
    System.out.println(product1.getCategory().getName());
    
    ProductService productService = new ProductService();
    productService.add(product2);
	}

}
