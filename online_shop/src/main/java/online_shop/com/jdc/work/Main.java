package online_shop.com.jdc.work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Main m = new Main();

		m.mainMenu();
		
	}

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
					break;
				case 2:
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

}
