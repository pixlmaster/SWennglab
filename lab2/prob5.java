import java.lang.*;
import java.util.*;
import java.io.*;

class person
{
	int id;
	int mobileno;
	Scanner inp = new Scanner(System.in);
	void readdata()
	{
		System.out.println("enter id(int) = ");
		id = inp.nextInt();
		System.out.println("enter mobile no(int) = ");
		mobileno=inp.nextInt();
	}
	void printdata()
	{
		System.out.println("id = "+id);
		System.out.println("mobile no = " + mobileno);
	}
}

class student extends person
{
	int category;
	int rollno;
	String department;
	int marks[] = new int[3];
	void readdata()
	{
		super.readdata();
		System.out.println("enter category(int) = ");
		category=inp.nextInt();
		System.out.println("enter roll no(int) = ");
		rollno = inp.nextInt();
		System.out.println("enter department(string) = ");
		department = inp.next();
		for(int i=0;i<3;i++)
		{
			System.out.println("enter marks = ");
			marks[i]=inp.nextInt();
		}
	}
	void printdata()
	{
		super.printdata();
		System.out.println("category = "+category);
		System.out.println("roll no = " + rollno);
		System.out.println("department = " + department);
		for(int i=0 ;i< 3;i++)
		{
			System.out.println("marks = " + marks[i]);
		}
	}
}

class employee extends person
{
	int employeecode;
	int salary;
	String designation;
	String dateofjoining;
	void readdata()
	{
		super.readdata();
		System.out.println("enter employee code(int) = ");
		employeecode=inp.nextInt();
		System.out.println("enter salary(int) = ");
		salary = inp.nextInt();
		System.out.println("enter designation(string) = ");
		designation = inp.next();
		System.out.println("enter date of joining (string) = ");
		dateofjoining= inp.next();
	}
	void printdata()
	{
		super.printdata();
		System.out.println("employeecode = "+employeecode);
		System.out.println("salary = " + salary);
		System.out.println("designation = " + designation);
		System.out.println("dateofjoining = " + dateofjoining);
	}

}

class read
{
	public static void main(String args[])
	{
		person p[]= new person[10];
		person p1 = new person();
		student s= new student();
		employee e= new employee();
		for(int i=0;i<4;i++)
		{
			System.out.println("enter student = ");
			s.readdata();
			p[i]=s;
		}
		for(int i=4;i<8;i++)
		{
			System.out.println("enter person = ");
			p1.readdata();
			p[i]=p1;
		}
		for(int i=8;i<10;i++)
		{
			System.out.println("enter employee = ");
			e.readdata();
			p[i]=e;
		}
		for(int i=0;i<10;i++)
		{
			p[i].printdata();
		}
		
	}
}
