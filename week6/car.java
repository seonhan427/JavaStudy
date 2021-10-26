package week6;



public class car {
	int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
class SportsCar extends car{
	boolean turbo;
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
}