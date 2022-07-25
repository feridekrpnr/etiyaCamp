package business.concretes;

import business.abstracts.NotificationService;
import business.abstracts.UserService;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {

    NotificationService notificationService;
    List<User> users= new ArrayList<>();

    public UserManager() {
    }

    public UserManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }



    @Override
    public void register(User user) {
        users.add(user);
        notificationService.sendNotification(user);
        System.out.println("Kullanici kaydedildi");
    }

    @Override
    public void forgotPassword(User user) {
        notificationService.sendNotification(user);
        System.out.println("Yeni parola gonderildi");
    }
}
