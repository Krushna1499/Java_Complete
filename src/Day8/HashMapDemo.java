package Day8;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		//Declaration	
		//HashMap hm=new HashMap();
		
		HashMap <Integer,String> hm= new HashMap<Integer,String>();
		
		//Adding pairs into hashmap
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "David");
		hm.put(104, "Smith");
		hm.put(105, "Kim");
		
		System.out.println(hm);
		// Remove a pair from hasmap
		hm.remove(103);
		System.out.println("After removing a pair: "+hm);
		
         // reading pairs using for loop
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}

// in this we have key and value concept 
// dont have any index concept in hashmap