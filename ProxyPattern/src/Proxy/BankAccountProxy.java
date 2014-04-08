package Proxy;

public class BankAccountProxy implements GetBankAccountInfo{

	@Override
	public BankAccountState getBankInfo() {
		
		BankAccount realBankAccount = new BankAccount();
		
		return realBankAccount.getBankInfo();
	}

	@Override
	public int getCashInAccount() {

		BankAccount realBankAccount = new BankAccount();
		
		return realBankAccount.getCashInAccount();
	}
	
}
