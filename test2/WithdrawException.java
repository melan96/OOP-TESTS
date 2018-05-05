package test2;

public class WithdrawException extends Exception {

	
	private double bal;
	@Override
	public void printStackTrace() {
		
		System.out.println("Your Account Balance is not Sufficiant to withdraw this amount");
	}
	
	WithdrawException(double balance) {
		this.bal = balance ;
	}
	
	public double getAmount() {
		return this.bal;
	}

}
