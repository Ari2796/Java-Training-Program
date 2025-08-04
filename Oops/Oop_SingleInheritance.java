//Single Inheritance 

import java.util.Scanner;
class Employee{
	private int empId;
	private String empName;
	
	public void getemployee() {
		System.out.print("Enter ID :");
		Scanner sc=new Scanner(System.in);
		empId=sc.nextInt();
		System.out.print("Enter Name :");
		empName=sc.next();
		
	}
	public void showEmp() {
		
		System.out.println("Id : "+empId);
		System.out.println("Name :"+empName);
	}
	
}
class dept extends Employee{
	private String Dept;
	protected float Salary;
	public void getDept() {
		getemployee();
		System.out.print("Enter Dept :");
		Scanner sc=new Scanner(System.in);
		Dept=sc.next();
		System.out.print("Enter salary :");
		Salary=sc.nextFloat();
	}
	public void showDept() {
		showEmp();
		System.out.println("Dept : "+Dept);
		System.out.println("Salary :"+Salary);
	}
}
public class Oop_SingleInheritance {
	public static void main(String[] args) {
		dept d=new dept();
		d.getDept();
		d.showDept();
	}
}
