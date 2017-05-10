package service;
//计算个人所得税

public class calTax {
	
	private static double result;
	
	public void cal(double income){
		if (income <= 0) {
			throw new IllegalArgumentException();
		}else if (income > 0 && income <3000) {
			result = income * 0.03;
		}else if(income>=3000 &&income <6000){
			result = income * 0.04;
		}else if(income >=6000){
			result = income * 0.05;
		}
	}
	
	public double getResult(){
		return result;
	}
	
}
