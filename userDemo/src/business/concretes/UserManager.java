package business.concretes;

import business.abstracts.UserService;
import entities.abstracts.Notification;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {

    private Notification notification;
    List<User> users= new ArrayList<>();

    public UserManager(Notification notification) {
        this.notification = notification;

    }

    @Override
    public void add(User user) {
        user.setNotification(this.notification);
        sendNotification(user, user.getFirstName() + " Eklendi");

    }

    @Override
    public void forgotPassword(User user) {
      sendNotification(user, user.getFirstName() + " Parolayi unuttu");

    }

    @Override
    public void sendNotification(User user,String message) {
        System.out.println(user.getNotification().sendNotification() + message);

    }
}
