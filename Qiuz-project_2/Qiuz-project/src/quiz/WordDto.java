package quiz;

public class WordDto {
	private int wordId;
	private int category;
	private int level;
	private String kor;
	private String eng;
	public WordDto(int wordId, int category, int level, String kor, String eng) {
		super();
		this.wordId = wordId;
		this.category = category;
		this.level = level;
		this.kor = kor;
		this.eng = eng;
	}
	
	public WordDto() {
		
	}

	public int getWordId() {
		return wordId;
	}

	public void setWordId(int wordId) {
		this.wordId = wordId;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "WordDto [WordId=" + wordId + ", Category=" + category + ", Level=" + level + ", kor=" + kor + ", eng="
				+ eng + "]"+"\n";
	}
}
