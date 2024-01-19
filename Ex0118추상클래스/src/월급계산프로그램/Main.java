package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		
		RegularEmployee regular = new RegularEmployee("0001", "임경남", 7000, 700);
		TempEmployee temp = new TempEmployee("0002", "강규남", 4000);
		PartTimeEmployee part = new PartTimeEmployee("0003", "이도연", 30, 20);
		
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay());
		
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay());
		
		System.out.println(part.print());
		System.out.println(part.getMoneyPay());
		
	}

}
