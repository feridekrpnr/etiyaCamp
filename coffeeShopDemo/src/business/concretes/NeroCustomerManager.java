package business.concretes;

import entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to db: "+customer.getFirstName());
    }
}
