package exceptioncutom;
/*
 * We define the bank Atm class to calculate the transactions 
 * */
public class BankAtm {
	int atmId;
	String bankName;
	String location;
	double balance;
	public BankAtm(int atmId, String bankName, String location, int balance) {
		super();
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	public void withdraw(double amt )throws BankATMException{
		//if the balance is less then 10000 the user cannot withdraw money
		double newAccountBalance=10000;
		if(balance<newAccountBalance|(balance < 10000)){
			throw new BankATMException("Balance is less than 10000. Cannot withdraw");
			
		}
		else{
			//if the amount to withdraw is greater than the balance we do not subtract from balance
			newAccountBalance=balance-amt;
			if(newAccountBalance > 0) {
			balance=newAccountBalance;
			System.out.println("Balance after withdrawl is "+balance);
			}
			//System.out.println("Balance is "+balance);
	}}
	public void deposit(double amt)throws BankATMException {
		double newAccountBalance=10000;
		if(amt<0.0){
			throw new BankATMException("cannot deposit");
			
	}else{
		newAccountBalance =balance+amt;
		balance=newAccountBalance;
		
		System.out.println("balance after deposit is "+balance);
	}
	}

}
