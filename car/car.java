import java.util.Scanner;
public class car {
	public String brand;
	public String tank;
	public String oilConsumption;
	
@SuppressWarnings("resource")
public car() {
		brand= "audi";
		oilConsumption= "2.0";
		tank= "200";}
public void buy() {
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		System.out.println("������������\t");
		brand=sc.next();
		System.out.println("�������ͺ�\t");
	    oilConsumption=sc.next();
		System.out.println("��������������\t");
		tank=sc.next();	
	}
public boolean gas() {
	System.out.println("�������");
	return true;
}
public boolean run() {
	System.out.println("�����Ѿ�����");
	return true;
}
public void look() {
	System.out.println("����Ҫһ��"+brand+"�Ƶĳ�");
	System.out.println("��ĳ�������Ϊ "+tank+" L");
	System.out.println("��ĳ����ͺ�Ϊ "+oilConsumption+" L/km");
}
}
