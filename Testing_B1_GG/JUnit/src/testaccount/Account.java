package testaccount;

public class Account {
	
	private String acctNo, name;
	private double balance;
	public static final double INTEREST_RATE;
	static {
		INTEREST_RATE = 0.07;
	}

	public Account(String acctNo, String name, double balance) {
		super();
		this.acctNo = acctNo;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", name=" + name  + ", balance=" + balance;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in bank acct equals");
		if (o instanceof Account)
			return acctNo.equals(((Account) o).acctNo);
		return false;
	}

	/*
	 * B.L --withdraw,deposit,fundsTransfer, apply simple Interest.
	 * 
	 * 
	 */
	public void deposit(double amt) {
		balance += amt;
	}

	public void withdraw(double amt) {
		balance -= amt;
	}

	public void transferFunds(Account dest, double amt){
		this.withdraw(amt);
		dest.deposit(amt);
	}

	public void applyInterest() {
		balance += (balance * INTEREST_RATE);
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
