package pack3;

public class Ex12Me extends Ex12Father {
	final int score = 90; // 멤버 필드에 파이널하면 값 수정 불가

	public Ex12Me() {
		System.out.println("내 생성자");
		// score = 80;

	}

	public void biking() {
		System.out.println("자전거로 전국일주 ~~~~");
	}

}
