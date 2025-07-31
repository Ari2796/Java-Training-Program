package Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ClassNotFound {
	public static void main(String[] args) {
		try {
			Class.forName("co.bannari.Class"); //defining a class at console
		}
		catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}
