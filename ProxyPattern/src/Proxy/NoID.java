package Proxy;

public class NoID implements BankAccountState {
	
	BankAccount bankAccount;
	
	public NoID (BankAccount newBankAccount)
	{
		bankAccount = newBankAccount;
	}

	@Override
	public void showID() {
		System.out.println("Enter your password");
		bankAccount.setBankAccountState(bankAccount.getHasID());
		
	}

	@Override
	public void giveIDBack() {
		System.out.println("No id given");
		
	}

	@Override
	public void givePassword(int password) {
		System.out.println("No id given");
		
	}

	@Override
	public void requestMoney(int cashToGive) {
		System.out.println("No id given");
		
	}

}
