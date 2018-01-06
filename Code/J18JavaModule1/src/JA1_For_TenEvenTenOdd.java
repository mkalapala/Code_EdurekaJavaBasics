
public class JA1_For_TenEvenTenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot = 20;
		
		System.out.println("Printing ten even numbers: "+tot);
		
		for(int i = 1; i <= tot; i++) {
			if(i%2 == 0) {
				System.out.println(i + " ");
			}
		}
		
		for(int i = 1; i<= tot; i++) {
			if(i%2 != 0) {
				System.out.println(i + " ");
			}
		}
	}

}
