package week2;

public class time {
	public static void main(String[] args) {
		final double lightspeed = 300000;
		double distance = 40e12;
		
		double secs;
		
		secs = distance/lightspeed;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("걸리는 시간은 "+light_year+"광년입니다.");
	}
}
