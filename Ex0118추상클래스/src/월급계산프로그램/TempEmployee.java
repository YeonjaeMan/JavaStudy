package 월급계산프로그램;

public class TempEmployee extends Employee {

	// 1. 필드

	// 2. 메소드
	// 생성자, getMoneyPay, print
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}

	public int getMoneyPay() {
		return this.pay / 12;
	}

}
