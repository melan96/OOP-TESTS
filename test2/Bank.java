package test2;

public class Bank {
	
	public static void main(String[] args) {
		Account acc = new Account(123);
		acc.deposit(10000);
		
		try {
			
			acc.withdraw(6000);
			acc.withdraw(8000);
			
		}catch(WithdrawException e) {
			System.out.println("Your Current Balance is  :"+e.getAmount());
			e.printStackTrace();
		}
	}

}
