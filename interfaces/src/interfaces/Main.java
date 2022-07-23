package interfaces;

public class Main {

	public static void main(String[] args) {
//      ICustomer customerDal = new OracleCustomerDal(); // interface onu implemente eden sınıfın referansını tutabilir
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
//		customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();
	}

}
