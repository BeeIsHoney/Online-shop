package online_shop.com.jdc.work.service;

import java.util.Scanner;

import online_shop.com.jdc.work.customer.Role;
import online_shop.com.jdc.work.customer.User;
import online_shop.com.jdc.work.db.UserDb;

public class AdminService {
	
	Scanner sc = new Scanner(System.in);

	public void ViewAllUser() {

	    System.out.println("\n==================== View All User ====================");

	    System.out.printf(
	        "%-8s %-15s %-25s %-12s %-15s %-10s%n",
	        "UserID", "Name", "Email", "Balance", "Date", "Role\n"
	    );

	    for (User u : UserDb.getUser()) {

	        System.out.printf(
	            "%-8d %-15s %-25s %-12d %-15s %-10s%n\n",
	            u.getUserId(),
	            u.getUsername(),
	            u.getEmail(),
	            u.getBalance(),
	            u.getDate(),
	            u.getRole()
	        );
	    }
	}
	
	public void addUserBalance() {
		boolean found = false;
		
		try {
		System.out.println("==================== Add User Balance ====================\n");
		
		System.out.print("Enter User-name: ");
		String name = sc.next();
		for(User u : UserDb.getUser()) {
			if(u.getUsername().equals(name)) {
				System.out.print("\nEnter Balance:");
				int balance = sc.nextInt();
				if(balance < 0) {
					throw new Exception();
				}else {
					found = true;
					int bal = u.getBalance()+balance;
					u.setBalance(bal);
					System.out.println("\n"+balance + "MMK have add successfully to " + u.getUsername());
				}
			}
		}
		if(!found) {
			System.out.println("User not found");
		}
		}catch(Exception e) {
			System.out.println("Please Enter Number");
		}
		
	}
	
	public void removeUser() {
		System.out.println("==================== Remove User ====================\n");
	    System.out.print("Enter Id: ");
	    boolean found = false;
		int id = sc.nextInt();
		for(User u : UserDb.getUser()) {
			
			if(u.getUserId() == id) {
				if(u.getRole() == Role.ADMIN) {
					System.out.println("Can not delete Admin\n");
				}else if(u.getRole() == Role.USER){
					found = true;
					System.out.println("User Delete\n");
					UserDb.getUser().remove(u);
				}
				break;
			
			}
		
		}
		if(!found) {
			System.out.println("User not found");
		}
	}


}
