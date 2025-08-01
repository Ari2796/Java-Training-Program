package Exceptions;
//casting an object to an incomplete type
public class Unchecked_ClassCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob=new String("Ari");
		Integer x=(Integer)ob;
	}

}
