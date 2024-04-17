package pack4;

import java.util.HashSet;
import java.util.Iterator;

//Collection : 다수의 객체를 담을 수 있는 집합형 자료구조
public class Ex27SetTest {

	public static void main(String[] args) {
		// set 류의 HashSet으로 연습 : 중복 불가, 순서 X
		HashSet<Object> list = new HashSet<Object>();
		list.add(1);
		list.add("lee");
		System.out.println("크기 : " + list.size());
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println();
		// 반복자라는 뜻 : 개발자가 컨테이너, 특히 리스트를 순화할 수 있게 해주는 객체
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			String ss = (String)iter.next();
			System.out.println(ss);
		
		}
	
	
	}

}
