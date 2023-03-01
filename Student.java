class Student 
{
int rollno;
String name;
Static string College="MTCA";
Student(int r,String n)
	{
	rollno=r;
	name=n;
	void display()
		{
System.out.println(rollno+""+name+""+college);
		}
	}
	public class TestStaticVariable1
	{
	public static void main(String[] args) 
	{
	Students1=new student(111,"dinesh");
	Students2=new student(222,"vyshu");
	s1.display();
	s2.display();
	}
}
}