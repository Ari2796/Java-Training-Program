package PostBasics;

import java.util.Scanner;

public class HashmapEg {

	public static void main(String[] args) {
		Hashmap2 h=new Hashmap2();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add \n2.Show \n3.Remove \n4.exit");
		while(true) {
			int num=sc.nextInt();
			if(num==1) {
				System.out.println("Enter id name :");
				int id=sc.nextInt();
				
				String name=sc.nextLine();
				h.add(id,name);
			}
			else if(num==2) {
				h.show();
			}
			else if(num==3) {
				String name=sc.nextLine();
				h.remove(name);
			}
			else break;
		}
		
		

	}

}
