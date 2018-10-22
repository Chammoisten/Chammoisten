package traffic;

public class Car extends Traffic {
	
	@Override
	public void calculation(double distance) {
		name = "³ËÆû³µ";
		startTime = 20;
		endTime= 20;
		getTicket = 5;
		securityCheck = 2;
		waiting = 10;
		speed = 70;
		price = 0.32;
		allTime = startTime+ endTime+getTicket+securityCheck+waiting+(distance/speed)*60;
		allPrice = distance*price + 4;
	}
}
