
public class GuessGame {
	//用3个实例变量分别表示3个player对象
	 Player p1;
	 Player p2;
	 Player p3;
	 public void startGame(){
	  //创建player对象
	  p1= new Player();
	  p2 = new Player();
	  p3= new Player();
	  //定义3个变量来保存是否猜中
	  int guessp1 = 0;
	  int guessp2 =0;
	  int guessp3 = 0;
	  //定义3个变量来保存猜测的数字
	  boolean p1isright = false;
	  boolean p2isright =false;
	  boolean p3isright =false;
	  int tarnum =(int)(Math.random()*30); //产生谜底数字
	  System.out.println("i guess 1 to 30");
	  while(true)
	  {
	   System.out.println("number to guess is "+tarnum);
	   p1.guess(); //调用Player中guess方法
	   p2.guess();
	   p3.guess();
	   //取得每个player所猜测的数字将其列出
	   guessp1 =p1.number;
	   System.out.println("one "+guessp1 );
	   guessp2 = p2.number;
	   System.out.println("two "+guessp2);
	   guessp3=p3.number;
	   System.out.println("three "+guessp3);
	   //检查是否猜中，
	   if (guessp1==tarnum) 
	   {
	    p1isright=true;
	   }
	   if (guessp2==tarnum)
	   {
	    p2isright=true;
	    }
	   if (guessp3==tarnum)
	   {
	    p3isright=true;
	   }
	   //如果猜中一个或者多个...
	   if(p1isright||p2isright||p3isright)
	   {
	    System.out.println("we are a winner");
	    System.out.println("one "+p1isright);
	    System.out.println("two "+p2isright);
	    System.out.println("three "+p3isright);
	    System.out.println("game is over"); 
	    break; //因为上面while为true,所以会一直执行,直到if语句为真,执行下面的break才会结束循环
	  }
	  else
	   {System.out.println("123");}
	 } 
	}
}