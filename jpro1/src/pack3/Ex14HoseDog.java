package pack3;

public class Ex14HoseDog extends Ex14Dog{
	private String where = "집";
	
	public Ex14HoseDog(String name) {
		// super(name);
		
	}
	
	public void show() {
		System.out.println("사는 곳 : " + where);
	}
	
	public void printMsg() {
		System.out.println(getName() + " ~ " + where + "에 산다");
		
	}
}
