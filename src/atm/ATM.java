package atm;

public class ATM {

	String requiredPin;
	String enteredPin;
	double balance;
	
	void deposit(double amount) {
		balance += amount;
	}
	
	void withdraw(double amount) {
		balance -= amount;
	}
	
	void exit() {
		System.exit(0);
	}
	
	
	boolean allowAccess(String enteredPin) {
		if(enteredPin.equals(requiredPin)) {
			return true;
		} 
		return false;
	}
	
	public ATM (String requiredPin) {
		this.requiredPin = requiredPin;
	}
}
