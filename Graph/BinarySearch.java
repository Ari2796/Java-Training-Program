package Searching;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {6,3,6,8,4,87,0,4,0,4,6,9,9,5,57,42};
		int n=4;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
		System.out.println("\n"+n+" is in "+ search(arr,n));
	}
	public static int search(int arr[],int n){
		int l=0,r=arr.length-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(n==arr[mid]) return mid;
			else if(n>arr[mid]) l=mid+1;
			else r=mid-1;
		}
		return -1;
	}
}
