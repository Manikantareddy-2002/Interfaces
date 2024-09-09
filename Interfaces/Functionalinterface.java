package Interfaces;

interface Func1{
	void show();
	static void a() {
		
	}
}
interface Func2{
	void show(int a,int b);
	default void b() {
		
	}
}


public class Functionalinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func1 obj=()->System.out.println("Hi");
		Func2 obj1=(x,y)->System.out.println(x+y);
		obj1.show(10,20);
	}

}
