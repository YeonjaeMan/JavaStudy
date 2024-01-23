package Question2;

public class TV {

	private String tvName;
	private int tvYear;
	private int tvSize;

	public TV(String tvName, int tvYear, int tvSize) {
		this.tvName = tvName;
		this.tvYear = tvYear;
		this.tvSize = tvSize;
	}

	public void show() {
		System.out.println(this.tvName + "에서 만든 " + this.tvYear + "년형 " + this.tvSize + "인치 TV");
	}
}
