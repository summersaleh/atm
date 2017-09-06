package atm;

import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ATM chaseBank = new ATM("1234");
		System.out.print("Please enter your pin:");
		chaseBank.enteredPin = input.nextLine();

		while (chaseBank.allowAccess(chaseBank.enteredPin)) {
			System.out.println(
					"Hello, Welcome to the Chase Bank ATM\nPress 1 to deposit funds\nPress 2 to withdraw funds\nPress 3 to check your balance");
			System.out.println("Press 4 to exit");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("How much would you like to deposit?");
				int amount = input.nextInt();
				chaseBank.deposit(amount);
				System.out.println("Thanks for your withdrawal");
			} else if (choice == 2) {
				System.out.println("How much would you like to withdraw");
				int amount = input.nextInt();
				chaseBank.withdraw(amount);
				System.out.println("Thanks for your withdrawal");
			} else if (choice == 3) {
				System.out.println("Your current balance is: " + chaseBank.balance);
			} else if (choice == 4) {
				System.out.println("Thank you, have a nice day!");
				chaseBank.exit();
			} else {
				System.out.println("Please try again");
			}

		}
	}

}
