package traffic;

public class Train extends Traffic {
	
	@Override
	public void calculation(double distance) {
		name = "³Ë¸ßÌú";
		startTime = 50;
		endTime= 40;
		getTicket = 10;
		securityCheck = 15;
		waiting = 30;
		speed = 300;
		price = 0.45;
		allTime = startTime+ endTime+getTicket+securityCheck+waiting+(distance/speed)*60;
		allPrice = distance*price + 10;
	}
}
