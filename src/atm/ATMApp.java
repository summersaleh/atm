package atm;

import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ATM chaseBank = new ATM("1234");
		System.out.print("Please enter your pin:");
		chaseBank.enteredPin = input.nextLine();

		while (chaseBank.allowAccess(chaseBank.enteredPin)) {
			System.out.println("Hello, Welcome to the Chase Bank ATM\nPress 1 to deposit funds");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("How much would you like to deposit?");
				int amount = input.nextInt();
				chaseBank.deposit(amount);
				System.out.println("Your current balance is: " + chaseBank.balance);
				break;
			} else {
				System.out.println("Hello, Welcome to the Chase Bank ATM\nPress 1 to deposit funds");
				 choice = input.nextInt(); 
			}
		}

	}

}
