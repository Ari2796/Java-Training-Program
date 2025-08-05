package PostBasics;
import java.util.*;
public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
		lhm.put("C", 90);
		lhm.put("C++", 92);
		lhm.put("Java", 95);
		lhm.put("Python", 94);
		lhm.put("Spring", 97);
		
		
		System.out.println(lhm);
		
		lhm.putIfAbsent("Swift", 87);
		System.out.println(lhm);
		
		System.out.println(lhm.get("C"));
		
		System.out.println(lhm.getOrDefault("Spring", 100));
		
		
	}

}
