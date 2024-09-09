package Interfaces;

interface AICTE{
	void intrafree();
	default void questionpaper() {
		System.out.println("You may follow the Question paper");
	}
	static void guidelines(){
		System.out.println("You must follow the Guide lines");
	}
}
class Autonomous implements AICTE{

	@Override
	public void intrafree() {
		// TODO Auto-generated method stub
		System.out.println("100 acres");
		System.out.println("60 buses");
		System.out.println("2 lakh per year");

	}
	public void questionpaper() {
		System.out.println("You may use your own question paper");
	}
	
}
class Afiliated implements AICTE{

	@Override
	public void intrafree() {
		// TODO Auto-generated method stub
		System.out.println("50 acres");
		System.out.println("10 buses");
		System.out.println("1 lakh per year");

	}
	public void questionpaper() {
		System.out.println("You can't use your own question paper");
	}
	
}


public class JavaNewInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AICTE a=new Autonomous();
		Afiliated b=new Afiliated();
		AICTE.guidelines();
		a.intrafree();
		b.questionpaper();
	}

}
