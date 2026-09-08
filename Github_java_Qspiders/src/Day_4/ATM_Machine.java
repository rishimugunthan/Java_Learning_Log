package Day_4;
import java.util.Scanner;
public class ATM_Machine {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double balance = 60_0000;
	
	long accountNumber = 123456789;
	int pin = 1234;
	
	System.out.println("1.English");
	System.out.println("2.Tamil");
	int choice = sc.nextInt();
	boolean running = true;
		System.out.println("Enter Your Account Number: ");
		long userAccountNumber = sc.nextLong();
		System.out.println("Enter Your Pin Number: ");
		int userPin = sc.nextInt();
		
		if(accountNumber == userAccountNumber && pin == userPin) {
			while(running) {
				switch (choice) {
				case 1: {
					System.out.println("1.Check Balance: ");
					System.out.println("2.Deposit: ");
					System.out.println("3.Withdraw");
					System.out.println("4.Exit...");
					System.out.println("Enter Your Choice: ");
					int choice2 = sc.nextInt();
					
					switch(choice2) {
					case 1: {
						System.out.println("Your Current Balance is: " + balance);
						break;
					}
					case 2: {
						System.out.println("Enter Amount to Deposit: ");
						int depositAmount = sc.nextInt();
						if(depositAmount > 0) {
							balance += depositAmount;
							System.out.println("Amount has Deposit Successfully: ");
						}
						break;
					}
					case 3 : {
						System.out.println("Enter the Amount to Withdraw: ");
						int withdrawAmount = sc.nextInt();
						if(balance >= withdrawAmount) {
							balance -= withdrawAmount;
							System.out.println("Amoun has Withdraw successfully: ");
						}
						break;
					}
					case 4 : {
						System.out.println("Thank You....");
						running = false;
					}
					default :{
						System.out.println("Enter a Valid Choice: ");
					}
					}
				}
				default : {
					System.out.println("Enter a Vaild Choice: ");
				}
				}
			}
		}
		else {
			System.out.println("Enter the Valid AccountNumber or PinNumber");
		}
		sc.close();
	}
}
