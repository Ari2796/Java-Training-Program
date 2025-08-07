package LogicalProblems;

import java.util.Scanner;

public class consecutive1s {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,1,0,1,1,1,0,1,1,1,0};
		int max=0;
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				c++;
				max=Math.max(max, c);
			}
			else {
				//if(max<c) max=c;
				c=0;
			}
		}
		System.out.println(max);
	}

}
