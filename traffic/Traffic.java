package traffic;

abstract public class Traffic {
	protected String name;
	protected double startTime;
	protected double endTime;
	protected double getTime;
	protected double getTicket;
	protected double securityCheck;
	protected double waiting;
	protected double speed;
	protected double price;
	protected double allTime;
	protected double allPrice;
	
	abstract protected void calculation(double distance); //计算交通方式消耗的时间和金钱

	//输出计算结果
	public void printResult(double distance) {
		calculation(distance);
		System.out.println(name+"耗时："+allTime+" 花费："+allPrice);		
	}
}
