class tangle
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
Rectangle myRectangle1=new Rectangle();
Rectangle myRectangle2=new Rectangle(5,9);
myRectangle1.area();
myRectangle2.area();
	}
}
