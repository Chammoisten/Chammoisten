
public class GuessGame {
	//��3��ʵ�������ֱ��ʾ3��player����
	 Player p1;
	 Player p2;
	 Player p3;
	 public void startGame(){
	  //����player����
	  p1= new Player();
	  p2 = new Player();
	  p3= new Player();
	  //����3�������������Ƿ����
	  int guessp1 = 0;
	  int guessp2 =0;
	  int guessp3 = 0;
	  //����3������������²������
	  boolean p1isright = false;
	  boolean p2isright =false;
	  boolean p3isright =false;
	  int tarnum =(int)(Math.random()*30); //�����յ�����
	  System.out.println("i guess 1 to 30");
	  while(true)
	  {
	   System.out.println("number to guess is "+tarnum);
	   p1.guess(); //����Player��guess����
	   p2.guess();
	   p3.guess();
	   //ȡ��ÿ��player���²�����ֽ����г�
	   guessp1 =p1.number;
	   System.out.println("one "+guessp1 );
	   guessp2 = p2.number;
	   System.out.println("two "+guessp2);
	   guessp3=p3.number;
	   System.out.println("three "+guessp3);
	   //����Ƿ���У�
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
	   //�������һ�����߶��...
	   if(p1isright||p2isright||p3isright)
	   {
	    System.out.println("we are a winner");
	    System.out.println("one "+p1isright);
	    System.out.println("two "+p2isright);
	    System.out.println("three "+p3isright);
	    System.out.println("game is over"); 
	    break; //��Ϊ����whileΪtrue,���Ի�һֱִ��,ֱ��if���Ϊ��,ִ�������break�Ż����ѭ��
	  }
	  else
	   {System.out.println("123");}
	 } 
	}
}