package pack3;

public abstract class Ex19Salesman extends Ex19Employee{
	private int sales;
	private int commission;
	public Ex19Salesman(String irum, int nai, int salary, int sales, double d, int ilsu, int ildang) {
		super(irum, nai);
		this.sales = sales;
		this.commission = (int) d;
		
		
}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return sales * commission;
		
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		display();
		System.out.println("월급 : " + pay() + "원");
	}
}


