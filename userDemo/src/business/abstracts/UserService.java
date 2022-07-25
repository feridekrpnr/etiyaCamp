package business.abstracts;

import entities.abstracts.Notification;
import entities.concretes.User;

public interface UserService {
    void add(User user);
    void forgotPassword(User user);

    void sendNotification(User user,String message);
}
