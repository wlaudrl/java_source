package pack5Io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex34IoTest {

	public static void main(String[] args) throws Exception{
		// Console 과 file 을 통한 입력
		// 1. console 을 통한 입력
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("이름은");
		String ir = br.readLine();
		System.out.println("이름은 " + ir);
		br.close();
		in.close();


	}

}
