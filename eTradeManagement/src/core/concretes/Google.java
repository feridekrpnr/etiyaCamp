package core.concretes;

public class Google {
    public void checkIfGmailExist(String email)
    {
        if(email.contains("gmail"))
        {
            System.out.println("Logged in with gmail");
        }
        else
            System.out.println("Gmail is not exist");
    }
}