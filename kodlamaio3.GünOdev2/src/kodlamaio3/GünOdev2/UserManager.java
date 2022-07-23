package kodlamaio3.GünOdev2;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    List<User> users = new ArrayList<User>();


	public void add(User user) {
		System.out.println("User eklendi : " + user.getFirstName() + " " + user.getLastName());
		users.add(user);
	}

	public void delete(User user) {
		System.out.println("User silindi : " + user.getFirstName() + " " + user.getLastName());
	}

	public void update(User user) {
		System.out.println("User güncellendi : " + user.getFirstName() + " " + user.getLastName());
	}
	
	public List<User> getAll() {

		return users;
	}
}
