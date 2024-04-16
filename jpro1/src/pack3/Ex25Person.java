package pack3;

public class Ex25Person {
	public Ex25Saram getSaram() {
		// return new Ex25Saram();
		
		
		
		return new Ex25Saram()
		{	// 내부 무명클래스
			public String getIr() {  // Ex25Saram 사람클래스에 메소드를 오버라이딩함
				return "홍길동";
			}
		};
	
	}
}


