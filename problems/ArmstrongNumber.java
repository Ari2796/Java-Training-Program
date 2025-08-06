package LogicalProblems;

public class ArmstrongNumber {

		public static void main(String[] args) {

	int num=157;
	int sum=0;
	while(num>0) {
		sum+=fac(num%10);
		num/=10;
	}
	if(num==sum)
		System.out.println("Armstrong Number");
	else
		System.out.println("not");
		}
	static int fac(int a) {
		if(a==0)
			return 1;
		return a*fac(a-1);
	}
}
