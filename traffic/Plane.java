package traffic;

public class Plane extends Traffic {
	
	@Override
	public void calculation(double distance) {
		name = "³Ë·É»ú";
		startTime = 90;
		endTime= 90;
		getTicket = 30;
		securityCheck = 40;
		waiting = 30;
		speed = 740;
		price = 0.75;
		allTime = startTime+ endTime+getTicket+securityCheck+waiting+(distance/speed)*60;
		allPrice = distance*price + 50;
	}
}
