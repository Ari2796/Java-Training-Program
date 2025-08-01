package Exceptions;
//we cant change list<string> ;;;;
import java.util.List;
import java.util.Scanner;

public class Unchecked_UnsupportedOperation {
	public static void main(String[] args) {
		List<String> x=List.of("A","B");
		x.add("C");
	}
}
