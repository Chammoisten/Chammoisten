import java.util.Date;

/**
 * 经理类
 * @see Employee
 */
public class Leader extends Employee{

	private double bonus;  //奖金

	/**
	 * 初始化员工基本信息
	 * 并设置奖金固定为5000
	 */
	public Leader(String name,double wages,Date birthday){
		super(name,wages,birthday);
		bonus = 5000;
		this.type = 2;
	}

	/**
	 * 发工资和奖金的方法
	 * @return double 发工资的金额+奖金
	 */
	public double getWages(){
		String message = name+"当月应发工资："+wages+",实发工资："+wages+",奖金："+bonus;
		System.out.println(message);
		return wages+bonus;
	}

}