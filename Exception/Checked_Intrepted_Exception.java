//if the mail or something is in sleep or wait for something at that time if a threat occur then this exception ;;;;
//the interrupted exception occurs when a threat is interrupted while sleeping or waiting ;;;;

package Exceptions;

public class Checked_Intrepted_Exception {
	public static void main(String[] args) {
	Thread t= new Thread(()->{
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	});
	t.start();
	t.interrupt();
	}
}

