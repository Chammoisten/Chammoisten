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
	
	abstract protected void calculation(double distance); //���㽻ͨ��ʽ���ĵ�ʱ��ͽ�Ǯ

	//���������
	public void printResult(double distance) {
		calculation(distance);
		System.out.println(name+"��ʱ��"+allTime+" ���ѣ�"+allPrice);		
	}
}
