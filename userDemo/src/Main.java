import business.concretes.EmailNotification;
import business.concretes.SmsNotification;
import business.concretes.UserManager;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        User user= new User(1,"Feride", "Karpınar", "12345","feride.karpinar8@gmail.com");
        UserManager userManager = new UserManager(new EmailNotification());
        UserManager userManager1 = new UserManager(new SmsNotification());
        userManager.register(user);
        userManager1.register(user);
        userManager.forgotPassword(user);
    }
}
