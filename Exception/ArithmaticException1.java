package Exceptions;

public class ArithmaticException1 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
//			if(b==0)
//			throw new ArithmeticException("divide by zero is not possible");
//			int x=a/b;
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
	}

}
