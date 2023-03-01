import java.util.Scanner;
public class Program307
{
static double area_of_a_circle(double radius)
	{
return Math.PI*radius;
	}
public static void main(String[] args)
	{
double radius;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the cicle:");
radius=sc.nextDouble();
System.out.println("Area oe he circle:"+area_of_a_circle(radius));
}
}