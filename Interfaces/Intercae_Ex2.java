package Interfaces;

interface flyable{
	void fly();
}
interface walkable{
	void walk();
}
interface runnable{
	void run();
}
class human implements flyable,walkable,runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Human is running");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Human is walking");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Human can't flying");
	}
	
}
class Eagle implements flyable,walkable,runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Eagle is running");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Eagle is walking");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Eagle is flying");
	}
}
class Intercae_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human h=new human();
		h.run();
		h.walk();
		h.run();
	}

}
