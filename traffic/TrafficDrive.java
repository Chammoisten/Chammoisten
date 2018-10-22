package traffic;
import java.util.Scanner;

public class TrafficDrive {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("��������أ�");
			String start = sc.next();	
			System.out.println("����Ŀ�ĵأ�");
			String end = sc.next();
			System.out.println("������룺");
			if(sc.hasNextDouble()) {
				double distance = sc.nextDouble();
				System.out.println("��"+start+"��"+end+"�ļ�������");
				Car car = new Car();
				car.printResult(distance);
				Train train = new Train();
				train.printResult(distance);
				Plane plane = new Plane();
				plane.printResult(distance);
			}
			else {
				System.err.println("�����д�����������");
			}
	   }
	}

}
