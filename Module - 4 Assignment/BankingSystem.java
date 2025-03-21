import java.util.HashMap;
import java.util.Scanner;

public class BankingSystem {
    private static HashMap<Integer, Double> accounts = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Account 2. Deposit 3. Withdraw 4. Check Balance 5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account ID: ");
                    int id = scanner.nextInt();
                    accounts.put(id, 0.0);
                    System.out.println("Account created.");
                    break;
                case 2:
                    System.out.print("Enter account ID: ");
                    id = scanner.nextInt();
                    System.out.print("Enter amount: ");
                    double deposit = scanner.nextDouble();
                    accounts.put(id, accounts.getOrDefault(id, 0.0) + deposit);
                    break;
                case 3:
                    System.out.print("Enter account ID: ");
                    id = scanner.nextInt();
                    System.out.print("Enter amount: ");
                    double withdraw = scanner.nextDouble();
                    if (accounts.getOrDefault(id, 0.0) >= withdraw) {
                        accounts.put(id, accounts.get(id) - withdraw);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account ID: ");
                    id = scanner.nextInt();
                    System.out.println("Balance: " + accounts.getOrDefault(id, 0.0));
                    break;
                case 5:
                    return;
            }
        }
    }
}