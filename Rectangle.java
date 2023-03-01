class Rectangle
{
double length;
double width;
public Rectangle()
	{
length=width=0.0;
	}
public Rectangle(double l,double w)
		{
	length=l;
		width=w;
		}
public void area()
	{
System.out.println("area is"+(length*width));
	}
}
public class RectangleDemo
{
public static void main(String[] args) 
	{
Rectangle MyRectangle1=new Rectangle();
Rectangle myRectangle2=new rectangle(2,5);
myRectangle1.area();
myRectangle2.area();
	}
}
