package pack4;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex28ListTest {

	public static void main(String[] args) {
		// list 류의 ArrayList로 연습 : 중복 가능, 순서o
		ArrayList<String> list = new ArrayList<String>();
		list.add("lee");
		list.add("lee");
		list.add("lee");
		list.add("park");
		list.add("hong");
		list.remove(0);
		System.out.println("크기 : " + list.size());
		
		for(Object obj:list) {
			System.out.println(obj);
			
	
		}
		
		System.out.println();
		

	}

}
