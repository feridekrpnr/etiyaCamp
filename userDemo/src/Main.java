import business.concretes.UserManager;
import entities.concretes.EmailNotification;
import entities.concretes.SmsNotification;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        User user= new User(1,"Feride", "Karpınar","12345");
        UserManager userManager = new UserManager(new EmailNotification());

        userManager.add(user);
        userManager.forgotPassword(user);
    }
}
