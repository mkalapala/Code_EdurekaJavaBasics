package manu.ja3ps1;

import java.util.ArrayList;

public class MK_ArrayList {
	
	public static void main(String[] args){
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add(0, "Apple");
		fruits.add(1, "Banana");
		fruits.add(2, "Cherry");
		fruits.add(3, "Guava");
		fruits.add(4, "Fig");
		fruits.add(5, "Kiwi");
		fruits.add(6, "Mango");
		
		System.out.println("The arraylist contains: "+fruits);
		
		for(int i = 0; i < fruits.size(); i++){
			fruits.remove(new Integer(i));
			System.out.println("Deleted item: "+fruits.get(i));
		}
	}
}
