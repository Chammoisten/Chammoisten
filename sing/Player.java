package sing;

import java.util.Scanner;

public class Player {
	public String getUserString(Scanner sc,String message) {
		String t;
		while(true) {
			System.out.println("please input" + message +":");
			t =sc.next();
			if(t==null||t.equals(" ")) {
				System.out.println(message+"not null,reinput");
			}else {
				break;
			}
		}
			return t;
	}
	public double getUseNumber(Scanner sc) {
		double t;
		while(true) {
			System.out.println("please input time of the song:");
			t=sc.nextDouble();
			if(t<=0) {
				System.out.println("error,please reinput:");
			}
			else {
				break;
			}
		}
		return t;
	}
	public boolean addSong() {
		System.out.println("��ʼ��Ӹ�����");
		Scanner sc = new Scanner(System.in);
		String Sname = getUserString(sc,"����");
		String SPlayer  = getUserString(sc,"����");
		double STime = getUseNumber(sc);
		
		Song song = new Song(Sname,SPlayer,STime);
		Master.listSong.add(song);
		return true;
	}

}
