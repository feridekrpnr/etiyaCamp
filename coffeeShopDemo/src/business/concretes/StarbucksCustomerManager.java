package business.concretes;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager() {
    }

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    public void save(Customer customer) throws Exception {
        if (customerCheckService.CheckIfRealPerson(customer)) {
            save(customer);
            System.out.println("Saved to db: "+customer.getFirstName());
        } else {
            throw new Exception("Not a valid person");
        }
    }

}
