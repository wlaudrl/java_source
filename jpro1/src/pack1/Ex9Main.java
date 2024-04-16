package pack1;

public class Ex9Main {

	public static void main(String[] args) {
		// 메소드 호출 시 매개변수를 통한 자료 전달 (타입이 기본형, 참조형)
		Ex9Callby1 myDate = new Ex9Callby1();
		Ex9Callby2 myMethod = new Ex9Callby2();

		System.out.println("원래 a : " + myDate.a + " b : " + myDate.b);
		myMethod.ex(myDate.a, myDate.b); // 인수로 기본형 전달 (값 전달)
		System.out.println("1. 수행 후 a : " + myDate.a + " b : " + myDate.b);

		System.out.println();
		myMethod.ex(myDate); // Ex9Callby1 객체 타입의 주소를 전달
		System.out.println("2. 수행 후 a : " + myDate.a + " b : " + myDate.b);

		System.out.println();
		System.out.println("배열의 대표명 c : " + myDate.c);
		/*
		 * int kbs[] = myDate.c; // 주소 치환 System.out.println(myDate.c[0]);
		 * System.out.println(kbs[0]);
		 */
		myMethod.ex(myDate.c);
		System.out.println("3. 수행 후 a : " + myDate.c[0] + " c[10] : " + myDate.c[1]);

		// oop 포함, 상속 공부하기
		

	}

}
