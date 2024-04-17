package pack4;

import java.io.FileNotFoundException;
import java.io.FileReader;

// 예외처리 : 키보드, 파일처리, 네트워크, DB연동처리 등 외부와 접속을 통한 프로그래밍 작업중
// 예상치 못한 에러가 발생할 수 있는데 이와 같은 주로 경우에 사용한다.
// try ~ catch 구문을 사용

public class Ex26Try {
	
	public void testMethod() {
		System.out.println("testMethod");
	}

	public static void main(String[] args)  {
		// 보조기억장치의 파일 읽기
		try {
			FileReader fr = new FileReader("c:/work/aa.txt");
			
			// 객체가 인스턴스의 주소를 갖지 않은 경우
			// Ex26Try try1 = null;
			Ex26Try try1 = new Ex26Try();
			try1.testMethod();
			
		} catch (FileNotFoundException e1) {
			 System.out.println("해당 파일이 없어요");
		}catch(NullPointerException e2) {
			//e2.printStackTrace();
			System.out.println("객체 변수 에러 원인은 " + e2.getMessage());
			
		}
		
		System.out.println("프로그램 종료");
		

	}

}
