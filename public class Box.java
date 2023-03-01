public class Box 
{
private double width;
private double height;
private double depth;
public Box
	{
public Box(double W,double d)
		{
width=w;
height=h;
depth=d;
		}
	public void volume()
		{
System.out.println("volume="+(width*height*depth));
		}
	}
public class BoxDemo()
	{
	public static void main(String[] args) 
	{
	Box my Box1=new Box();
	Box my Box2=new Box(10,15,20);
	myBox1.volume();
	myBox2.volume();
	}
}
}