package Proxy;

public class HasPassword implements BankAccountState {

	BankAccount bankAccount;
	
	public HasPassword(BankAccount newBankAcount)
	{
		bankAccount = newBankAcount;
	}
	
	
	@Override
	public void showID() {
		System.out.println("Card Already entered");
		
	}

	@Override
	public void giveIDBack() {
		System.out.println("Here is your id");
		bankAccount.setBankAccountState(bankAccount.getDoesNotHaveID());
		
	}

	@Override
	public void givePassword(int password) {
		System.out.println("Password already entered");
		
	}

	@Override
	public void requestMoney(int cashToGive) {


		if (cashToGive > bankAccount.moneyInAccount)
		{
			System.out.println("not enough funds");
		}
		else 
		{
			System.out.println("Here you go.");
			bankAccount.setMoneyInAccount(bankAccount.moneyInAccount - cashToGive);
		}
		
	}

}
