package LogicalProblems;

import java.util.Scanner;

public class invertedPyramid {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<i;j++) {
					System.out.print("  ");
				}
				
				for(int k=n-i;k>=1;k--) {
					System.out.print(k+" ");
				}
				
				for(int l=2;l<=n-i;l++) {
					System.out.print(l+" ");
				}
				
				System.out.println();
			}
	}

}
