package pack1;

public class Ex5Main {
	// 메소드 오버로딩 연습

	public static void main(String[] args) {
		Ex5AnimalOverload tiger = new Ex5AnimalOverload();
		tiger.display();
		tiger.display(5); // 인수(인자, argument)
		tiger.display("호랑이");
		tiger.display(2, "호랭이");
		tiger.display(3, "호돌이");

		System.out.println("\n생성자 오버로딩 ---");
		Ex5AnimalOverload dog = new Ex5AnimalOverload();
		dog.display();

		Ex5AnimalOverload hen = new Ex5AnimalOverload(2);
		hen.display();

		Ex5AnimalOverload wolf = new Ex5AnimalOverload("늑대", 3, 4);
		wolf.display();

	}
}
