package task1;

import java.util.Scanner;

class BankAccount {
	 private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	 //method to deposit
	public void deposit(double amount) {
		if(amount > 0) {
			balance +=amount;
			System.out.println("money Deposited : "+amount);
		}else {
			System.out.println("Invalid amount for deposit!");
		}
	}
	  public void withdraw(double amount) {
		  if (amount > 0 && amount <= balance) {
			balance -=amount;
			System.out.println("money withdraw : "+amount);
		}else {
			System.out.println("insufficient fund");
		}
	  }

}
 
 class ATM{
	 Scanner scanner=new Scanner(System.in);
	 private BankAccount account;
	 
	 public ATM(BankAccount account) {
		this.account = account;
	 }
	 
	 public void showMenu() throws InterruptedException {
		
		 s1("Welcome to ATM");	 
		 s1("ATM menu :");
		 s1("1. Check Balance ");
		 s1( "2. Deposit cash");
		 s1("3. Withdrawn cash");
		 s1("4. Exit");
		 
	 }
	 public void start() throws InterruptedException {
		
		 boolean status=true;
		while(status) {
			System.out.println("enter your choice");
			int choice=scanner.nextInt();
		 switch (choice) {
		case 1:
			checkBalance();
			break;
			
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
			
		case 4: 
			status=false;
			s1("Exiting ATM , THANK YOU");
			 
			break;
			
		default:
			System.out.println("invalid choice. please select a valid option : ");
			break;
			
		}
		}
		}
		 
	 

	private void withdraw() {
		System.out.println("enter withdrawal amount");
		double amount =scanner.nextDouble();
		account.withdraw(amount);
	}
	

	private void deposit() {
		System.out.println("enter deposit amount :");
		double amount =scanner.nextDouble();
		account.deposit(amount);
	}

	private void checkBalance() {
		System.out.println("current Balance :"+account.getBalance());
		
	}
	
	  public static void main(String[] args) throws InterruptedException {
		BankAccount bankAccount=new BankAccount();
		bankAccount.setBalance(10000);
		ATM atm=new ATM(bankAccount);
		atm.showMenu();
		atm.start();
	}
	  
	  
	  
	  
	  
	  public void s1(String string ) throws InterruptedException {
		  for (int i = 0; i < string.length(); i++) {
				System.out.print(string.charAt(i));
				
				Thread.sleep(150);
			}
		  System.out.println();
	  }
	
	 }
 
