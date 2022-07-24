package business.concretes;

import business.abstracts.CustomerService;
import entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

    @Override
    public abstract void save(Customer customer) throws Exception;

}
