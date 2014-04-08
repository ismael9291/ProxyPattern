package Proxy;

public class NoMoney implements BankAccountState{
	
	BankAccount bankAccount;
	
	public NoMoney (BankAccount newBankAccount)
	{
		bankAccount = newBankAccount;
	}
	

	@Override
	public void showID() {
		System.out.println("Not enough money for any transactions.");
		
	}

	@Override
	public void giveIDBack() {
		System.out.println("Not enough money for any transactions.");
		
	}

	@Override
	public void givePassword(int password) {
		System.out.println("Not enough money for any transactions.");
		
	}

	@Override
	public void requestMoney(int cashToGive) {
		System.out.println("Not enough money for any transactions.");
		
	}

}
