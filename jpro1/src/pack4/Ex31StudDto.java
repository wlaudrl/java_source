package pack4;

public class Ex31StudDto {
	private String name;
	private int kor, eng;
	
	public Ex31StudDto() {
		
	}
	
	public Ex31StudDto(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	

}
