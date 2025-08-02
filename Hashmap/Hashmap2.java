package PostBasics;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {
	HashMap<Integer, String> products =new HashMap<Integer,String>();
	public void add(int id,String name) {
		if(products.containsKey(id)) System.out.println(id+ " is already have");
		else if(products.containsValue(name)) System.out.println(name +" is already Have");
		else {
			products.put(id, name);
			System.out.println(id +" "+name+"is added");
		}
		
	}
	public void show() {
		for(Map.Entry<Integer ,String> entry:products.entrySet()) {
			System.out.println("Product Id : " + entry.getKey() + " , Product Name :" +entry.getValue());
		}
	}
	public void remove(String name) {
		if(!products.containsValue(name)) {
			System.out.println(name + " is not available");
		}
		else {
			for(Map.Entry<Integer , String> entry:products.entrySet()) {
				
			}
		}
	}
	

}
