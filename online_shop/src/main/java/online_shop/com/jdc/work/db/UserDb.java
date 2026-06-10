package online_shop.com.jdc.work.db;

import java.util.ArrayList;
import java.util.List;

import online_shop.com.jdc.work.customer.User;

public class UserDb {
	
	List<User> userdb = new ArrayList<>();
	
	public void addUser(User user) {
		userdb.add(user);
	}
	
	public List<User> getUser() {
		return userdb;
	}
}
