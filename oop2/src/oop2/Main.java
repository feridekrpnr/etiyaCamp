package oop2;

public class Main {

	public static void main(String[] args) {
		Logger logger = new ElasticLogger(); //database logger=onu implemente eden sınıfın referansını tutar.
		logger.log("hgfds");
		
		
		CustomerManager customerManager = new CustomerManager(logger);
		customerManager.add(new Customer());
	}

}
