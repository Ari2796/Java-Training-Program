//we need to access the class we need to crate objects
//when a program contains n num of classes to access the methods of outer class we have to create objects for that specific class
//whenever we are creating a constructor we must create a object


package Exceptions;
import java.lang.reflect.Method;

class Secret {
    private void hiddenMethod() {
        System.out.println("This is a secret method.");
    }
}
public class Checked_IllegelAccessException {
	 public static void main(String[] args) {
	        try {
	            Secret s = new Secret();

	            // Try to access the private method
	            Method method = Secret.class.getDeclaredMethod("hiddenMethod");

	            // This will throw IllegalAccessException if setAccessible(true) is not called
	            method.invoke(s);
	        } catch (IllegalAccessException  | NoSuchMethodException e ) {
	            System.out.println("Caught IllegalAccessException: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Caught some other exception: " + e);
	        }
}
}
