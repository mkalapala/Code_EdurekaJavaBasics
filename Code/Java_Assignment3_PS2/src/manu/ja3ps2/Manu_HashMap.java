package manu.ja3ps2;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class Manu_HashMap {
	
	public static void main(String[] args){
		
		HashMap<Object, String> hmap = new HashMap<Object, String>();
		
		hmap.put(new Integer(1), "One");
		hmap.put(new Integer(4), "Four");
		hmap.put(new Integer(3), "Three");
		hmap.put(new Integer(2), "Two");
				
		@SuppressWarnings("rawtypes")
		Set s = hmap.entrySet();
		@SuppressWarnings("rawtypes")
		Iterator iter = s.iterator();
		
		while(iter.hasNext()){
			@SuppressWarnings("rawtypes")
			Map.Entry me = (Map.Entry)iter.next();
			int key = (Integer)me.getKey();
			String value = (String)me.getValue();
			
			System.out.println("Key: "+key);
			System.out.println("Value: "+value);
		}
	}

}
