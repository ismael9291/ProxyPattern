package Proxy;

public class BankAccount implements GetBankAccountInfo{
	
	BankAccountState hasID;
	BankAccountState noID;
	BankAccountState accountHasNoFunds;
	BankAccountState hasCorrectPassword;
	
	BankAccountState bankState;
	
	int moneyInAccount = 9000;
	boolean correctPassword = false;
	
	public BankAccount (){
		
		hasID = new HasID(this);
		noID = new NoID(this);
		hasCorrectPassword = new HasPassword(this);
		accountHasNoFunds = new NoMoney (this);
		
		bankState = noID;
		
		if (moneyInAccount < 0){
			bankState = accountHasNoFunds;
			
		}
		
	}
	
	void setBankAccountState (BankAccountState newBankState){
		
		bankState = newBankState;
	}
	
	public void setMoneyInAccount (int newMoneyInAccount)
	{
		moneyInAccount = newMoneyInAccount;
	}
	
	public void showID ()
	{
		bankState.showID();
	}
	
	public void giveIDBack()
	{
		bankState.giveIDBack();
	}
	
	public void givePassword(int password)
	{
		bankState.givePassword(password);
	}
	
	public void requestMoney (int cashToWIthdraw)
	{
		bankState.requestMoney(cashToWIthdraw);
	}
	
	
	
	
	public BankAccountState getHasID(){return hasID;}
	public BankAccountState getDoesNotHaveID(){return noID;}
	public BankAccountState getHasPassword(){return hasCorrectPassword;}
	public BankAccountState getNoMoneyState(){return accountHasNoFunds;}
	

	@Override
	public BankAccountState getBankInfo() {
		
		return bankState;
	}

	@Override
	public int getCashInAccount() {
		
		return moneyInAccount;
	}



}
