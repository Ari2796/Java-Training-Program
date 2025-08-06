package LogicalProblems;

public class AdamsNumber {

	public static void main(String[] args) {
		int n=12;
		int rn=n*n;
		int r=rev(n);
		if(rn==rev(r*r)) {
			System.out.println("ITs ADAM");
		}
		else System.out.println("NOT");
	}
	static int rev(int n) {
		int rev=0;
		while(n>0) {
			
			int temp=n%10;
			rev=rev*10+temp;
			n/=10;
		}
		return rev;
	}
	

}
