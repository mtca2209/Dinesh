import java.util.*;
public class Progam501
{
static double area_of_triangle(double b,double h)
	{
	return 0.5*b*h;
	}
public static void main(String[] args)
		{
double b,h;
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter b and h of triangle:");
b=sc.nextInt();
h=sc.nextInt();
System.out.println("Area of triangle:"+area_of_triangle(b,h));
	}
}
