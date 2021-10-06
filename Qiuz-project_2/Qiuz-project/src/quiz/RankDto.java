package quiz;

public class RankDto {
	private int memberId;
	private int score;
	public RankDto(int memberId, int score) {
		super();
		this.memberId = memberId;
		this.score = score;
	}
	
	public RankDto() {
		
	}


	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "RankDto [memberId=" + memberId + ", score=" + score + "]";
	}
	
	
	
}
