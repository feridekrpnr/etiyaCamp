package core.adapters;

import core.abstracts.PersonCheckService;
import core.utilities.CKLKPSPublicSoap;
import entities.concretes.Player;

import java.util.Locale;

public class MernisServiceAdapter implements PersonCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        CKLKPSPublicSoap client= new CKLKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(Long.valueOf(player.getIdentityNumber()),
                    player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),player.getBirthOfYear());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
