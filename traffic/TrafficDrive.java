package traffic;
import java.util.Scanner;

public class TrafficDrive {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("输入出发地：");
			String start = sc.next();	
			System.out.println("输入目的地：");
			String end = sc.next();
			System.out.println("输入距离：");
			if(sc.hasNextDouble()) {
				double distance = sc.nextDouble();
				System.out.println("从"+start+"到"+end+"的计算结果：");
				Car car = new Car();
				car.printResult(distance);
				Train train = new Train();
				train.printResult(distance);
				Plane plane = new Plane();
				plane.printResult(distance);
			}
			else {
				System.err.println("输入有错，请重新输入");
			}
	   }
	}

}
