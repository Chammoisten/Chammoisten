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
		System.out.println("请输入汽车名\t");
		brand=sc.next();
		System.out.println("请输入油耗\t");
	    oilConsumption=sc.next();
		System.out.println("请输入油箱容量\t");
		tank=sc.next();	
	}
public boolean gas() {
	System.out.println("油箱加满");
	return true;
}
public boolean run() {
	System.out.println("车辆已经开动");
	return true;
}
public void look() {
	System.out.println("你需要一辆"+brand+"牌的车");
	System.out.println("你的车的油箱为 "+tank+" L");
	System.out.println("你的车的油耗为 "+oilConsumption+" L/km");
}
}
