package circle;
import point.*;
public class circle
{
	public point center,p;
	public circle()
	{
		center = new point();
		p= new point();
	}
	public double hypot(double x1, double y1,double x2, double y2)
	{
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	public double r;
	public double radius()
	{
		return hypot(center.x,center.y, p.x,p.y);
	}
	public double area(double r)
	{
		return 3.14*r*r;
	}
	public double circ(double r)
	{
		return 6.28*r;
	}
	
}