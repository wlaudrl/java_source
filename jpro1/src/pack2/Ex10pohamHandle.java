package pack2;

public class Ex10pohamHandle { // 부품 클래스
	int quantity; // 회전량

	public Ex10pohamHandle() {
		quantity = 0;
	}

	String leftTurn(int q) {
		quantity = q;
		return " 좌회전";

	}

	String rightTurn(int quantity) {
		this.quantity = quantity;
		return " 우회전";

	}

	String straight(int quantity) {
		this.quantity = quantity;
		return "직진";

	}

}
