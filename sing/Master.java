package sing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Master {
	public static List<Song> listSong;
	public Master() {
		listSong = new ArrayList<>();
	}
	public boolean play(){
		if(listSong.size()==0){
			System.out.println("无可播放的歌曲");
			return false;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("您是要顺序播放还是挑选播放（顺序输入1，挑选输入2）：");
		String message = sc.next();
		if("1".equals(message)){
			playerOneSong(0);
		}else if("2".equals(message)){
			System.out.println("请选择要播放的歌曲编号，可选编号1~"+listSong.size());
			if(sc.hasNextInt()){
				int number = sc.nextInt();
				if(number>=1&&number<=listSong.size()){
					playerOneSong(number-1);
				}else{
					System.out.println("播放超范围！");
					return false;
				}
			}else{
				System.out.println("输入错误！");
				return false;
			}
		}else{
			System.out.println("功能挑选错误！");
			return false;
		}
		return true;
	}

	public void playerOneSong(int number){
		Song song = listSong.get(number);
		System.out.println("播放"+song.SPlayer+"延长的"+song.Sname+"，耗时："+song.STime);
		listSong.remove(number);
	}

}
