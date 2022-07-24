package core.adapters;

import core.abstracts.CheckIfMailExistService;
import core.concretes.Google;

public class GoogleAdapter implements CheckIfMailExistService {
    @Override
    public void checkIfMailExist(String gmail) {
        Google google=new Google();
        google.checkIfGmailExist(gmail);
    }
}
