package OOPSjava;

public class BankAccount {
	
	    private int accountNumber;
	    private String holderName;
	    private double balance;

	    BankAccount(int accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }

	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited " + (int) amount);
	        System.out.println("Balance: " + (int) balance);
	    }

	    void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn " + (int) amount);
	            System.out.println("Balance: " + (int) balance);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    void display() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Holder Name: " + holderName);
	        System.out.println("Balance: " + (int) balance);
	    }

	    public static void main(String[] args) {
	        BankAccount b = new BankAccount(101, "Angel", 10000);

	        b.deposit(5000);
	        b.withdraw(20000);
	    }
	}
