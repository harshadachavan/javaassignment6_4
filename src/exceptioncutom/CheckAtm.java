package exceptioncutom;

public class CheckAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAtm b1=new BankAtm(2012, "Axis Bank", "Mumbai", 10000);
		BankAtm b2=new BankAtm(2013, "HDFC Bank", "Mumbai", 10000);
		BankAtm b3=new BankAtm(2014, "ICICI Bank", "Mumbai", 10000);
		try {
			b1.withdraw(400);
			b1.deposit(300);
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
		try {
			b1.withdraw(15000);
			b1.deposit(200);
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
		
		try {
			b2.withdraw(4000);
			b2.deposit(300);
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
		
		try {
			b3.withdraw(500);
			b3.deposit(300);
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
		


	}

}
