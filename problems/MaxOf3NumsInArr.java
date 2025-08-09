package LogicalProblems;

import java.util.Scanner;

public class MaxOf3NumsInArr {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {1,2,3,4,5,6};
	int max=0;
	int k=sc.nextInt();
	int s=0 , e=2;
	while(s!=arr.length-k+1) {
	for(int i=s;i<=e;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println(max);
	max=0;
	s++;
	e++;
	}
}
}
