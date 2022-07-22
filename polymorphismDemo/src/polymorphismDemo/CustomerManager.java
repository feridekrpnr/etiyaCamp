package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		super();
		this.logger = logger;
	}

	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log(" Log mesajı");
	}
}
