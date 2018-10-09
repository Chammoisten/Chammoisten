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
		System.out.println("开始添加歌曲：");
		Scanner sc = new Scanner(System.in);
		String Sname = getUserString(sc,"歌曲");
		String SPlayer  = getUserString(sc,"歌手");
		double STime = getUseNumber(sc);
		
		Song song = new Song(Sname,SPlayer,STime);
		Master.listSong.add(song);
		return true;
	}

}
