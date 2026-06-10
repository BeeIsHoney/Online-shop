package online_shop.com.jdc.work;

import java.util.InputMismatchException;
import java.util.Scanner;

import online_shop.com.jdc.work.authentaction.LoginAndRegister;
import online_shop.com.jdc.work.service.UserService;

public class Main {

	Scanner sc = new Scanner(System.in);
	static LoginAndRegister lg = new LoginAndRegister();
	UserService usersvc = new UserService();


	public static void main(String[] args) {

		Main m = new Main();
		m.mainMenu();		
	}

	/*
	 * ===========================================================
	 * ======================= MainMenu UI =======================
	 * ===========================================================
	 */
	
	void mainMenu() {
		boolean isExit = true;
		int choose;
		while (isExit) {
			
		try {
				System.out.println(" ==================== Main Menu ====================");
				System.out.print("1.Login \n2.Register \n3.Exit\nChoose:");
				int id = lg.getUserId();
				
				 choose = sc.nextInt();

				switch (choose) {
				case 1:
					break;
				case 2:
					  lg.Register();
						
					break;
				case 3:
					System.out.println("System Out");
					isExit = false;
					break;
				default:
					isExit = false;
					throw new InputMismatchException("");

				}
			
		} catch (Exception e) {
			System.out.println("Enter Correct Number");
			sc.nextLine();
		}
		}

	}
	
	/*
	 * ===========================================================
	 * ======================= HOME UI =======================
	 * ===========================================================
	 */
	
	 void HomeMenu() {
		 
		 System.out.println(" ==================== Home Menu ====================");
		 
		 System.out.println("1.View Account Info\n2.View Product\n3.View Cart \n4.checkout \n5.Purchased History\n6.Exit\nChoose: ");
		 int choose = sc.nextInt();
	 }

}
