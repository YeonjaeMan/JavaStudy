package Question6_1;

public class MusicVO {

	private String title;
	private String singer;
	private int playTime;
	
	public MusicVO(String title, String singer, int playTime) {
		super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	public String toString() {
		return "제목 : " + this.title + "\t" + "가수 : " + this.singer + "\t"+ "시간 : " + this.playTime + "초";
	}
}
