package online_shop.com.jdc.work.authentaction;

import java.util.Scanner;

import online_shop.com.jdc.work.customer.User;
import online_shop.com.jdc.work.db.UserDb;

public class LoginAndRegister {

	UserDb userdb = new UserDb();
	Scanner sc = new Scanner(System.in);

	public void Register() {
		boolean isExit = true;
		while (isExit) {
			System.out.println("========== Register ==========");
			System.out.print("Enter Username: ");
			String name = sc.next();
			if (!name.equals("") || !name.isBlank()) {
				
				System.out.print("Enter Password: ");
				String password = sc.next();
				if (password.length() > 5) {
					
					System.out.print("Enter Email: ");
					String email = sc.next();
					if (email.contains("@email.com")) {
						isExit = false;
						System.out.println("All good");
						User user = new User(name, password, email);
						userdb.addUser(user);
						
					} else {
						System.out.println("Please Fill Correct Email Format.");
					}
					
				} else {
					System.out.println("Password can not be that short");
				}
				
			} else {
				System.out.println("name can not be blank or null");
			}

			for (User u : userdb.getUser()) {
				System.out.println("ID:" +u.getUserId()+"\tUsername: " + u.getUsername() + "\tpassword: " + u.getPassword() + "\t email: "
						+ u.getEmail() + "\tbalance: " + u.getBalance() + "\tdate: " + u.getDate() + "\t role: "
						+ u.getRole());
			}
		}

	}

	public void Login() {

	}

}
