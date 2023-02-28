import java.util.*;
public class Triangle1
{
static double calculateArea(double b,double h)
	{
double temp;
temp=1.0/2.0*b*h;
return temp;
		}
public static void main(String[] args)
		{
double b,h,a;
Scanner sc=new Scanner(System.in);
System.out.println(" Enter the base of the right angled triangle:");
base=sc.nextInt();

height=sc.nextInt();
System.out.println("Area of triangle:"+area_of_triangle(b,h));
	}
}
