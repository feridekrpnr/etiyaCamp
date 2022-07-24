package core.adapters;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;
import mernis.HUVKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        HUVKPSPublicSoap client = new HUVKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf
                             (customer.getNationalityId()),
                             customer.getFirstName().toUpperCase(),
                             customer.getLastName().toUpperCase(),
                             customer.getDateOfBirth());

    }
}
