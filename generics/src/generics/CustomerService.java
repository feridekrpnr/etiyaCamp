package generics;

public class CustomerService {
	public void add(Customer customer) {
		DataRepository<Customer> customerRepository = new DataRepository<Customer>();
		customerRepository.add(customer);
	}
}
