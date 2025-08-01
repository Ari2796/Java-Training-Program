package Exceptions;

import java.util.Scanner;

//it throws when a method is invoked at an illegal or inappropriate time
public class Unchecked_IllegelState {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		sc.nextLine();
	}
}
