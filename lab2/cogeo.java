import circle.*;

import java.lang.*;
import java.util.*;
import java.io.*;

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