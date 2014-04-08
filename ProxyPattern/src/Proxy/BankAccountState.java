package Proxy;

public interface BankAccountState {
	
	void showID();
	void giveIDBack();
	void givePassword(int password);
	void requestMoney (int cashToGive);

}
