package online_shop.com.jdc.work.authentaction;

import java.util.Scanner;

import online_shop.com.jdc.work.Main;
import online_shop.com.jdc.work.customer.Role;
import online_shop.com.jdc.work.customer.User;
import online_shop.com.jdc.work.db.UserDb;

public class LoginAndRegister {

	UserDb userdb = new UserDb();
	Scanner sc = new Scanner(System.in);
	int userid;
	Main m = new Main();


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
						User user = new User(name, password, email);
						UserDb.addUser(user);
						///Test
//						m.HomeMenu();
						
						
					} else {
						System.out.println("Please Fill Correct Email Format.");
					}
					
				} else {
					System.out.println("Password can not be that short");
				}
				
			} else {
				System.out.println("name can not be blank or null");
			}
		}
		
	}
	
	public int getUserId() {
		return userid;
	}

	public void Login() {
		
		System.out.println("========== Login ==========");
		System.out.print("Enter Email: ");
		String name = sc.next();
		System.out.print("Enter Password: ");
		String pw = sc.next();
		boolean found = false;
		
		for(User u : UserDb.getUser()) {
//			System.out.println(u.getEmail()  +""+u.getPassword());
			if(u.getEmail().equals(name) && u.getPassword().equals(pw)) {
				found = true;
				userid = u.getUserId();

				if(u.getRole() == Role.USER) {
					System.out.println("\nLogin Success\n");
					m.UserMenu();
					
				}else if(u.getRole() == Role.ADMIN){
					System.out.println("\nLogin Success\n");
					m.adminMenu();
				}
				
				break;
			}
		}
		if(!found) {
			System.out.println("Wrong Password Or Email");
		}
		

	}

}
