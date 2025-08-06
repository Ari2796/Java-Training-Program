package LogicalProblems;

import java.util.Scanner;

public class amicablePair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=284;
		int b=220;
		int sa=0,sb=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) sa+=i;
		}
		for(int i=1;i<b;i++) {
			if(b%i==0) sb+=i;
		}
		if(sa==b && sb==a) System.out.println("Amicable Pair");
		else System.out.println("NOT");
	}

}
