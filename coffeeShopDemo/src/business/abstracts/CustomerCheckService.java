package business.abstracts;


import entities.concretes.Customer;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(Customer customer) throws Exception;

}
