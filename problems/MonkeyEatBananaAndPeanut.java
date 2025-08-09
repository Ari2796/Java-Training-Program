package LogicalProblems;

import java.util.Scanner;

public class MonkeyEatBananaAndPeanut {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();   //total monkey
		int eb=sc.nextInt(); //eatable banana
		int ep=sc.nextInt(); //eatable peanut
		int tb=sc.nextInt();//total banana
		int tp=sc.nextInt(); //total peanut
		int b=0,p=0;
		if(n==0 || eb==0||ep==0||tb==0||tp==0) {
			System.out.println("INVALID");
		}
		else {
			if(eb>0) {
				b=tb/eb;
				tb=tb%eb;
			}
			if(ep>0){
				p=tp/ep;
				tp=tp%ep;
			}
			n=n-b-p;
			if(tb!=0 && tp!=0) {
				n=n-1;
			}
			System.out.println(n);
		}
		
		

	}

}
