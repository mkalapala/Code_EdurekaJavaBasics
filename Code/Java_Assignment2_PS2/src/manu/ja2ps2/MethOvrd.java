package manu.ja2ps2;

public class MethOvrd extends Main {
	
	public static void main(String[] args){
		
		MethOvrd obj = new MethOvrd();
		
		obj.operation(3.2f, 5.4f);
		obj.operation(4, 5);
	}
	
	@Override
	public void operation(int x, int y){
		
		int add = x+y;
		System.out.println("Method Overriding");
		System.out.println("Entered values are integers. Hence, sum is "+add);
	}
	
	@Override
	public void operation(float x, float y){
		
		float add = x+y;
		System.out.println("Method Overriding");
		System.out.println("Entered values are floating point numbers. Hence, sum is "+add);
	}

}
