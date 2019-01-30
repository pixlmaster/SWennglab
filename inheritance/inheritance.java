import java.lang.*;
import java.util.*;
import java.io.*;

class Person
{
	int ID;
	String Mobile_No;
	Scanner inp = new Scanner(System.in);
	void ReadData()
	{
		System.out.println("Enter ID-");
		ID=inp.nextInt();
		System.out.println("Enter Number-");
		Mobile_No=inp.next();
	}
	void PrintData()
	{
		System.out.println("ID=" + ID);
		System.out.println("Mbole Number = " + Mobile_No);
	}
}

class Student extends Person
{
	int Category;
	int Roll_No;
	String Department;
	int Marks[] = new int[3];
	void ReadData(){
		super.ReadData();
		System.out.println("enter category");
		Category = inp.nextInt();
		System.out.println("enter Roll no");
		Roll_No=inp.nextInt();
		System.out.println("enter Department");
		Department=inp.next();
		for(int i =0 ;i<3;i++){
			System.out.println("enter marks of subject-"+ i);
			Marks[i]=inp.nextInt();
		}
	}
	void PrintData()
	{
		super.PrintData();
		System.out.println("category- " + Category);
		System.out.println("enter Roll no- " + Roll_No);
		System.out.println("enter Department" + Department);
	}
}

class Employee extends Person{
	int EmployerCode;
	int Salary;
	String Designation;
	String DoJ;
	void ReadData(){
		super.ReadData();
		System.out.println("enter Employer Code");
		EmployerCode = inp.nextInt();
		System.out.println("enter Salary");
		Salary=inp.nextInt();
		System.out.println("enter Designation");
		Designation=inp.next();
		System.out.println("enter DOJ-");
		DoJ=inp.next();
	}
	void PrintData()
	{
		super.PrintData();
		System.out.println("Employer Code-" + EmployerCode);
		System.out.println("Salary-" + Salary);
		System.out.println("Designation-" + Designation);
		System.out.println("DOJ-" + DoJ);
	}
}

class read{
	public static void main(String args[]){
		Person p[]= new Person[3]; 
		Person p1= new Person();
		Student s = new Student();
		Employee e = new Employee();
		for(int i=0;i<1;i++){
			System.out.println("enter student = ");
			s.ReadData();
			p[i]=s;
		}
		for(int i=1;i<2;i++){
			System.out.println("enter Employee = ");
			e.ReadData();
			p[i]=e;
		}
		for(int i=2;i<3;i++){
			System.out.println("enter person = ");
			p1.ReadData();
			p[i]=p1;
		}
		for(int i=0;i<3;i++){
			p[i].PrintData();
		}
	}
}