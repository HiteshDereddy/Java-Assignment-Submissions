class BankAccount {
    private int balance = 1000;

    public void deposit(int amount) {
        synchronized (this) {
            balance += amount;
            System.out.println("Deposited " + amount + ", Balance: " + balance);
        }
    }

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + ", Balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }
}

class AccountThread extends Thread {
    private BankAccount account;

    public AccountThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(500);
        account.withdraw(700);
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new AccountThread(account);
        Thread t2 = new AccountThread(account);
        t1.start();
        t2.start();
    }
}