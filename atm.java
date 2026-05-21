import java.util.*;

public class atm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== ATM MENU ===");
		System.out.println("1.Check Balance");
		System.out.println("2.Amount withdraw");
		System.out.println("3.Amount Deposit");
		System.out.println("4.Exit");
		int Balance = 0;
		int deposit = 0;
		int withdraw = 0;
		int total_amount = 0;
		int remaining_balance = 0;
		int i = 0;
		while( i <= 3) {
			 i = sc.nextInt();
			 if (i == 1) {
				 System.out.println("Check Balance");
				 System.out.println(Balance);
			 }
			
			 if (i == 2) {
				 System.out.println("Amount Withdraw");
				 System.out.println("Enter Withdraw Amount");
				 withdraw = sc.nextInt();
				 sc.nextLine();
				 if(withdraw <= Balance){
					 System.out.println("Please Collect your cash");
					 System.out.println("Do you need to see the balance");
					String yes = sc.nextLine();
					 if(yes.equals("y")) {
						 remaining_balance = Balance-withdraw;
						 System.out.println(remaining_balance);
					 }
					 else {
						 System.out.println("Thanks for using ATM...!");
					 }
				 }
				 else {
					 System.out.println("Invalid Amount...!");
				 }
			 }
			 if (i == 3) {
				 System.out.println("Amount Deposit");
				 System.out.println("Enter Deposit Amount");
				 deposit = sc.nextInt();
				 total_amount = Balance + deposit;
				 Balance = total_amount;
				 System.out.println(total_amount);
				 System.out.println("Your transaction is being Processed");
				 System.out.println(total_amount);
			 }
			 else if (i == 4) {
				 System.out.println("Thanks for using ATM..!");
				 break;
			 }
			 else {
				 System.out.println("--------");
			 }
			
		}
		
	}

}
