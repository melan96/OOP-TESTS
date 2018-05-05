package test2;

public class Account {

	
	public double balance;
	public int accountNumber;
	
	public Account(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public void withdraw(double withdrawAmount) throws WithdrawException{
		if(withdrawAmount>this.balance) {
			
		 throw new WithdrawException(this.balance);
		
		}else {
			this.balance-=withdrawAmount;
		}
	}
	
	public void deposit(double depositAmount) {
		this.balance+=depositAmount;
	}
	
}
