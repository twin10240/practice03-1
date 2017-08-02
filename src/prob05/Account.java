package prob05;

public class Account {

	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(getAccountNo() + " 계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int money) {
		setBalance(money);
		System.out.println(getAccountNo() + " 계좌에 " + money + "만원이 입금되었습니다.");
	}

	public void deposit(int money) {
		if (getBalance() < money) {
			System.out.println(getAccountNo() + " 계좌에 잔액이 부족합니다.");
		}else {
			setBalance(getBalance() - money);
			System.out.println(getAccountNo() + " 계좌에 " + money + "만원이 출금되었습니다.");
		}
	}
}
