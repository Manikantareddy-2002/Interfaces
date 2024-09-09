package Interfaces;

public class Motor_Bicycle implements Bicycle{
	private int seats;
	private int brakes;
	private int speeds;
	Motor_Bicycle(int seat,int brake,int speed){
		seats=seat;
		brakes=brake;
		speeds=speed;
	}

	@Override
	public void applyBrake(int dec) {
		// TODO Auto-generated method stub
		speeds-=dec;
	}

	@Override
	public void speedUp(int inc) {
		// TODO Auto-generated method stub
		speeds += inc;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getBrakes() {
		return brakes;
	}

	public void setBrakes(int brakes) {
		this.brakes = brakes;
	}

	public int getSpeeds() {
		return speeds;
	}

	public void setSpeeds(int speeds) {
		this.speeds = speeds;
	}

}
