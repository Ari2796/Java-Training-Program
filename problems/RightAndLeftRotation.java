package LogicalProblems;

import java.util.Scanner;

public class RightAndLeftRotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,55,6,7};
		int k=sc.nextInt();
		int t[]=new int[arr.length];
		int n=arr.length;
		for(int i=0;i<n;i++) {
			t[(i+k)%n]=arr[i];   //right rotation;
			}
//		for(int i=0;i<n;i++) {
//			t[i]=arr[(i+k)%n];   //left rotation;
//			}
//		
//		}
		for(int i=0;i<n;i++) {
			System.out.print(t[i]+" ");
		}
	}
}
