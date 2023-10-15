/*Program4: Define a class Account which has balance as instance variable and methods to deposit and withdraw amount
from an account. Override the toString method to display account balance.
Define a main to demo the above class.*/


class Account {
	private double balance;
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public java.lang.String toString() {
		return "Account balance: " +balance;
	}
}
class Main {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.deposit(25000);
		ac.withdraw(3000);
		System.out.println(ac);
	}
}

//Output: Account balance: 22500.0
