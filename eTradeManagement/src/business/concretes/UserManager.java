package business.concretes;

import business.abstracts.UserService;
import core.RegexMatches;
import core.abstracts.CheckIfMailExistService;
import dataAccess.abstracts.DataRepository;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private RegexMatches regexMatches;
    private DataRepository<User> dataRepository;
    private CheckIfMailExistService checkIfMailExistService;


    public UserManager(RegexMatches regexMatches, DataRepository dataRepository,
                       CheckIfMailExistService checkIfMailExistService) {
        this.regexMatches = regexMatches;
        this.dataRepository = dataRepository;
        this.checkIfMailExistService=checkIfMailExistService;
    }



    @Override
    public void add(User user) {
        if (regexMatches.namePattern(user.getFirstName()) && regexMatches.namePattern(user.getLastName())) {
            if (regexMatches.emailPattern(user.getEmail()) && regexMatches.passwordPattern(user.getPassword())) {
                if (!checkIfEmailExist(user.getEmail())) {
                    dataRepository.add(user);
                    System.out.println("User added successfully");
                    System.out.println("Verification email has been sent");
                }
                else
                    System.out.println("Email already exist");

            } else

                System.out.println("Email or password is not valid");

        } else
            System.out.println("First name and last name must contain at least two characters");

    }


    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void loginCheck(String email, String password) {
        for (User user:dataRepository.getAll())
        {
            if (user.getEmail()==email && user.getPassword()==password)
            {
                System.out.println("Login succesfully");
            }
            else
                System.out.println("Login failed");
        }
    }

    @Override
    public void loginWithGoogle(String email) {
        checkIfMailExistService.checkIfMailExist(email);
    }

    private boolean checkIfEmailExist(String email)
    {
        boolean exists=false;
        for (User user:dataRepository.getAll())
        {
            if (user.getEmail()==email)
            {
                exists=true;
            }
        }
        return exists;
    }



}
