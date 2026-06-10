package online_shop.com.jdc.work.db;

import online_shop.com.jdc.work.customer.User;

public class UserDb {
	
	private User[] userarr;
	
	{
		userarr = new User[0];
	}
	
	public void addUser(User user) {
		
		User[] temp = new User[userarr.length + 1];
		
		for(int i =0;i<userarr.length;i++) {
			temp[i] = userarr[i];
		}
		
		temp[userarr.length] = user;
		
		userarr = temp;
	}
	
	public User[] getUser() {
		return userarr;
	}
	

}
