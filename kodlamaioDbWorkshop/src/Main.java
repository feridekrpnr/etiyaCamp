import entities.concretes.Canal;
import entities.concretes.Customer;
import entities.concretes.IndividualCustomer;

public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal(1,"Internet");

        Customer customer1 = new IndividualCustomer(1,"1234",canal,"Feride","Karpınar","1234567890");
        System.out.println(customer1.getId());
        System.out.println(customer1.getCustomerNo());
        System.out.println(customer1.getCanal().getName());
    }
}
