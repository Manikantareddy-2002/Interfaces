package Interfaces;

public class Run implements Running1.NestedInterface
{
	public boolean isOdd(int num)
	{
		return (num&1)==1;
	}
}
