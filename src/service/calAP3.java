package service;
//等差数列求和3

public class calAP3 {
	
	private double result;
	
	public void cal(double a, double b,double n){
		result = a*n*n + b*n;
	}
	
	public double getResult(){
		return result;
	}
	
}
