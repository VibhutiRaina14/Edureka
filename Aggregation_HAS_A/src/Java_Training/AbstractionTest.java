package Java_Training;
abstract class BankAccount
{
	protected String accountNumber;
	protected double balance;
	//ctor
	public BankAccount(String accountNumber, double balance) {
		//super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//getters
	public String getAccountNumber() {
		return accountNumber;
	}
//	public void setAccountNumber(String accountNumber) {
//		this.accountNumber = accountNumber;
//	}
	public double getBalance() {
		return balance;
	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
	
	
}
public class AbstractionTest {

}
