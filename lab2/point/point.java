package point;
import java.lang.*;
import java.util.*;
import java.io.*;



public class point
{
	public double x;
	public double y;
	public point()
	{
		x=randgenerator();
		y=randgenerator();
	}
	public double randgenerator()
	{
		Random r = new Random();
		x =-100 + (200) * r.nextDouble();
		return x;
	}
}
