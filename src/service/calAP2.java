package service;
//等差数列求和2

public class calAP2 {
	
	private double result;
	
	public void cal(double a1,double an,double n){
		result = (a1 + an)*n/2;
	}
	
	public double getResult(){
		return result;
	}
	
}
