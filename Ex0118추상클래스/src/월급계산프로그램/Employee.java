package 월급계산프로그램;

public abstract class Employee {

	// 접근제한자
	// private << default(package) << protected << public
	protected String empno;
	protected String name;
	protected int pay;

	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public abstract int getMoneyPay();

	// print --> 사번 : 이름 : 연봉 을 리턴
	public String print() {
		return this.empno + " : " + this.name + " : " + this.pay;
	}

}
