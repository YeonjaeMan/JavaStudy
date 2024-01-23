package petproject;

public class PetDAO {
	
	private String petName;
	private String petKind;
	private int petHp;
	private int petSatiety;
	private int pet_affection;
	private String userId;
	private String userPw;
	
	public PetDAO(String petName, String petKind, int petHp, int petSatiety, int pet_affection, String userId,
			String userPw) {
		this.petName = petName;
		this.petKind = petKind;
		this.petHp = petHp;
		this.petSatiety = petSatiety;
		this.pet_affection = pet_affection;
		this.userId = userId;
		this.userPw = userPw;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetKind() {
		return petKind;
	}

	public void setPetKind(String petKind) {
		this.petKind = petKind;
	}

	public int getPetHp() {
		return petHp;
	}

	public void setPetHp(int petHp) {
		this.petHp = petHp;
	}

	public int getPetSatiety() {
		return petSatiety;
	}

	public void setPetSatiety(int petSatiety) {
		this.petSatiety = petSatiety;
	}

	public int getPet_affection() {
		return pet_affection;
	}

	public void setPet_affection(int pet_affection) {
		this.pet_affection = pet_affection;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
	
	
}
