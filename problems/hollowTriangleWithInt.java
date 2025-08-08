package LogicalProblems;

import java.util.Scanner;

public class hollowTriangleWithInt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(k==1 || k==i ||i==n) {
					System.out.print(k+" ");
				}
				else System.out.print("  ");
			}
			System.out.println();
		}	
	}
}
