package java_basics;

import java.util.Scanner;

public class spiralTraversal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [][]arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int top=0;
		int bottom=n-1;
		int left=0,right=n-1;
		while(top<=bottom && left<=right) {
			for(int i=left ;i<=right;i++) {
				System.out.println(arr[top][i]);
			}
			top++;
			
			for(int i=top;i<=bottom;i++) {
				System.out.println(arr[i][right]);
				
			}
			right--;
			
			for(int i=right ;i>=left;i--) {
				System.out.println(arr[bottom][i]);
			}
			bottom--;
			
			for(int i=bottom;i>=top;i--) {
				System.out.println(arr[i][left]);
			}
			left++;
		}
	}
}
