import java.util.Date;
class Date3
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		Date d1=new Date(2023-02-1);
		System.out.println(d);
		System.out.println(d.after(d1));
	}
}
