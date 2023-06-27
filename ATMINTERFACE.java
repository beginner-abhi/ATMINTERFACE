package oASISINFO;
import java.util.Scanner;
public class ATMINTERFACE {
	// Java Program to Display the ATM Transaction
	    private static Scanner scanner = new Scanner(System.in);
	    private static int balance = 1000; // Initial balance for testing purposes

	    public static void main(String[] args) {
	        System.out.println("Welcome to the ATM!");

	        // Prompt for user ID and PIN
	        System.out.print("Enter your User ID: ");
	        int userId = scanner.nextInt();
	        System.out.print("Enter your PIN: ");
	        int pin = scanner.nextInt();

	        // Validate user ID and PIN
	        if (authenticateUser(userId, pin)) {
	            System.out.println("Authentication successful!");
	            showMainMenu();
	        } else {
	            System.out.println("Invalid User ID or PIN. Exiting...");
	        }
	    }

	    private static boolean authenticateUser(int userId, int pin) {
	        // Perform user authentication logic here
	        // You can have a database or data structure to store valid user IDs and corresponding PINs
	    	
	        return userId == 1234 && pin == 5678;
	    }

	    private static void showMainMenu() {
	        boolean quit = false;

	        while (!quit) {
	            System.out.println("\nMain Menu:");
	            System.out.println("1. Transaction History");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Deposit");
	            System.out.println("4. Transfer");
	            System.out.println("5. Quit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    withdraw();
	                    break;
	                case 3:
	                    deposit();
	                    break;
	                case 4:
	                    transfer();
	                    break;
	                case 5:
	                    quit = true;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }

	        System.out.println("Thank you for using the ATM. Goodbye!");
	    }

	    private static void checkBalance() {
	        System.out.println("Your current balance is: $" + balance);
	    }

	    private static void withdraw() {
	        System.out.print("Enter the amount to withdraw: ");
	        int amount = scanner.nextInt();

	        if (amount > balance) {
	            System.out.println("Insufficient funds. Please try again.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
	        }
	    }

	    private static void deposit() {
	        System.out.print("Enter the amount to deposit: ");
	        int amount = scanner.nextInt();

	        balance += amount;
	        System.out.println("Deposit successful. Current balance: $" + balance);
	    }

	    private static void transfer() {
	        System.out.print("Enter the amount to transfer: ");
	        int amount = scanner.nextInt();

	        if (amount > balance) {
	            System.out.println("Insufficient funds. Please try again.");
	        } else {
	            System.out.print("Enter the recipient's account number: ");
	            int accountNumber = scanner.nextInt();

	            // Perform transfer logic here
	            System.out.println("Transfer of $" + amount + " to account number " + accountNumber + " successful.");
	            balance -= amount;
	            System.out.println("Remaining balance: $" + balance);
	        }
	    }
	}

	


