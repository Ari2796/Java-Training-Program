package PostBasics;

import java.util.*;
import java.util.Map.Entry;   //we can use Map.Entry instead of this

public class Hashmap1 {
	public static void main(String[] args) {
		
	
	HashMap<Integer,String> students=new HashMap<Integer , String>();
	students.put(101 ,"n1");
	students.put(102 ,"n2");
	students.put(103 ,"n3");
	students.put(104 ,"n4");
	students.put(105 ,"n5");
	
	System.out.println(students);
	
	System.out.println(students.get(104));  //Accesing an entry/item
	
	students.remove(103); // to delete an item;
	
	Set keys = students.keySet();

	System.out.println(keys);


	Iterator<Integer> it = keys.iterator(); //	iterate items

	while(it.hasNext()) {

		System.out.println(it.next());

	}



	for (String name : students.values()) {   //	iterate value

		System.out.println(name);

	}
	
	System.out.println(students.entrySet());
	 for (Entry<Integer, String> entry : students.entrySet()) {   //Entry is like iterator and entry : is an object to call
         System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
     }
	 
	 System.out.println("Contains key (101) : "+ students.containsKey(101));
}
}
