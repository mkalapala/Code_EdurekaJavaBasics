package manu.ja3ps7;

public class TenMultiples_Constructor {
	
	public static void main(String[] args){
		
		int array1[] = new int[10];
		int array2[] = new int[10];
		int array3[] = new int[10];
		int array4[] = new int[10];
		int array5[] = new int[10];
		
		for (int i = 1; i <= 5; i++){
			
			if(i == 1)
				for (int x = 1; x<=10; x++){
					array1[x - 1] = i*x;
				}
			
			if(i == 2)
				for(int x = 1; x<=10; x++){
					array2[x - 1] = i*x;
				}
			
			if(i == 3)
				for(int x = 1; x<=10; x++){
					array3[x - 1] = i*x;
				}
			
			if(i == 4)
				for(int x = 1; x<=10; x++){
					array4[x - 1] = i*x;
				}
			
			if(i == 5)
				for(int x = 1; x<=10; x++){
					array5[x - 1] = i*x;
				}
		}
		
		System.out.println("Multiples of 1: ");
		for(int y = 0; y < 10; y++)
			System.out.println(array1[y]);
		
		System.out.println("Multiples of 2: ");
		for(int y = 0; y < 10; y++)
			System.out.println(array2[y]);
		
		System.out.println("Multiples of 3: ");
		for(int y = 0; y < 10; y++)
			System.out.println(array3[y]);
		
		System.out.println("Multiples of 4: ");
		for(int y = 0; y < 10; y++)
			System.out.println(array4[y]);
		
		System.out.println("Multiples of 5: ");
		for(int y = 0; y < 10; y++)
			System.out.println(array5[y]);
	}

}
