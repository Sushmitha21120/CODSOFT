package com.codsoft.atm_interface;

	import java.util.Scanner;

	class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public boolean withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	class ATM {
	    private BankAccount account;

	    public ATM(BankAccount account) {
	        this.account = account;
	    }

	    public void start() {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("ATM Menu:");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    if (withdraw(withdrawAmount)) {
	                        System.out.println("Withdrawal successful!");
	                    } else {
	                        System.out.println("Insufficient balance.");
	                    }
	                    break;
	                case 2:
	                    System.out.print("Enter the amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    System.out.println("Deposit successful!");
	                    break;
	                case 3:
	                    System.out.println("Your current balance is: " + account.getBalance());
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private boolean withdraw(double amount) {
	        return account.withdraw(amount);
	    }
	
    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000);
	        ATM atm = new ATM(account);
	        atm.start();
	    }
	}
