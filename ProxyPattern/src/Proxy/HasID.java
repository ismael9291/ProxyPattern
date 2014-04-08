package Proxy;

public class HasID implements BankAccountState{

	BankAccount bankAccount;
	
	public HasID (BankAccount newBankAccount)
	{
		bankAccount = newBankAccount;
	}
	
	public void showID()
	{
		System.out.println("ID already shown.");
	}
	
	@Override
	public void giveIDBack()
	{
		System.out.println("Here is your ID");
	}
	
	@Override
	public void requestMoney (int cashToGive)
	{
		System.out.println("you have not given your password yet");
	}
	
	public void givePassword (int password)
	{
		if (password == 5148)
		{
			System.out.println("correct password");
			bankAccount.correctPassword = true;
			bankAccount.setBankAccountState(bankAccount.getHasPassword());
		}
		else 
		{
			System.out.println("incorrect password");
			bankAccount.correctPassword = false;
		}
	}	
	
}
