import java.lang.*;
import java.util.*;
import java.io.*;
import point.*;

class readintegers
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a,b,c");
		a=inp.nextInt();
		b=inp.nextInt();
		c=inp.nextInt();
		int max;
		if(a>b)
		{
			max=a;
			if(c>max)
			{
				max=c;
			}
		}		
		else
		{
			max=b;
			if(c>max)
			{
				max=c;
			}
		}
		System.out.println("Max="+max);

		}
}

class command
{
	public static void main(String args[])
	{
		int max,a,b,c;
		a=Integer.parseInt(args[0]);							//reading from command line
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		if(a>b)													//finding max element
		{
			max=a;
			if(c>max)
			{
				max=c;
			}
		}		
		else
		{
			max=b;
			if(c>max)
			{
				max=c;
			}
		}
		System.out.println("Max="+max);							//print max element
	}
}

class inputstream
{
	public static void main(String args[])
	{	
			int max,a,b,c;
			DataInputStream input = new DataInputStream(System.in);
			String temp;
			try
			{
				temp=input.readLine();						//reading input
				a=Integer.parseInt(temp);
				temp=input.readLine();
				b=Integer.parseInt(temp);
				temp=input.readLine();
				c=Integer.parseInt(temp);
				if(a>b)										//finding max element
				{
					max=a;
					if(c>max)
					{
						max=c;
					}
				}		
				else
				{
					max=b;
					if(c>max)
					{
						max=c;
					}
				}
				System.out.println("Max="+max);				// printing max element
			}catch(Exception e){}
	}
}

class fact
{
	int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
}

class factcalc
{
	public static void main (String args[])
	{
			fact f = new fact();
			Scanner inp= new Scanner(System.in);
			int n;
			System.out.print("enter n = ");
			n=inp.nextInt();
			System.out.println(f.factorial(n));
	}
}

class Fibo
{
	int Fibonacci(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
	}
}

class fibocalc
{
	public static void main(String args[])
	{
		Fibo f = new Fibo();
		Scanner inp = new Scanner(System.in);
		int n;
		System.out.println("enter n = ");
		n= inp.nextInt();
		System.out.println(f.Fibonacci(n));
	}
}

class checkfibo
{
	Fibo fc = new Fibo();	
	int Fibonacci(int n,int number)
	{
		if(fc.Fibonacci(n)==number)
		{
			return 1;
		}
		else if(fc.Fibonacci(n)>number)
		{
			return -1;
		}
		else
		{
			int x=Fibonacci(n+1,number);
			return x;
		}
	}
}

class fibocheck
{
	public static void main(String args[])
	{
		checkfibo f = new checkfibo();
		Scanner inp = new Scanner(System.in);
		int n;
		System.out.println("enter number to check = ");
		n= inp.nextInt();
		int x= f.Fibonacci(0,n);
		if(x==-1)
		{
			System.out.println("not fibo");
		}
		else
		{
			System.out.println("fibo");
		}
	}
}

class checkprime
{
	int check(int i,int n)
	{
		if(i*i>n)
		{
			return 1;
		}
		else if(n%i==0)
		{
			return -1;
		}
		else
		{
			return check(i+1,n);
		}
	}
}

class primecheck
{
	public static void main(String args[])
	{
		checkprime p = new checkprime();
		Scanner inp = new Scanner(System.in);
		int n;
		System.out.println("enter number to check = ");
		n= inp.nextInt();
		int x= p.check(2,n);
		if(x==-1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
	}
}

class GCDcalc
{
	int calc(int a, int b)
	{
		if(a==0)
		{
			return b;
		}
		else
		{
			return calc(b%a,a);
		}
	}
}

class GCD
{
	public static void main(String args[])
	{
		GCDcalc g = new GCDcalc();
		Scanner inp = new Scanner(System.in);
		int x,a,b;
		System.out.println("enter a = ");
		a= inp.nextInt();
		System.out.println("enter b = ");
		b= inp.nextInt();
		if(a>b)
		{
			x = g.calc(b,a);
		}
		else
		{
			x= g.calc(a,b);
		}
		System.out.println("GCD is " + x);
	}
}

class hanoicalc
{
	void calc(int n,char a, char b , char c)
	{
		if(n==1)
		{
			System.out.println("move disk 1 from " + a + " to " + b);
			return;
		}
		calc(n-1,a,c,b);
		System.out.println("Move disk " + n + " from rod " + a + " to rod " +b); 
    	calc(n-1, c, b, a); 
	}
}

class hanoi
{
	public static void main(String args[])
	{
		System.out.println("Enter n");
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		hanoicalc h= new hanoicalc();
		h.calc(n, 'A','C','B');
		
	}
}


class circle
{
	point center,p;
	circle()
	{
		center = new point();
		p= new point();
	}
	double hypot(double x1, double y1,double x2, double y2)
	{
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	double r;
	double radius()
	{
		return hypot(center.x,center.y, p.x,p.y);
	}
	double area(double r)
	{
		return 3.14*r*r;
	}
	double circ(double r)
	{
		return 6.28*r;
	}
	
}

class hyp
{
	double hypot(double x1, double y1,double x2, double y2)
	{
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	} 
}



class cogeo
{
	public static void main(String args[])
	{
		int n;
		Scanner inp = new Scanner(System.in);
		n=inp.nextInt();
		circle arr[] = new circle[n];
		hyp h = new hyp();
		for(int i=0;i<n;i++)
		{
			arr[i]= new circle();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>i)
				{
					double diff=diff= arr[i].radius()-arr[j].radius();;
					if(diff<0)
					{
						diff=-diff;
					}
					if(h.hypot(arr[i].center.x, arr[i].center.y,arr[j].center.x,arr[j].center.y)<diff)
					{
						System.out.println("circle " + j + " is inside " + i);
					}
				}
			}
		}
	}
}


