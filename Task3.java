import java.util.Scanner;

public class ATMInterface {

    static double balance = 1000.00; // initial balance

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- ATM Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            performATMOperations(choice, sc); // calling second method

        } while (choice != 4);

        sc.close();
    }

    // 👉 Method 2: Performs ATM operations
    public static void performATMOperations(int option, Scanner sc) {
        switch (option) {
            case 1:
                System.out.println("Your balance is: ₹" + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ₹");
                double deposit = sc.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("₹" + deposit + " deposited successfully.");
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ₹");
                double withdraw = sc.nextDouble();
                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("₹" + withdraw + " withdrawn successfully.");
                } else {
                    System.out.println("Invalid amount or insufficient balance.");
                }
                break;

            case 4:
                System.out.println("Exiting ATM. Thank you!");
                break;

            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}