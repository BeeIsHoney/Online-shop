package online_shop.com.jdc.work;

import java.util.InputMismatchException;
import java.util.Scanner;

import online_shop.com.jdc.work.authentaction.LoginAndRegister;
import online_shop.com.jdc.work.customer.Role;
import online_shop.com.jdc.work.customer.User;
import online_shop.com.jdc.work.db.ProductDb;
import online_shop.com.jdc.work.db.UserDb;
import online_shop.com.jdc.work.product.Product;
import online_shop.com.jdc.work.service.AdminService;
import online_shop.com.jdc.work.service.ProductService;
import online_shop.com.jdc.work.service.UserService;

public class Main {

	Scanner sc = new Scanner(System.in);
	static LoginAndRegister lg = new LoginAndRegister();
	UserService usersvc = new UserService();
	static AdminService admin = new AdminService();
	ProductService pds = new ProductService();
	{
		if (UserDb.getUser().size() == 0) {
			User admin = new User("admin", "admin123", "admin@email.com", Role.ADMIN);
			User testuser = new User("testuser", "test123", "test@email.com");
			UserDb.addUser(admin);
			UserDb.addUser(testuser);
		}
	}

	public static void main(String[] args) {

		Main m = new Main();
//		m.adminMenu();
//		m.HomeMenu();
//		lg.Register();
		m.viewProduct();

//		m.mainMenu();	
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
				choose = sc.nextInt();

				switch (choose) {
				case 1:
					lg.Login();
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

	public void UserMenu() {

		boolean isExit = true;
		while (isExit) {
			System.out.println("==================== User Menu ====================");
			System.out.print(
					"\n1.View Account Info\n2.View Product\n3.View Cart \n4.checkout \n5.Purchased History\n6.Exit\nChoose: ");
			int choose = sc.nextInt();
			int id = lg.getUserId();
			switch (choose) {
			case 1:
				usersvc.viewUserById(id);
				break;
			case 2:
				pds.viewProductById(id);
			case 6:
				isExit = false;
				break;
			default:

			}

		}
	}

	/*
	 * ===========================================================
	 * ======================= Admin UI =======================
	 * ===========================================================
	 */

	public void adminMenu() {

		boolean isExit = true;
		int choose;
		while (isExit) {
			try {

				System.out.println("==================== Admin Panel ====================");

				System.out.print(
						"1.View All User \n2.Add User Balance\n3.Remove User\n4.Add Product\n5.Edit Product\n6.Remove Prodcut\n7.Exit\nChoose: ");
				 choose = sc.nextInt();
				if (choose > 0) {
					switch (choose) {
					case 1:
						admin.ViewAllUser();
						break;
					case 2:
						admin.addUserBalance();
						break;
					case 3:
						admin.removeUser();
						break;
					case 7:
						isExit = false;
						break;
					}
				} else if(choose != 0 ){
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("Please Enter Correct Number");
				sc.nextLine();
			}
		}
	}
	/*
	 * ===========================================================
	 * ======================= View Product =======================
	 * ===========================================================
	 */
	public void viewProduct() {
	    boolean isExit = true;
	    int choose;

	    while (isExit) {

	        System.out.println("\n==================== View Product ====================");
	        System.out.println("1. View Product By ID");
	        System.out.println("2. View All Products");
	        System.out.println("3. Exit");
	        System.out.print("Choose: ");

	        choose = sc.nextInt();

	        switch (choose) {

	        case 1:
	            System.out.print("Enter Product ID: ");
	            int id = sc.nextInt();
	            pds.viewProductById(id);
	            break;

	        case 2:
	            System.out.println("\n========== Product List ==========");
	            for (Product product : ProductDb.getProduct()) {
	                System.out.println(
	                        product.getId() + " | "
	                        + product.getName() + " | "
	                        + product.getPrice() + " | "
	                        + product.getQuantity());
	            }
	            break;

	        case 3:
	            isExit = false;
	            System.out.println("Exiting...");
	            break;

	        default:
	            System.out.println("Invalid choice!");
	        }
	    }
	}
}
