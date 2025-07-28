package BackTracking;

public class TowerOfHanoi {
		public void hanoi(int n,char s,char a,char d) {
			 if (n == 1) {
		            System.out.println("Move disk 1 from " + s + " to " + d);
		            return;
		        }
			hanoi(n-1,s,d,a);
			System.out.println("Move disk " + n + " from " + s + " to " + d);
			hanoi(n-1,a,s,d);
		}
		public static void main(String []args) {
			int n=3;
			TowerOfHanoi t=new TowerOfHanoi();
			t.hanoi(n, 'A', 'B', 'C');
		}
}
