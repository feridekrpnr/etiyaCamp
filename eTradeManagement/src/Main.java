import business.concretes.UserManager;
import business.uı.Login;
import core.RegexMatches;
import core.adapters.GoogleAdapter;
import dataAccess.concretes.UserRepository;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Feride", "Karpınar", "feride@yho.com", "125590");
        User user2 = new User(1, "rabia", "çakır", "rabia@gmail.com", "1255555");
        UserManager userManager = new UserManager(new RegexMatches(), new UserRepository(),new GoogleAdapter());

        userManager.add(user1);
        Login login = new Login(userManager);
        login.loginWithGoogle(user1.getEmail());
        userManager.add(user2);
    }
}
