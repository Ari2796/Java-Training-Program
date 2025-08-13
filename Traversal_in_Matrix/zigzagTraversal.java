package java_basics;

import java.util.Scanner;

public class zigzagTraversal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [][]arr=new int[n][n];
		for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=sc.nextInt();
				}
		
		}
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					System.out.println(arr[i][j]);
				}
			}
			else {
				for(int j=n-1;j>=0;j--) {
					System.out.println(arr[i][j]);
				}
			}
		}

	}

}
