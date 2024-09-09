package Interfaces;

public class Main_Bicycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor_Bicycle mb=new Motor_Bicycle(7,10,2);
		mb.speedUp(20);
		System.out.println(mb.getSpeeds());
	}

}
