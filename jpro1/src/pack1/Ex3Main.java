package pack1;

public class Ex3Main {

	public static void main(String[] args) {
		// 클래스 기본 연습 중
		Ex3programmer programmer = new Ex3programmer();
		programmer.displayData();

		System.out.println();
		programmer.setAge(33);
		System.out.println("나이는 " + programmer.getAge());
		programmer.displayData();

		System.out.println("-------------------");
		Ex3programmer tom = new Ex3programmer();
		tom.nickname = " 톰 아저씨";
		tom.displayData();

		System.out.println("-------------------");
		Ex3programmer james = new Ex3programmer();
		james.nickname = " 제임스 형";
		james.displayData();

		System.out.println();
		System.out.println("너의 모토는 " + james.motto);
		// static 멤버는 클래스이름.멤버 하고 사용한다 (권장)
		System.out.println("너의 모토는 " + Ex3programmer.motto);
		Ex3programmer.goodMethod();

	}

}
