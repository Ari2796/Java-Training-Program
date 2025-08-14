package ArrayADT;

import java.util.Scanner;

public class ADT_Switch {
	private int a[];
	private int n;
	private int c;
	public ADT_Switch(int size) {
		this.c=size;
		this.a=new int[size];
	}
	
	
	public void insert(int val) {
		if(n>=c) System.out.println("INVALID");
		else {
			a[n++]=val;
			
		}
	}
	
	
	public void insertInd(int ind,int val) {
		if(n>=c) System.out.println("INVALID");
		else {
			for(int i=n-1;i>=ind;i--) {
				a[i+1]=a[i];
			}
			
			a[ind]=val;
			n++;
		}
	}
	
	
	public void deleteInd(int ind) {
		if(n>=c) System.out.println("INVALID");
		else {
			for(int i=ind;i<n;i++) {
				a[i]=a[i+1];
			}
			n--;
		}
	}
	
	public void search(int val) {
		boolean f=false;
		for(int i=0;i<n;i++) {
			if(a[i]==val) {
				System.out.println("Found");
				f=true;
			}
		}
		if(!f) System.out.println("Not Found");
	}
	
	public void display() {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ADT_Switch obj=new ADT_Switch(10);
		System.out.println("1.insert\n2.Insert in specific index\n3.delete\n4.Search\n5.display\n6.exit");
		boolean ans=true;
		while(ans) {
			System.out.println();
			int a=sc.nextInt();
			switch (a) {
			case 1:
				System.out.print("Enter the value to insert : ");
				int val=sc.nextInt();
				obj.insert(val);
				break;
			case 2:
				System.out.println("Enter index and value : ");
				int ind=sc.nextInt();
				int val1=sc.nextInt();
				obj.insertInd(ind, val1);
				break;
			case 3:
				System.out.print("Enter the index to delete : ");
				int i=sc.nextInt();
				obj.deleteInd(i);
				break;
			case 4:
				System.out.print("Enter the value to search : ");
				int val11=sc.nextInt();
				obj.search(val11);
				break;
			case 5:
				System.out.print("Values are : ");
				obj.display();
				break;
			case 6:
				ans=false;
				break;
			}
		}
	
	}
}
