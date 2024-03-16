package Bankapplication;
import java.util.*;

public class Bankapplication{
 public static void main(String[] args) {
	 int amount =100000;
	System.out.println("***Welcome To IDBI Bank***");
	
	Scanner sc = new Scanner(System.in);
	final String username = "swapnil";
	final String password = "swapnil";
	
	boolean login = false;
	
	while(!login) {
	System.out.println("Enter user ID:");
	String id =sc.next();
	System.out.println("Enter user password:");
	String pass =sc.next();
	if(username.equals(id) && password.equals(pass)) {
		login = true;
	}
	else {
		System.out.println("Invalid username and Password. Plese try again.");
	}
		while(true) {
			System.out.println("1.check balance");
			System.out.println("2.withdraw");
			System.out.println("3.deposit");
			System.out.println("4.exit");
			
			System.out.println("Enter your choice:");
			int choice =sc.nextInt();
			
			switch(choice) {
			case 1:
				checkbalance(amount);
				break;
			case 2:
				withdraw(amount);
			break;
			case 3:
			 deposit(amount);
				break;
			case 4:
				exit();
			break;
			default:
				System.out.println("Invalid choice.please try again");
			}	
		}
	}
}
 private static void checkbalance(int amount) {
		System.out.println("your current account bank balance is Rs."+amount);	
	}
 private static void withdraw(int amount) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int withdraw =sc.nextInt();
		if(withdraw <=amount) {
		amount -= withdraw;
		System.out.println("withdraw successfully. new balance:Rs."+amount);
		}
		else {
			System.out.println("Insufficient Balance..");
		}
	}
 private static void deposit(int amount) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		int deposit =sc.nextInt();
		amount += deposit;
		System.out.println("deposit successfully. new balance:Rs."+amount);
	}
private static void exit() {
	System.out.println("Thank you..\nVisit Again");
 }
}
		