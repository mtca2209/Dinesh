class StaticMethod
{
static void myStaticMethod()
	{
System.out.println("static methods methods must be called by creating object");
	}
	public void myPublicMethod()
	{
System.out.println("public methods can be called by creating object");
	}
	public static void main(String[] args) 
	{
		myStaticMethod();
		StaticMethod myObj=new StaticMethod();
		myObj.myPublicMethod();
	}
}
