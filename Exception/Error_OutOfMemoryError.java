package Exceptions;

import java.util.*;

//it occurs when jvm run out of heap memory
public class Error_OutOfMemoryError {

	public static void main(String[] args) {
		List<int[]> x=new ArrayList<>();
		while(true) {
			x.add(new int[1000000000]);
		}

	}

}
