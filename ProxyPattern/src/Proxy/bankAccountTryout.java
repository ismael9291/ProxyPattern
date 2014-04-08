package Proxy;

public class bankAccountTryout {

	public static void main(String[] args) {


		BankAccount bankAccount = new BankAccount();
		
		bankAccount.showID();
		
		bankAccount.givePassword(5148);
		
		bankAccount.requestMoney(100);
		
		// proxy
		
		
		GetBankAccountInfo accountProxy = new BankAccountProxy();
		
		
		System.out.println("Money in account " + accountProxy.getCashInAccount());

	}

}
