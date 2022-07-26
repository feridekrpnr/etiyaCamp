package business.concretes;

import business.abstracts.NotificationService;
import entities.concretes.User;

public class SmsNotification implements NotificationService {


    @Override
    public void sendNotification(User user) {
        System.out.println(user.getEmail() + ": Sms notification");
    }
}
