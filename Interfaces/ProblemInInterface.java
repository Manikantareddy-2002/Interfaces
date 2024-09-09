package Interfaces;

interface AC{
	static void show() {
		System.out.println("This show() from A");
	}
	default void display() {
		System.out.println("Display from A");
	}
}
interface BC{
	static void show() {
		System.out.println("This show() from B");
	}
	default void display() {
		System.out.println("Display from B");
	}
}
class Inface implements AC,BC{
	public void display() {
		AC.super.display();
		System.out.println("Sorry bro");
	}
}

public class ProblemInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inface a=new Inface();
		a.display();
	}

}
