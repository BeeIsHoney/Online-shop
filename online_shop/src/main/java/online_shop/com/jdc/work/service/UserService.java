package online_shop.com.jdc.work.service;

import online_shop.com.jdc.work.customer.User;
import online_shop.com.jdc.work.db.UserDb;

public class UserService {
	
	User user = new User();
	
	
	//View User
	public void viewUserById(int id) {
	
		for(User u :UserDb.getUser() ) {
			if(id == u.getUserId()) {
				System.out.println(u.getUsername());
			}
		}
		
		
	}

}
