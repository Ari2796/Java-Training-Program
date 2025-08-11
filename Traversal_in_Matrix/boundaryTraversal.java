package java_basics;

import java.util.Scanner;

public class boundaryTraversal {

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
			System.out.println(arr[0][i]);
		}
		for(int i=1;i<n;i++) {
			System.out.println(arr[i][n-1]);
		}
		for(int i=n-2;i>=0;i--) {
			System.out.println(arr[n-1][i]);
		}
		for(int i=n-2;i>=1;i--) {
			System.out.println(arr[i][0]);
		}
	}

}
