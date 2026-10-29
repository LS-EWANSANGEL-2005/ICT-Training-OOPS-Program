package OOPSjava;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class MyAccount {
    private double balance;

    MyAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount)
            throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}

public class CustomCheckedException {
    public static void main(String[] args) {
        MyAccount account = new MyAccount(5000);

        try {
            account.withdraw(7000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction complete");
        }
    }
}