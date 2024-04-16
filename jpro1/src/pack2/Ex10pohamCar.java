package pack2;

public class Ex10pohamCar {
	// 여러 개의 부품이 모인 완성차 설계도
	int speed = 0;
	String ownerName, turnMessageshow;
	Ex10pohamHandle handle; // 부품 클래스를 자신의 멤버처럼 사용

	public Ex10pohamCar() {

	}

	public Ex10pohamCar(String name) {
		ownerName = name;
		handle = new Ex10pohamHandle(); // 클래스의 포함관계 (has a 관계)

	}

	public void playcarTurnHandle(int q) {
		if (q > 0) {
			turnMessageshow = handle.rightTurn(q);

		}
		if (q > 0)
			turnMessageshow = handle.leftTurn(q);

		if (q == 0)
			turnMessageshow = handle.straight(q);
	}
}