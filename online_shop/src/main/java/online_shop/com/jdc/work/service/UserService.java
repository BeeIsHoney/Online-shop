package online_shop.com.jdc.work.service;

import online_shop.com.jdc.work.customer.User;
import online_shop.com.jdc.work.db.UserDb;

public class UserService {
	
	User user = new User();
	
	
	//View User
	public void viewUserById(int id) {
	
		for(User u :UserDb.getUser() ) {
			if(id == u.getUserId()) {
				System.out.println("==================== Account Info ==================== \n");
				
				System.out.printf("%-15s : %s%n", "Status", u.getRole());
				System.out.printf("%-15s : %s%n", "Username", u.getUsername());
				System.out.printf("%-15s : %2d%n", "Balance", u.getBalance());
				System.out.printf("%-15s : %s%n", "Email", u.getEmail());
				System.out.printf("%-15s : %s%n", "Date", u.getDate());
				System.out.println("");
			}
		}
	}
	
	

}
