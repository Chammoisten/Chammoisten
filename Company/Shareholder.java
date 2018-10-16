import java.util.Set;
import java.util.Date;

/**
 * 股东类
 * @see Employee
 */
public class Shareholder extends Employee{

	private double shares;  //占有股份

	/**
	 * 初始化员工基本信息
	 * 并设置股东股份
	 */
	public Shareholder(String name,double wages,Date birthday,double shares){
		super(name,wages,birthday);
		this.shares = shares;
		this.type = 3;
	}

	/**
	 * 检查股份总和不能大于100%
	 * @param shares 新入股东的股份
	 * @param employeeSet 员工集合
	 * @return boolean 不大于返回true，否则返回false
	 */
	public boolean checkShares(double shares, Set<Employee> employeeSet){
		double allshares = 0;
		for(Employee employee : employeeSet){
			if(employee.getType()==3){
				Shareholder shareholder = (Shareholder)employee;
				allshares = allshares + shareholder.getShares();
			}
		}
		if((allshares+shares)>1){
			return false;
		}else{
			return true;
		}
	}

	public double getShares(){
		return shares;
	}

}