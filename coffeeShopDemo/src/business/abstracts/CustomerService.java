package business.abstracts;

import entities.concretes.Customer;

public interface CustomerService {
    void save(Customer customer) throws Exception;
}
