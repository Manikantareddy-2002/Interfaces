package Interfaces;

interface add{
	int add(int a,int b);
}
interface sub{
	int sub(int a,int b);
}
interface mul{
	int mul(int a,int b);
}
class Arithmetic implements add,sub,mul{

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
public class Interface_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub obj=new Arithmetic();
		System.out.println(obj.sub(10,20));
	}

}
