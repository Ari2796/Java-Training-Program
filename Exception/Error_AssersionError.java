package Exceptions;

public class Error_AssersionError {

	public static void main(String[] args) {
		int a = 15;
		assert a < 10 : "Assertion failed: a should be less than 10";
		System.out.println("Assertion passed");

	}

}
