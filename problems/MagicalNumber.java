package LogicalProblems;

public class MagicalNumber {

	public static void main(String[] args) {
		int a = 1729; 
		int sum=0;
		while(a>=10) {
			sum=0;
			while(a>0) {
				int r = a%10;
				sum+=r;
				a/=10;
			}
			a=sum;
		}
		if(a==1) System.out.println("magic");
		else System.out.println("not magic");
	}

}
