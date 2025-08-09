package LogicalProblems;


public class MostConsequtiveRepeatedElement {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,4,4,2,3,2,2,2,2,1,9,0};
		int max=0,num=0;
		for(int i=0;i<a.length-1;i++) {
			int left=i,right=i+1,c=0;
			while(a[left]==a[right]) {
				c++;
				right++;
			}
			if(max<c) {
				max=c;
				num=a[left];
			
		}
	}
		System.out.println(num);
	}
}
