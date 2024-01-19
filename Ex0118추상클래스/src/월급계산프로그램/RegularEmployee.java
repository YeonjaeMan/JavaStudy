package 월급계산프로그램;

public class RegularEmployee extends Employee {

	// 1. 필드
	private int bonus;

	// 2. 메소드
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	// getMoneyPay : 월 급여를 계산해서 리턴
	public int getMoneyPay() {
		return (this.pay + this.bonus) / 12;
	}

}
