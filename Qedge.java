package abc;

 class Constructors

{
	public void xyz()
	{
		System.out.println("im in method");
	}
	
	static void abc()
	{
		System.out.println("im in static method");
	}
	
	public Constructors()
	{
		System.out.println("im in constructor");
	}	
}
public class Qedge
{
	public static void main(String ar[])
	{
		Constructors.abc();
	Constructors c=new Constructors();
		c.xyz();

	}
}
