package Interfaces;

interface C extends A,B
{
	void msg1();
}
class implement implements C
{
	public void msg()
	{
		System.out.println("Hello mani");
	}
	public void greet()
	{
		System.out.println("Welcome!");
	}
	public void msg1()
	{
		System.out.println("To our company");
	}
}
public class Main_for_interfaces {
	public static void main(String[] args)
	{
		implement obj=new implement();
		obj.greet();
	}

}
