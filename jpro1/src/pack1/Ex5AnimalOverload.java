package pack1;

// method overload : 한 개의 클래스의 이름이 같은 메소드를 여러 개 선언
// 성립 조건 : 매개변수의 갯수, 타입, 순서가 다르면 된다. 반환형과는 관계없다.

public class Ex5AnimalOverload {
	private int leg = 4;
	private int age;
	private String name;
	public final static int MOUTH = 1; // final 멤버필드는 대문자로 적자

	public Ex5AnimalOverload() {
		// 생성자는 내용이 없는 경우 생략 가능

	}

	public Ex5AnimalOverload(int leg) { // 생산자 오버로딩
		this.leg = leg;

	}

	public Ex5AnimalOverload(String name) {
		this.name = name;
	}

	public Ex5AnimalOverload(String name, int age, int leg) {
		this.name = name;
		this.age = age;
		this.leg = leg;
	}

	public void display() {
		System.out.println("leg : " + leg + ", age : " + age + ",name:" + name);
	}

	// method overloading
	public void display(int age) { // 매개변수(parameter)의 갯수가 다름
		this.age = age; // 지역변수 age 를 멤버필드 age 에 기억
		System.out.println("leg : " + leg + ", age : " + age + ",name : " + name);

	}

	public void display(String name) {
		System.out.println("leg : " + leg + ", age : " + age + ",name:" + name);

	}

	public void display(int age, String name) {
		System.out.println("leg : " + leg + ", age : " + age + ",name:" + name);

		/*
		 * public void display(int leg) { 에러 ~ System.out.println("leg : " + leg +
		 * ", age : " + age + ",name:" + name);
		 */

	}
}
