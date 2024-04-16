package pack3;

public class Ex17Radio extends Ex17Jepum {
	public Ex17Radio() {
		System.out.println("라디오 생성자");
		
	}
	
	@Override
	public void volumeControl() {  // <==추상메소드는 빈 삼각형이다 
		System.out.println("라디오 소리 조정");
				
	}

}
