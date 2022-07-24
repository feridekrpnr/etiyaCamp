
import business.concretes.BaseCustomerManager;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import core.adapters.MernisServiceAdapter;
import entities.concretes.Customer;
import mernis.HUVKPSPublicSoap;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
       // BaseCustomerManager customerManager= new NeroCustomerManager();
        customerManager.save(new Customer(1,"Feride","Kaınar",1996,"31325158244"));
    }
}
