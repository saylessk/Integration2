
public class BankAccount {
	private double balance;
	//This class was created to test an throw exception 
	public void setBalance (double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException();
		}
		this.balance = balance;
	}

}
