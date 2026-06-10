package online_shop.com.jdc.work.db;

import java.util.ArrayList;
import java.util.List;

import online_shop.com.jdc.work.customer.User;

public class UserDb {
	
  private static List<User> userdb = new ArrayList<>();
	
	public static void addUser(User user) {
		userdb.add(user);
	}
	
	public static List<User> getUser() {
		return userdb;
	}
}
