package ArrayADT;

public class crudInADT {
	private int a[];
	private int n;
	private int c;
	public crudInADT(int size) {
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
		crudInADT obj=new crudInADT(10);
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.display();
		System.out.println("Insert in ind");
		obj.insertInd(2, 25);
		obj.display();
		System.out.println("DELETE ");
		obj.deleteInd(2);
		obj.display();
		System.out.println("Search");
		obj.search(20);
		obj.display();
	
	}

}
