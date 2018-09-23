
public class Player {
	int number = 0; //要被猜的数字
	 public void guess(){
	  number =(int )(Math.random()*30);
	  System.out.println("i guessing"+number);
	 }
}