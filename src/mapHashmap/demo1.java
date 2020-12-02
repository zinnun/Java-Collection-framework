package mapHashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class demo1 {

	public static void main(String[] args) {


		//HashMap hm1 = new HashMap();
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		
		hm1.put(101, "John");
		hm1.put(102, "David");
		hm1.put(103, "John");
		hm1.put(104, "Mary");
		hm1.put(105, "tye");
		hm1.put(104, "Ray");
		
		System.out.println(hm1);		//{101=John, 102=David, 103=John, 104=Ray, 105=tye}
		
		System.out.println(hm1.get(105));	//tye
		
		hm1.remove(103);
		System.out.println(hm1);		//{101=John, 102=David, 104=Ray, 105=tye}
		
		System.out.println(hm1.containsKey(107));		//false
		
		System.out.println(hm1.containsValue("tye"));	//true
		
		System.out.println(hm1.isEmpty());				//false
		
		System.out.println(hm1.keySet());				//[101, 102, 104, 105]
		
		System.out.println(hm1.values());				//[John, David, Ray, tye]
		
		System.out.println(hm1.entrySet());				//[101=John, 102=David, 104=Ray, 105=tye]
		
//		for (Object i: hm1.keySet()) {
//			System.out.print(i+"="+ hm1.get(i)+ " ");
//			//System.out.println(hm1.get(i));
//		}
		
		
//		///entry methods
//		for(Map.Entry entry :hm1.entrySet()) {		//101 x
//			
//			System.out.println(entry.getKey()+ "   "+ entry.getValue());
//		}
		
		Set s= hm1.entrySet();
		Iterator it= s.iterator();
		while (it.hasNext()) {
			
			Map.Entry entry=(Entry) it.next();			//to store entry ojects we need to use Map.Entry 
			System.out.println(entry.getKey()+ "    "+ entry.getValue());
			
		}
	}

}
























