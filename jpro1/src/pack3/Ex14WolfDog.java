package pack3;

public class Ex14WolfDog extends Ex14Dog{
	private String where = "산";
	
	public Ex14WolfDog(String name) {
		super(name);
		
	}
	
	public void show() {
		System.out.println("늑대가 사는 곳 : " + where + "속");
	}
	
	public void printMsg() {
		System.out.println(getName() + " ~ " + where + "에 산다(요즘은 동물원)");
		
	}
	
	public void display() { // WolfDog 고유 메소드
		printMsg();
		this.printMsg();
		super.prinMsg();
		
	}
}
