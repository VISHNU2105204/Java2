package practice;

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
