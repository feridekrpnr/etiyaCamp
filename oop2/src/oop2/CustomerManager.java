package oop2;

public class CustomerManager {
	private Logger logger;

	public CustomerManager(Logger logger) { //109
		this.logger = logger;
	}

	public void add(Customer customer) {
		System.out.println("Customer added");
		this.logger.log(customer.getFirstName());
	}

	public void update(Customer customer) {
		System.out.println("Customer updated");
		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.log(customer.getFirstName());

	}
}
